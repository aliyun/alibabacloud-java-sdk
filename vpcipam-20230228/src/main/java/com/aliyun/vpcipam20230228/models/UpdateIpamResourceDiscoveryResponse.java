// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamResourceDiscoveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIpamResourceDiscoveryResponseBody body;

    public static UpdateIpamResourceDiscoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamResourceDiscoveryResponse self = new UpdateIpamResourceDiscoveryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpamResourceDiscoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpamResourceDiscoveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpamResourceDiscoveryResponse setBody(UpdateIpamResourceDiscoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpamResourceDiscoveryResponseBody getBody() {
        return this.body;
    }

}
