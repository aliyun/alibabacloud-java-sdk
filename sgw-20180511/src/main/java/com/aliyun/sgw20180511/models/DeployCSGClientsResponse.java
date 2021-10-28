// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeployCSGClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployCSGClientsResponseBody body;

    public static DeployCSGClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployCSGClientsResponse self = new DeployCSGClientsResponse();
        return TeaModel.build(map, self);
    }

    public DeployCSGClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployCSGClientsResponse setBody(DeployCSGClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployCSGClientsResponseBody getBody() {
        return this.body;
    }

}
