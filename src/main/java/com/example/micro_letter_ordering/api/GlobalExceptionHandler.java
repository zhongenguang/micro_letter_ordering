package com.example.micro_letter_ordering.api;


import com.example.micro_letter_ordering.result.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

//@RestControllerAdvice
public class GlobalExceptionHandler {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 所有异常报错
     *
     * @param request
     * @param exception
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    public ServerResponse allExceptionHandler(HttpServletRequest request,
                                              Exception exception) throws Exception {

     /*   LogUtils.error(logger, "0", request.getRemoteAddr(), "", "",
                -1, exception.toString());*/

        return ServerResponse.createByErrorMessage("服务器异常，请联系管理员");
    }

}