// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class CreateScreenSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScreenSettingResponseBody body;

    public static CreateScreenSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenSettingResponse self = new CreateScreenSettingResponse();
        return TeaModel.build(map, self);
    }

    public CreateScreenSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScreenSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScreenSettingResponse setBody(CreateScreenSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScreenSettingResponseBody getBody() {
        return this.body;
    }

}
