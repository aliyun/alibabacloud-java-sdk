// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ClearAccountAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearAccountAliasResponseBody body;

    public static ClearAccountAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearAccountAliasResponse self = new ClearAccountAliasResponse();
        return TeaModel.build(map, self);
    }

    public ClearAccountAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearAccountAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearAccountAliasResponse setBody(ClearAccountAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearAccountAliasResponseBody getBody() {
        return this.body;
    }

}
