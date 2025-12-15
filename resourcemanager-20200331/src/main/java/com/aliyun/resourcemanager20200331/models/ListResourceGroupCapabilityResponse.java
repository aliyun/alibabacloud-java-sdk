// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupCapabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceGroupCapabilityResponseBody body;

    public static ListResourceGroupCapabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupCapabilityResponse self = new ListResourceGroupCapabilityResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupCapabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceGroupCapabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceGroupCapabilityResponse setBody(ListResourceGroupCapabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceGroupCapabilityResponseBody getBody() {
        return this.body;
    }

}
