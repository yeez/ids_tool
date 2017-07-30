package com.cloud.police.IDSTool.web;

import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@Description("Provides API for IdsServiceController Component")
@RequestMapping(value = "/v1/", produces = MediaType.APPLICATION_JSON_VALUE)
public class IdsServiceController {

}
