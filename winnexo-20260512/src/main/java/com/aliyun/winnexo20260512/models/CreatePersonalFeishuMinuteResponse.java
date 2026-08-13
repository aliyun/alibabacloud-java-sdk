// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFeishuMinuteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalFeishuMinuteResponseBody body;

    public static CreatePersonalFeishuMinuteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFeishuMinuteResponse self = new CreatePersonalFeishuMinuteResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFeishuMinuteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalFeishuMinuteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalFeishuMinuteResponse setBody(CreatePersonalFeishuMinuteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalFeishuMinuteResponseBody getBody() {
        return this.body;
    }

}
