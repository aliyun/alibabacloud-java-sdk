// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteTemplateScratchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTemplateScratchResponseBody body;

    public static DeleteTemplateScratchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateScratchResponse self = new DeleteTemplateScratchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateScratchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTemplateScratchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTemplateScratchResponse setBody(DeleteTemplateScratchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTemplateScratchResponseBody getBody() {
        return this.body;
    }

}
