// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SaveModuleSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveModuleSwitchResponseBody body;

    public static SaveModuleSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveModuleSwitchResponse self = new SaveModuleSwitchResponse();
        return TeaModel.build(map, self);
    }

    public SaveModuleSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveModuleSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveModuleSwitchResponse setBody(SaveModuleSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveModuleSwitchResponseBody getBody() {
        return this.body;
    }

}
