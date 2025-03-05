// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamResourceDiscoveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpamResourceDiscoveryResponseBody body;

    public static CreateIpamResourceDiscoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamResourceDiscoveryResponse self = new CreateIpamResourceDiscoveryResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpamResourceDiscoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpamResourceDiscoveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpamResourceDiscoveryResponse setBody(CreateIpamResourceDiscoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpamResourceDiscoveryResponseBody getBody() {
        return this.body;
    }

}
