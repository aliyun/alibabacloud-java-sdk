// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountDeliveryChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultiAccountDeliveryChannelsResponseBody body;

    public static ListMultiAccountDeliveryChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountDeliveryChannelsResponse self = new ListMultiAccountDeliveryChannelsResponse();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountDeliveryChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultiAccountDeliveryChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultiAccountDeliveryChannelsResponse setBody(ListMultiAccountDeliveryChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultiAccountDeliveryChannelsResponseBody getBody() {
        return this.body;
    }

}
