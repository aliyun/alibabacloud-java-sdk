// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNodeSpecResponseBody body;

    public static ModifyNodeSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecResponse self = new ModifyNodeSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNodeSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNodeSpecResponse setBody(ModifyNodeSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNodeSpecResponseBody getBody() {
        return this.body;
    }

}
