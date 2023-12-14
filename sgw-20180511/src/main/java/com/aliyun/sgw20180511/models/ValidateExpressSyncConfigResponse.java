// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ValidateExpressSyncConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateExpressSyncConfigResponseBody body;

    public static ValidateExpressSyncConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateExpressSyncConfigResponse self = new ValidateExpressSyncConfigResponse();
        return TeaModel.build(map, self);
    }

    public ValidateExpressSyncConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateExpressSyncConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateExpressSyncConfigResponse setBody(ValidateExpressSyncConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateExpressSyncConfigResponseBody getBody() {
        return this.body;
    }

}
