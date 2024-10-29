// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamDiscoveredResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpamDiscoveredResourceResponseBody body;

    public static ListIpamDiscoveredResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpamDiscoveredResourceResponse self = new ListIpamDiscoveredResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListIpamDiscoveredResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpamDiscoveredResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpamDiscoveredResourceResponse setBody(ListIpamDiscoveredResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpamDiscoveredResourceResponseBody getBody() {
        return this.body;
    }

}
