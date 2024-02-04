// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ForceUploadTrademarkOnsaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ForceUploadTrademarkOnsaleResponseBody body;

    public static ForceUploadTrademarkOnsaleResponse build(java.util.Map<String, ?> map) throws Exception {
        ForceUploadTrademarkOnsaleResponse self = new ForceUploadTrademarkOnsaleResponse();
        return TeaModel.build(map, self);
    }

    public ForceUploadTrademarkOnsaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForceUploadTrademarkOnsaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForceUploadTrademarkOnsaleResponse setBody(ForceUploadTrademarkOnsaleResponseBody body) {
        this.body = body;
        return this;
    }
    public ForceUploadTrademarkOnsaleResponseBody getBody() {
        return this.body;
    }

}
