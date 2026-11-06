// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifySearchParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySearchParametersResponseBody body;

    public static ModifySearchParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySearchParametersResponse self = new ModifySearchParametersResponse();
        return TeaModel.build(map, self);
    }

    public ModifySearchParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySearchParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySearchParametersResponse setBody(ModifySearchParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySearchParametersResponseBody getBody() {
        return this.body;
    }

}
