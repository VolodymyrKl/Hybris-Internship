package com.ciklum.hybris.vkliuiko.security;

import org.junit.Test;
import org.mockito.Mockito;

public class SecuritySessionTest {
    SecuritySession securitySession = Mockito.mock(SecuritySession.class);

    @Test
    public void shouldSetPassword(){
        securitySession.setPassword();
        Mockito.verify(securitySession).setPassword();
    }
}