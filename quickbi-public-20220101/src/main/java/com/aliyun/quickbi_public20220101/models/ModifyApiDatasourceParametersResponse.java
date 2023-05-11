// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyApiDatasourceParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyApiDatasourceParametersResponseBody body;

    public static ModifyApiDatasourceParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiDatasourceParametersResponse self = new ModifyApiDatasourceParametersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApiDatasourceParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApiDatasourceParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApiDatasourceParametersResponse setBody(ModifyApiDatasourceParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiDatasourceParametersResponseBody getBody() {
        return this.body;
    }

}
