// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateClusterUserResponseBody body;

    public static UpdateClusterUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterUserResponse self = new UpdateClusterUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterUserResponse setBody(UpdateClusterUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterUserResponseBody getBody() {
        return this.body;
    }

}
