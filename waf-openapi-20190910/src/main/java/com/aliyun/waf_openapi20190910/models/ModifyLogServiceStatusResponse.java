// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLogServiceStatusResponseBody body;

    public static ModifyLogServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogServiceStatusResponse self = new ModifyLogServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLogServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLogServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLogServiceStatusResponse setBody(ModifyLogServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLogServiceStatusResponseBody getBody() {
        return this.body;
    }

}
