// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateTensorboardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateTensorboardResponse setBody(UpdateTensorboardResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTensorboardResponseBody getBody() {
        return this.body;
    }

}
