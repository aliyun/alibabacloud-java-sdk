// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStackGroupResponseBody body;

    public static CreateStackGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStackGroupResponse self = new CreateStackGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateStackGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStackGroupResponse setBody(CreateStackGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStackGroupResponseBody getBody() {
        return this.body;
    }

}
