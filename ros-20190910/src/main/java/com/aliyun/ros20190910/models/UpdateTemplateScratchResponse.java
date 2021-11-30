// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateScratchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTemplateScratchResponseBody body;

    public static UpdateTemplateScratchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateScratchResponse self = new UpdateTemplateScratchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateScratchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTemplateScratchResponse setBody(UpdateTemplateScratchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTemplateScratchResponseBody getBody() {
        return this.body;
    }

}
