// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateChangeSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateChangeSetResponseBody body;

    public static CreateChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeSetResponse self = new CreateChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateChangeSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChangeSetResponse setBody(CreateChangeSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChangeSetResponseBody getBody() {
        return this.body;
    }

}
