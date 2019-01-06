package com.lee.project.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ReqContentDto {

    private String date;
    private List<ChannelDto> channels;
}
