// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountDeliveryChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiAccountDeliveryChannelResponseBody body;

    public static GetMultiAccountDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountDeliveryChannelResponse self = new GetMultiAccountDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountDeliveryChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiAccountDeliveryChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiAccountDeliveryChannelResponse setBody(GetMultiAccountDeliveryChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiAccountDeliveryChannelResponseBody getBody() {
        return this.body;
    }

}
