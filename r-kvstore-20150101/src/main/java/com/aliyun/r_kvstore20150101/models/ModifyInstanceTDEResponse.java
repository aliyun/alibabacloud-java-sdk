// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTDEResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceTDEResponseBody body;

    public static ModifyInstanceTDEResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTDEResponse self = new ModifyInstanceTDEResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTDEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceTDEResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceTDEResponse setBody(ModifyInstanceTDEResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceTDEResponseBody getBody() {
        return this.body;
    }

}
