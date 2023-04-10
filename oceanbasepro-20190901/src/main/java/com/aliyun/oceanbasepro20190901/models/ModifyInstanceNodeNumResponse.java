// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceNodeNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceNodeNumResponseBody body;

    public static ModifyInstanceNodeNumResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNodeNumResponse self = new ModifyInstanceNodeNumResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNodeNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceNodeNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceNodeNumResponse setBody(ModifyInstanceNodeNumResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceNodeNumResponseBody getBody() {
        return this.body;
    }

}
