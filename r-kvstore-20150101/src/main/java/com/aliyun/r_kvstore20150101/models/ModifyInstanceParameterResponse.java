// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceParameterResponseBody body;

    public static ModifyInstanceParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceParameterResponse self = new ModifyInstanceParameterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceParameterResponse setBody(ModifyInstanceParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceParameterResponseBody getBody() {
        return this.body;
    }

}
