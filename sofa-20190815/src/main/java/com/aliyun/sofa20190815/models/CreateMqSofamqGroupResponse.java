// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateMqSofamqGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMqSofamqGroupResponseBody body;

    public static CreateMqSofamqGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMqSofamqGroupResponse self = new CreateMqSofamqGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateMqSofamqGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMqSofamqGroupResponse setBody(CreateMqSofamqGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMqSofamqGroupResponseBody getBody() {
        return this.body;
    }

}
