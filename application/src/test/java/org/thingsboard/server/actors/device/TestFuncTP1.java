package org.thingsboard.server.actors.device;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class TestFuncTP1 {

    @Test
    void shouldWarnWhenEnvIsMissing() {
        String message = TP1_FUNC.check_env();

        Assertions.assertEquals("[CustomFeature] WARNING: TB_ENV is not set. Default behavior will be used.", message);
    }
}

