// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupResponseBody body;

    public static UpdateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupResponse self = new UpdateGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupResponse setBody(UpdateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupResponseBody getBody() {
        return this.body;
    }

}
