// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTagValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTagValueResponseBody body;

    public static CreateTagValueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTagValueResponse self = new CreateTagValueResponse();
        return TeaModel.build(map, self);
    }

    public CreateTagValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTagValueResponse setBody(CreateTagValueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTagValueResponseBody getBody() {
        return this.body;
    }

}
