// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUserSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserSettingResponseBody body;

    public static CreateUserSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserSettingResponse self = new CreateUserSettingResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserSettingResponse setBody(CreateUserSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserSettingResponseBody getBody() {
        return this.body;
    }

}
