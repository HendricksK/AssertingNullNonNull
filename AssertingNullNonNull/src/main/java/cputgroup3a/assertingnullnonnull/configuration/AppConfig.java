/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.assertingnullnonnull.configuration;

/**
 *
 * @author kurvin
 */

import cputgroup3a.assertingnullnonnull.service.AssertingNullNonNull;
import cputgroup3a.assertingnullnonnull.service.Impl.AssertingNullNonNullImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppConfig {
    @Bean (name="Ann")
    public AssertingNullNonNull getService(){
        return new AssertingNullNonNullImpl();
    }
}
