// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyMessagesFeedbacksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMessagesFeedbacksResponseBody body;

    public static ModifyMessagesFeedbacksResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMessagesFeedbacksResponse self = new ModifyMessagesFeedbacksResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMessagesFeedbacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMessagesFeedbacksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMessagesFeedbacksResponse setBody(ModifyMessagesFeedbacksResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMessagesFeedbacksResponseBody getBody() {
        return this.body;
    }

}
