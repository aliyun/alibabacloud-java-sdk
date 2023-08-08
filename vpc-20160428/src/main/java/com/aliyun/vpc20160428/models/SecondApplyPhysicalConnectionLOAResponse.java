// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class SecondApplyPhysicalConnectionLOAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SecondApplyPhysicalConnectionLOAResponseBody body;

    public static SecondApplyPhysicalConnectionLOAResponse build(java.util.Map<String, ?> map) throws Exception {
        SecondApplyPhysicalConnectionLOAResponse self = new SecondApplyPhysicalConnectionLOAResponse();
        return TeaModel.build(map, self);
    }

    public SecondApplyPhysicalConnectionLOAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SecondApplyPhysicalConnectionLOAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SecondApplyPhysicalConnectionLOAResponse setBody(SecondApplyPhysicalConnectionLOAResponseBody body) {
        this.body = body;
        return this;
    }
    public SecondApplyPhysicalConnectionLOAResponseBody getBody() {
        return this.body;
    }

}
