// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceDiscoveryAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpamResourceDiscoveryAssociationsResponseBody body;

    public static ListIpamResourceDiscoveryAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpamResourceDiscoveryAssociationsResponse self = new ListIpamResourceDiscoveryAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public ListIpamResourceDiscoveryAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpamResourceDiscoveryAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpamResourceDiscoveryAssociationsResponse setBody(ListIpamResourceDiscoveryAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpamResourceDiscoveryAssociationsResponseBody getBody() {
        return this.body;
    }

}
