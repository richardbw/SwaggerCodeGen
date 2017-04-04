package com.accn;

import com.accn.swagger.api.AtmsApiController;
import com.accn.swagger.model.OpenBankingInlineResponse2001;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by richard.barnes-webb on 27/03/2017.
 *
 */
@Controller
public class CustomAPIController extends AtmsApiController {
    private static final Logger log = LoggerFactory.getLogger(CustomAPIController.class);

    @RequestMapping(value = "/atmsXXX", 
            method = RequestMethod.GET)
    public ResponseEntity<OpenBankingInlineResponse2001> atmsGet(String ifModifiedSince, String ifNoneMatch) {
        log.info("............XXXXXXXXXXXXXXXX...............................");
        return new ResponseEntity<OpenBankingInlineResponse2001>(HttpStatus.OK);
    }


    @RequestMapping(value = "/atmsXXX", 
        method = RequestMethod.HEAD)

    public ResponseEntity<Object> atmsHead(@ApiParam(value = "Used for conditional request, to retrieve data only if modified since a given date"  ) @RequestHeader(value="If-Modified-Since", required=false) String ifModifiedSince,
                                           @ApiParam(value = "Used for conditional request, to retrieve data only if the given Etag value does not match"  ) @RequestHeader(value="If-None-Match", required=false) String ifNoneMatch) {
        log.info("............YYYYYYYYYYYYYYYY...............................");
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
