// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteDeployConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeployConfigResponseBody body;

    public static DeleteDeployConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeployConfigResponse self = new DeleteDeployConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeployConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeployConfigResponse setBody(DeleteDeployConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeployConfigResponseBody getBody() {
        return this.body;
    }

}
