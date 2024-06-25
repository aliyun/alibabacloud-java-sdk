// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIpamScopeResponseBody body;

    public static UpdateIpamScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamScopeResponse self = new UpdateIpamScopeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpamScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpamScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpamScopeResponse setBody(UpdateIpamScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpamScopeResponseBody getBody() {
        return this.body;
    }

}
