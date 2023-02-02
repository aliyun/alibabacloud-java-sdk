// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendTopicInputTpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsTrendTopicInputTpsResponseBody body;

    public static OnsTrendTopicInputTpsResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendTopicInputTpsResponse self = new OnsTrendTopicInputTpsResponse();
        return TeaModel.build(map, self);
    }

    public OnsTrendTopicInputTpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTrendTopicInputTpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsTrendTopicInputTpsResponse setBody(OnsTrendTopicInputTpsResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTrendTopicInputTpsResponseBody getBody() {
        return this.body;
    }

}
