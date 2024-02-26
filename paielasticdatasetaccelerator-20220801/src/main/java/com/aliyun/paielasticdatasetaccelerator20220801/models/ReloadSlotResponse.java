// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ReloadSlotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReloadSlotResponseBody body;

    public static ReloadSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        ReloadSlotResponse self = new ReloadSlotResponse();
        return TeaModel.build(map, self);
    }

    public ReloadSlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReloadSlotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReloadSlotResponse setBody(ReloadSlotResponseBody body) {
        this.body = body;
        return this;
    }
    public ReloadSlotResponseBody getBody() {
        return this.body;
    }

}
