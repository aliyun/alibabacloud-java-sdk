// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyDatabaseInstanceParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDatabaseInstanceParameterResponseBody body;

    public static ModifyDatabaseInstanceParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseInstanceParameterResponse self = new ModifyDatabaseInstanceParameterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseInstanceParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDatabaseInstanceParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDatabaseInstanceParameterResponse setBody(ModifyDatabaseInstanceParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDatabaseInstanceParameterResponseBody getBody() {
        return this.body;
    }

}
