// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateMultiAccountDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultiAccountDeliveryChannelResponseBody body;

    public static CreateMultiAccountDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiAccountDeliveryChannelResponse self = new CreateMultiAccountDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultiAccountDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultiAccountDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultiAccountDeliveryChannelResponse setBody(CreateMultiAccountDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultiAccountDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
