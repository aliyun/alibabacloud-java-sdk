// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class StopSlotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopSlotResponseBody body;

    public static StopSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSlotResponse self = new StopSlotResponse();
        return TeaModel.build(map, self);
    }

    public StopSlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSlotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopSlotResponse setBody(StopSlotResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSlotResponseBody getBody() {
        return this.body;
    }

}
