// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceAuthConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceAuthConfigResponseBody body;

    public static ModifyInstanceAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAuthConfigResponse self = new ModifyInstanceAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAuthConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAuthConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceAuthConfigResponse setBody(ModifyInstanceAuthConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAuthConfigResponseBody getBody() {
        return this.body;
    }

}
