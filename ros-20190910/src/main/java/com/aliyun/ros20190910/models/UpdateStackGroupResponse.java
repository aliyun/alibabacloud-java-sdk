// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStackGroupResponseBody body;

    public static UpdateStackGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackGroupResponse self = new UpdateStackGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStackGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStackGroupResponse setBody(UpdateStackGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStackGroupResponseBody getBody() {
        return this.body;
    }

}
