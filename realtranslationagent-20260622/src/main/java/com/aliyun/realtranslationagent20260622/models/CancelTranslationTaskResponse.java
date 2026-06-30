// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class CancelTranslationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelTranslationTaskResponseBody body;

    public static CancelTranslationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelTranslationTaskResponse self = new CancelTranslationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelTranslationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelTranslationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelTranslationTaskResponse setBody(CancelTranslationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelTranslationTaskResponseBody getBody() {
        return this.body;
    }

}
