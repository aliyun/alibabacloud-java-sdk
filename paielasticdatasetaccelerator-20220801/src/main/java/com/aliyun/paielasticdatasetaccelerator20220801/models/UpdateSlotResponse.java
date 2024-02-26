// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class UpdateSlotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSlotResponseBody body;

    public static UpdateSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlotResponse self = new UpdateSlotResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSlotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSlotResponse setBody(UpdateSlotResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSlotResponseBody getBody() {
        return this.body;
    }

}
