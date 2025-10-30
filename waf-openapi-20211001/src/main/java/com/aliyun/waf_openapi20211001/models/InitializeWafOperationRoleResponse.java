// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class InitializeWafOperationRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitializeWafOperationRoleResponseBody body;

    public static InitializeWafOperationRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeWafOperationRoleResponse self = new InitializeWafOperationRoleResponse();
        return TeaModel.build(map, self);
    }

    public InitializeWafOperationRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeWafOperationRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeWafOperationRoleResponse setBody(InitializeWafOperationRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeWafOperationRoleResponseBody getBody() {
        return this.body;
    }

}
