// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class AssociateIpamResourceDiscoveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateIpamResourceDiscoveryResponseBody body;

    public static AssociateIpamResourceDiscoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateIpamResourceDiscoveryResponse self = new AssociateIpamResourceDiscoveryResponse();
        return TeaModel.build(map, self);
    }

    public AssociateIpamResourceDiscoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateIpamResourceDiscoveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateIpamResourceDiscoveryResponse setBody(AssociateIpamResourceDiscoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateIpamResourceDiscoveryResponseBody getBody() {
        return this.body;
    }

}
