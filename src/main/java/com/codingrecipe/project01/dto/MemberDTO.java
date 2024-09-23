package com.codingrecipe.project01.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {
    private Long id;
    private String memberName;
    private String memberPassword;
    private String memberEmail;
    private int memberAge;
    private String memberMobile;
}
