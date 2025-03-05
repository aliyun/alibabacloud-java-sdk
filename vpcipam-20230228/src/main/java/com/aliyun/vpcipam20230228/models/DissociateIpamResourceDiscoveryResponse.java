// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DissociateIpamResourceDiscoveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateIpamResourceDiscoveryResponseBody body;

    public static DissociateIpamResourceDiscoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateIpamResourceDiscoveryResponse self = new DissociateIpamResourceDiscoveryResponse();
        return TeaModel.build(map, self);
    }

    public DissociateIpamResourceDiscoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateIpamResourceDiscoveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateIpamResourceDiscoveryResponse setBody(DissociateIpamResourceDiscoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateIpamResourceDiscoveryResponseBody getBody() {
        return this.body;
    }

}
