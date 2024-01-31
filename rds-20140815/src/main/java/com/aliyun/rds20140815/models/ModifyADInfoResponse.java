// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyADInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyADInfoResponseBody body;

    public static ModifyADInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyADInfoResponse self = new ModifyADInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyADInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyADInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyADInfoResponse setBody(ModifyADInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyADInfoResponseBody getBody() {
        return this.body;
    }

}
