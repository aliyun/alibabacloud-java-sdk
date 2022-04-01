// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteClusterUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClusterUserResponseBody body;

    public static DeleteClusterUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterUserResponse self = new DeleteClusterUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterUserResponse setBody(DeleteClusterUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterUserResponseBody getBody() {
        return this.body;
    }

}
