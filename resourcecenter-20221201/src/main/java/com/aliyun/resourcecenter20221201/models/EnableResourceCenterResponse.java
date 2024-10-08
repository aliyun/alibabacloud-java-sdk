// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class EnableResourceCenterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableResourceCenterResponseBody body;

    public static EnableResourceCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceCenterResponse self = new EnableResourceCenterResponse();
        return TeaModel.build(map, self);
    }

    public EnableResourceCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableResourceCenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableResourceCenterResponse setBody(EnableResourceCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableResourceCenterResponseBody getBody() {
        return this.body;
    }

}
