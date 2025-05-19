// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateLLMConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLLMConfigResponseBody body;

    public static UpdateLLMConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLLMConfigResponse self = new UpdateLLMConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLLMConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLLMConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLLMConfigResponse setBody(UpdateLLMConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLLMConfigResponseBody getBody() {
        return this.body;
    }

}
