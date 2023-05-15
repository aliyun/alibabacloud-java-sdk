// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateDingTalkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateDingTalkResponseBody body;

    public static CreateOrUpdateDingTalkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateDingTalkResponse self = new CreateOrUpdateDingTalkResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateDingTalkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateDingTalkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateDingTalkResponse setBody(CreateOrUpdateDingTalkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateDingTalkResponseBody getBody() {
        return this.body;
    }

}
