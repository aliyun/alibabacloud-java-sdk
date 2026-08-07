// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListCloneVoicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloneVoicesResponseBody body;

    public static ListCloneVoicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloneVoicesResponse self = new ListCloneVoicesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloneVoicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloneVoicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloneVoicesResponse setBody(ListCloneVoicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloneVoicesResponseBody getBody() {
        return this.body;
    }

}
