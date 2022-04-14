// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ListVpcPeerConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListVpcPeerConnectionsResponse setBody(ListVpcPeerConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcPeerConnectionsResponseBody getBody() {
        return this.body;
    }

}
