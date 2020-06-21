package com.hillayes.upstart.web;

import javax.validation.constraints.NotBlank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/api/tests")
public class TestController
{
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Get
    public HttpResponse<String> getAll()
    {
        LOG.debug("Get All");
        return HttpResponse.ok("Hello All");
    }

    @Get("/{id}")
    HttpResponse<String> getUserProfile(@NotBlank @PathVariable("id") long id)
    {
        LOG.debug("Get One {}", Long.valueOf(id));
        return HttpResponse.ok("Hello World " + id);
    }
}
