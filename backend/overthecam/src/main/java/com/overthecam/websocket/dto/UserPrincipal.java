package com.overthecam.websocket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.security.Principal;

@Getter
@AllArgsConstructor
public class UserPrincipal implements Principal {
    private final Long userId;
    private final String email;
    private final String nickname;

    @Override
    public String getName() {
        return nickname;
    }
}
