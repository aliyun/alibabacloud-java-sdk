// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetCMSIdByForeignIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCMSIdByForeignIdResponseBody body;

    public static GetCMSIdByForeignIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCMSIdByForeignIdResponse self = new GetCMSIdByForeignIdResponse();
        return TeaModel.build(map, self);
    }

    public GetCMSIdByForeignIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCMSIdByForeignIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCMSIdByForeignIdResponse setBody(GetCMSIdByForeignIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCMSIdByForeignIdResponseBody getBody() {
        return this.body;
    }

}
