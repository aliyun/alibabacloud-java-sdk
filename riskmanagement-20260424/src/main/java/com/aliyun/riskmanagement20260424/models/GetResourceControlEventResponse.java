// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetResourceControlEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceControlEventResponseBody body;

    public static GetResourceControlEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceControlEventResponse self = new GetResourceControlEventResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceControlEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceControlEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceControlEventResponse setBody(GetResourceControlEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceControlEventResponseBody getBody() {
        return this.body;
    }

}
