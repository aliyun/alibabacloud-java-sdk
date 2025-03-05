// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamResourceDiscoveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpamResourceDiscoveryResponseBody body;

    public static DeleteIpamResourceDiscoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamResourceDiscoveryResponse self = new DeleteIpamResourceDiscoveryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpamResourceDiscoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpamResourceDiscoveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpamResourceDiscoveryResponse setBody(DeleteIpamResourceDiscoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpamResourceDiscoveryResponseBody getBody() {
        return this.body;
    }

}
