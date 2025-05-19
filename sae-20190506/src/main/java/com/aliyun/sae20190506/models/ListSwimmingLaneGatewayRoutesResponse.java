// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGatewayRoutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSwimmingLaneGatewayRoutesResponseBody body;

    public static ListSwimmingLaneGatewayRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneGatewayRoutesResponse self = new ListSwimmingLaneGatewayRoutesResponse();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneGatewayRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSwimmingLaneGatewayRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSwimmingLaneGatewayRoutesResponse setBody(ListSwimmingLaneGatewayRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSwimmingLaneGatewayRoutesResponseBody getBody() {
        return this.body;
    }

}
