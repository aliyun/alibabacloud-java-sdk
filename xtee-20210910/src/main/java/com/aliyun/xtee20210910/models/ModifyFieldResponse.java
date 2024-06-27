// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFieldResponseBody body;

    public static ModifyFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFieldResponse self = new ModifyFieldResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFieldResponse setBody(ModifyFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFieldResponseBody getBody() {
        return this.body;
    }

}
