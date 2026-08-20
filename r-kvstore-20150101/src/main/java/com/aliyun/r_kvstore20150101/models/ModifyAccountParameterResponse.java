// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyAccountParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountParameterResponseBody body;

    public static ModifyAccountParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountParameterResponse self = new ModifyAccountParameterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountParameterResponse setBody(ModifyAccountParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountParameterResponseBody getBody() {
        return this.body;
    }

}
