// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifySecurityIPListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySecurityIPListResponseBody body;

    public static ModifySecurityIPListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIPListResponse self = new ModifySecurityIPListResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIPListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityIPListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityIPListResponse setBody(ModifySecurityIPListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityIPListResponseBody getBody() {
        return this.body;
    }

}
