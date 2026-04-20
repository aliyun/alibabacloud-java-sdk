// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamDiscoveredIpAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpamDiscoveredIpAddressesResponseBody body;

    public static ListIpamDiscoveredIpAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpamDiscoveredIpAddressesResponse self = new ListIpamDiscoveredIpAddressesResponse();
        return TeaModel.build(map, self);
    }

    public ListIpamDiscoveredIpAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpamDiscoveredIpAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpamDiscoveredIpAddressesResponse setBody(ListIpamDiscoveredIpAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpamDiscoveredIpAddressesResponseBody getBody() {
        return this.body;
    }

}
