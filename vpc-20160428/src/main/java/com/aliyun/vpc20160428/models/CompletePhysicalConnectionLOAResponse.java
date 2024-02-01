// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CompletePhysicalConnectionLOAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompletePhysicalConnectionLOAResponseBody body;

    public static CompletePhysicalConnectionLOAResponse build(java.util.Map<String, ?> map) throws Exception {
        CompletePhysicalConnectionLOAResponse self = new CompletePhysicalConnectionLOAResponse();
        return TeaModel.build(map, self);
    }

    public CompletePhysicalConnectionLOAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompletePhysicalConnectionLOAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompletePhysicalConnectionLOAResponse setBody(CompletePhysicalConnectionLOAResponseBody body) {
        this.body = body;
        return this;
    }
    public CompletePhysicalConnectionLOAResponseBody getBody() {
        return this.body;
    }

}
