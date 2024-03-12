// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ListVpcPeerConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpcPeerConnectionsResponseBody body;

    public static ListVpcPeerConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcPeerConnectionsResponse self = new ListVpcPeerConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcPeerConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcPeerConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcPeerConnectionsResponse setBody(ListVpcPeerConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcPeerConnectionsResponseBody getBody() {
        return this.body;
    }

}
