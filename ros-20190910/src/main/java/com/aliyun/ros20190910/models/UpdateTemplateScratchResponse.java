// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateScratchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateTemplateScratchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTemplateScratchResponse setBody(UpdateTemplateScratchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTemplateScratchResponseBody getBody() {
        return this.body;
    }

}
