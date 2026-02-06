package org.thingsboard.server.actors.device;

import org.springframework.stereotype.Component;

@Component
public class TP1_FUNC {

    public static String check_env() {
        String env = System.getenv("TB_ENV");

        if (env == null || env.isBlank()) {
            return "[CustomFeature] WARNING: TB_ENV is not set. Default behavior will be used.";
        }

        return "[CustomFeature] TB_ENV detected: " + env;
    }

}
