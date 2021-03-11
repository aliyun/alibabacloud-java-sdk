// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteVsPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVsPullStreamInfoConfigResponseBody body;

    public static DeleteVsPullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVsPullStreamInfoConfigResponse self = new DeleteVsPullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVsPullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVsPullStreamInfoConfigResponse setBody(DeleteVsPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVsPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
