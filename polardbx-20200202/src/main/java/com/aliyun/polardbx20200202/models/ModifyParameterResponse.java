// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyParameterResponseBody body;

    public static ModifyParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterResponse self = new ModifyParameterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyParameterResponse setBody(ModifyParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyParameterResponseBody getBody() {
        return this.body;
    }

}
