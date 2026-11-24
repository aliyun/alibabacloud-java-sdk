// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyAccessConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccessConfigResponseBody body;

    public static ModifyAccessConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessConfigResponse self = new ModifyAccessConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccessConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccessConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccessConfigResponse setBody(ModifyAccessConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccessConfigResponseBody getBody() {
        return this.body;
    }

}
