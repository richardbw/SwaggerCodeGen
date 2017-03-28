package com.accn;

import com.accn.swagger.api.AtmsApiController;
import com.accn.swagger.model.OpenBankingInlineResponse2001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by richard.barnes-webb on 27/03/2017.
 *
 */
@Controller
public class CustomAPIController  {
    private static final Logger log = LoggerFactory.getLogger(CustomAPIController.class);

    @RequestMapping(value = "/atms", params = { "type=42" },
            produces = { "application/prs.openbanking.opendata.v1.3+json" },
            method = RequestMethod.GET)
    public ResponseEntity<OpenBankingInlineResponse2001> atmsGet(String ifModifiedSince, String ifNoneMatch) {
        log.info("............XXXXXXXXXXXXXXXX...............................");
        return new ResponseEntity<OpenBankingInlineResponse2001>(HttpStatus.OK);
    }

}