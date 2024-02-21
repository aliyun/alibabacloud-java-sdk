// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpcEndpointSecurityGroupsResponseBody body;

    public static ListVpcEndpointSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointSecurityGroupsResponse self = new ListVpcEndpointSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointSecurityGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcEndpointSecurityGroupsResponse setBody(ListVpcEndpointSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}
