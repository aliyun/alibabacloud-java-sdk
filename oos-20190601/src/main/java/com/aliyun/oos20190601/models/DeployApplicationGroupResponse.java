// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeployApplicationGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployApplicationGroupResponseBody body;

    public static DeployApplicationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationGroupResponse self = new DeployApplicationGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeployApplicationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployApplicationGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployApplicationGroupResponse setBody(DeployApplicationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployApplicationGroupResponseBody getBody() {
        return this.body;
    }

}
