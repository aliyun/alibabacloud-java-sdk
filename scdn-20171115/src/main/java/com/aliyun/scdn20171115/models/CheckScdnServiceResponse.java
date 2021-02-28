// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class CheckScdnServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckScdnServiceResponseBody body;

    public static CheckScdnServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckScdnServiceResponse self = new CheckScdnServiceResponse();
        return TeaModel.build(map, self);
    }

    public CheckScdnServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckScdnServiceResponse setBody(CheckScdnServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckScdnServiceResponseBody getBody() {
        return this.body;
    }

}
