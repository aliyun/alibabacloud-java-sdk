// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteComfyProductionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteComfyProductionResponseBody body;

    public static DeleteComfyProductionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComfyProductionResponse self = new DeleteComfyProductionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComfyProductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComfyProductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteComfyProductionResponse setBody(DeleteComfyProductionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComfyProductionResponseBody getBody() {
        return this.body;
    }

}
