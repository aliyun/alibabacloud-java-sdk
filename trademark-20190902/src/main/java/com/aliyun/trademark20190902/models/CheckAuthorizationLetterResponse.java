// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckAuthorizationLetterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAuthorizationLetterResponseBody body;

    public static CheckAuthorizationLetterResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAuthorizationLetterResponse self = new CheckAuthorizationLetterResponse();
        return TeaModel.build(map, self);
    }

    public CheckAuthorizationLetterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAuthorizationLetterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAuthorizationLetterResponse setBody(CheckAuthorizationLetterResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAuthorizationLetterResponseBody getBody() {
        return this.body;
    }

}
