package com.lee.project.service;

import com.lee.project.dto.ChannelDto;
import com.lee.project.dto.ContentDto;
import com.lee.project.dto.ReqContentDto;
import com.lee.project.util.ConventerDate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
public class FeedService {

    private final RestTemplate restTemplate;

    @Value("${fever.url}")
    private String serviceUrl;

    public FeedService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ReqContentDto getContent(String contentId) {
        ChannelDto channelDto1 = ChannelDto.builder().data1("123").data2("123").build();
        ChannelDto channelDto2 = ChannelDto.builder().data1("456").data2("789").build();

        List<ChannelDto> channelDtoList = new ArrayList<>();
        channelDtoList.add(channelDto1);
        channelDtoList.add(channelDto2);

        ContentDto contentDto = ContentDto.builder().date(123123L).channels(channelDtoList).build();
        ReqContentDto reqContentDto = ReqContentDto
                .builder()
                .date(ConventerDate.longToTimeString(contentDto.getDate()))
                .channels(channelDtoList)
                .build();


//        HttpHeaders header = new HttpHeaders();
//        header.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_UTF8_VALUE);
//
//
//
//        ResponseEntity<ContentDto> response = new RestTemplate()
//                .exchange("http://headers.jsontest.com/",
//                        HttpMethod.GET, new HttpEntity(header),
//                        ContentDto.class);

        ResponseEntity<ContentDto> response = restTemplate.getForEntity(serviceUrl, ContentDto.class);

        response.getBody().getChannels();




        return reqContentDto;
    }



}
