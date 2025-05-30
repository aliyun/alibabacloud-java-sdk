// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class DeliveryItemDetailSynResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeliveryItemDetailSynResponseBody body;

    public static DeliveryItemDetailSynResponse build(java.util.Map<String, ?> map) throws Exception {
        DeliveryItemDetailSynResponse self = new DeliveryItemDetailSynResponse();
        return TeaModel.build(map, self);
    }

    public DeliveryItemDetailSynResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeliveryItemDetailSynResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeliveryItemDetailSynResponse setBody(DeliveryItemDetailSynResponseBody body) {
        this.body = body;
        return this;
    }
    public DeliveryItemDetailSynResponseBody getBody() {
        return this.body;
    }

}
