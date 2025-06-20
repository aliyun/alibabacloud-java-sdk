// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeliveryChannelResponseBody body;

    public static GetDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryChannelResponse self = new GetDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public GetDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeliveryChannelResponse setBody(GetDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
