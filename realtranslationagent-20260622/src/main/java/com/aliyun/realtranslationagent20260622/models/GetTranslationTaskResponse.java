// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetTranslationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTranslationTaskResponseBody body;

    public static GetTranslationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranslationTaskResponse self = new GetTranslationTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTranslationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranslationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTranslationTaskResponse setBody(GetTranslationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranslationTaskResponseBody getBody() {
        return this.body;
    }

}
