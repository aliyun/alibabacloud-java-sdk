// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ApplyPhysicalConnectionLOAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyPhysicalConnectionLOAResponseBody body;

    public static ApplyPhysicalConnectionLOAResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPhysicalConnectionLOAResponse self = new ApplyPhysicalConnectionLOAResponse();
        return TeaModel.build(map, self);
    }

    public ApplyPhysicalConnectionLOAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyPhysicalConnectionLOAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyPhysicalConnectionLOAResponse setBody(ApplyPhysicalConnectionLOAResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyPhysicalConnectionLOAResponseBody getBody() {
        return this.body;
    }

}
