package com.lee.project.controller;

import com.lee.project.dto.ReqContentDto;
import com.lee.project.service.FeedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FeedController {

    public final FeedService feedService;

    public FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    @GetMapping("/{contentId}")
    public ResponseEntity<ReqContentDto> getContent(@PathVariable("contentId") String contentId){
        log.error(contentId);
        return new ResponseEntity<>(feedService.getContent(contentId), HttpStatus.OK);

    }
}
