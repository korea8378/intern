package com.lee.project.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ContentDto {

    private Long date;

    private List<ChannelDto> channels;
}
