// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class CreateGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGroupIdResponseBody body;

    public static CreateGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupIdResponse self = new CreateGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupIdResponse setBody(CreateGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupIdResponseBody getBody() {
        return this.body;
    }

}
