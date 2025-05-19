// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteLLMConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLLMConfigResponseBody body;

    public static DeleteLLMConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLLMConfigResponse self = new DeleteLLMConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLLMConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLLMConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLLMConfigResponse setBody(DeleteLLMConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLLMConfigResponseBody getBody() {
        return this.body;
    }

}
