// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class UpdatePropagationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePropagationResponseBody body;

    public static UpdatePropagationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePropagationResponse self = new UpdatePropagationResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePropagationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePropagationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePropagationResponse setBody(UpdatePropagationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePropagationResponseBody getBody() {
        return this.body;
    }

}
