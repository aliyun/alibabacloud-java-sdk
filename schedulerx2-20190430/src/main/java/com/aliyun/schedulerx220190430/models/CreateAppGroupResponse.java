// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppGroupResponseBody body;

    public static CreateAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupResponse self = new CreateAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppGroupResponse setBody(CreateAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppGroupResponseBody getBody() {
        return this.body;
    }

}
