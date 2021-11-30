// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateTemplateScratchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTemplateScratchResponseBody body;

    public static CreateTemplateScratchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateScratchResponse self = new CreateTemplateScratchResponse();
        return TeaModel.build(map, self);
    }

    public CreateTemplateScratchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTemplateScratchResponse setBody(CreateTemplateScratchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTemplateScratchResponseBody getBody() {
        return this.body;
    }

}
