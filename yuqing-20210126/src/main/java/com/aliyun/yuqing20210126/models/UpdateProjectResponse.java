// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class UpdateProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProjectResponseBody body;

    public static UpdateProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectResponse self = new UpdateProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectResponse setBody(UpdateProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectResponseBody getBody() {
        return this.body;
    }

}
