// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListDeliveryChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeliveryChannelsResponseBody body;

    public static ListDeliveryChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryChannelsResponse self = new ListDeliveryChannelsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeliveryChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeliveryChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeliveryChannelsResponse setBody(ListDeliveryChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeliveryChannelsResponseBody getBody() {
        return this.body;
    }

}
