package com.example.auth.domain.user;

import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.Comparator;

public record AuthenticationDTO(String login, String password) {

}
