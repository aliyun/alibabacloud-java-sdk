// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceSpecResponseBody body;

    public static ModifyInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecResponse self = new ModifyInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceSpecResponse setBody(ModifyInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceSpecResponseBody getBody() {
        return this.body;
    }

}
