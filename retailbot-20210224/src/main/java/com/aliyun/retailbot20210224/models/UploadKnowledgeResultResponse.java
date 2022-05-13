// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UploadKnowledgeResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadKnowledgeResultResponseBody body;

    public static UploadKnowledgeResultResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadKnowledgeResultResponse self = new UploadKnowledgeResultResponse();
        return TeaModel.build(map, self);
    }

    public UploadKnowledgeResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadKnowledgeResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadKnowledgeResultResponse setBody(UploadKnowledgeResultResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadKnowledgeResultResponseBody getBody() {
        return this.body;
    }

}
