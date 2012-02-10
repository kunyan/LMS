package org.yankun.lms.security;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jasig.cas.client.validation.Assertion;
import org.springframework.security.cas.userdetails.AbstractCasAssertionUserDetailsService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

public class UserDetailsService extends AbstractCasAssertionUserDetailsService{

	private static final String NON_EXISTENT_PASSWORD_VALUE = "NO_PASSWORD";

    private String[] attributes;

    private boolean convertToUpperCase = true;

    public UserDetailsService(final String[] attributes) {
        Assert.notNull(attributes, "attributes cannot be null.");
        Assert.isTrue(attributes.length > 0, "At least one attribute is required to retrieve roles from.");
        this.attributes = attributes;
    }

    @Override
    protected UserDetails loadUserDetails(final Assertion assertion) {
        final List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<SimpleGrantedAuthority>();

        Map attributes = assertion.getPrincipal().getAttributes();

    	System.out.println(attributes.get("userid"));
    	System.out.println(attributes.get("email"));
    	System.out.println(attributes.get("role_name"));

        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        return new User(assertion.getPrincipal().getName(), NON_EXISTENT_PASSWORD_VALUE, true, true, true, true, grantedAuthorities);
    }

    /**
     * Converts the returned attribute values to uppercase values.
     *
     * @param convertToUpperCase true if it should convert, false otherwise.
     */
    public void setConvertToUpperCase(final boolean convertToUpperCase) {
        this.convertToUpperCase = convertToUpperCase;
    }
}
