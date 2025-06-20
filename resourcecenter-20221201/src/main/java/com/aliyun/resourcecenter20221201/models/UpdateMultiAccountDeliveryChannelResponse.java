// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateMultiAccountDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMultiAccountDeliveryChannelResponseBody body;

    public static UpdateMultiAccountDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiAccountDeliveryChannelResponse self = new UpdateMultiAccountDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMultiAccountDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMultiAccountDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMultiAccountDeliveryChannelResponse setBody(UpdateMultiAccountDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMultiAccountDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
