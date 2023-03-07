// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DisableResourceCenterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableResourceCenterResponseBody body;

    public static DisableResourceCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableResourceCenterResponse self = new DisableResourceCenterResponse();
        return TeaModel.build(map, self);
    }

    public DisableResourceCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableResourceCenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableResourceCenterResponse setBody(DisableResourceCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableResourceCenterResponseBody getBody() {
        return this.body;
    }

}
