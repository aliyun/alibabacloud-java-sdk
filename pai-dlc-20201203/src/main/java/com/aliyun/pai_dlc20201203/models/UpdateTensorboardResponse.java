// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateTensorboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTensorboardResponseBody body;

    public static UpdateTensorboardResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTensorboardResponse self = new UpdateTensorboardResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTensorboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTensorboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTensorboardResponse setBody(UpdateTensorboardResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTensorboardResponseBody getBody() {
        return this.body;
    }

}
