// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteMultiAccountDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMultiAccountDeliveryChannelResponseBody body;

    public static DeleteMultiAccountDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiAccountDeliveryChannelResponse self = new DeleteMultiAccountDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultiAccountDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultiAccountDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultiAccountDeliveryChannelResponse setBody(DeleteMultiAccountDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultiAccountDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
