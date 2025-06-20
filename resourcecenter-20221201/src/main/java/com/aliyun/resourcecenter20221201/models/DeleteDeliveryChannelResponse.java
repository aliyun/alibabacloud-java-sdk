// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeliveryChannelResponseBody body;

    public static DeleteDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryChannelResponse self = new DeleteDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeliveryChannelResponse setBody(DeleteDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
