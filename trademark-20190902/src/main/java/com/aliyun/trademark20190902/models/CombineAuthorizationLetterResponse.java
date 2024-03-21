// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CombineAuthorizationLetterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CombineAuthorizationLetterResponseBody body;

    public static CombineAuthorizationLetterResponse build(java.util.Map<String, ?> map) throws Exception {
        CombineAuthorizationLetterResponse self = new CombineAuthorizationLetterResponse();
        return TeaModel.build(map, self);
    }

    public CombineAuthorizationLetterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CombineAuthorizationLetterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CombineAuthorizationLetterResponse setBody(CombineAuthorizationLetterResponseBody body) {
        this.body = body;
        return this;
    }
    public CombineAuthorizationLetterResponseBody getBody() {
        return this.body;
    }

}
