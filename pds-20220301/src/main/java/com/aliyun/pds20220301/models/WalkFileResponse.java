// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class WalkFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public WalkFileResponseBody body;

    public static WalkFileResponse build(java.util.Map<String, ?> map) throws Exception {
        WalkFileResponse self = new WalkFileResponse();
        return TeaModel.build(map, self);
    }

    public WalkFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WalkFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WalkFileResponse setBody(WalkFileResponseBody body) {
        this.body = body;
        return this;
    }
    public WalkFileResponseBody getBody() {
        return this.body;
    }

}
