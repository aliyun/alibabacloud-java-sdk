// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTensorboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Tensorboard body;

    public static GetTensorboardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTensorboardResponse self = new GetTensorboardResponse();
        return TeaModel.build(map, self);
    }

    public GetTensorboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTensorboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTensorboardResponse setBody(Tensorboard body) {
        this.body = body;
        return this;
    }
    public Tensorboard getBody() {
        return this.body;
    }

}
