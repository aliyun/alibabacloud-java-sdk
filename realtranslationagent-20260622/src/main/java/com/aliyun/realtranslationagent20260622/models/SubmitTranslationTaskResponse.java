// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class SubmitTranslationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTranslationTaskResponseBody body;

    public static SubmitTranslationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranslationTaskResponse self = new SubmitTranslationTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTranslationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTranslationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTranslationTaskResponse setBody(SubmitTranslationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTranslationTaskResponseBody getBody() {
        return this.body;
    }

}
