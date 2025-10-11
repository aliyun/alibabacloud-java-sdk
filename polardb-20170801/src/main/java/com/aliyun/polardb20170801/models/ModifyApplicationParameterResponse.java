// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApplicationParameterResponseBody body;

    public static ModifyApplicationParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationParameterResponse self = new ModifyApplicationParameterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApplicationParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApplicationParameterResponse setBody(ModifyApplicationParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApplicationParameterResponseBody getBody() {
        return this.body;
    }

}
