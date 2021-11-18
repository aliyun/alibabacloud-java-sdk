// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListNetworkSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNetworkSecurityGroupsResponseBody body;

    public static ListNetworkSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkSecurityGroupsResponse self = new ListNetworkSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkSecurityGroupsResponse setBody(ListNetworkSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}
