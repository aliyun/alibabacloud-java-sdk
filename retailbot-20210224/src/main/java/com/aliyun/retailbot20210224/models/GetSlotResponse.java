// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetSlotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSlotResponseBody body;

    public static GetSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSlotResponse self = new GetSlotResponse();
        return TeaModel.build(map, self);
    }

    public GetSlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSlotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSlotResponse setBody(GetSlotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSlotResponseBody getBody() {
        return this.body;
    }

}
