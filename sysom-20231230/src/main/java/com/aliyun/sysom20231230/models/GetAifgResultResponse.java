// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAifgResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAifgResultResponseBody body;

    public static GetAifgResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAifgResultResponse self = new GetAifgResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAifgResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAifgResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAifgResultResponse setBody(GetAifgResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAifgResultResponseBody getBody() {
        return this.body;
    }

}
