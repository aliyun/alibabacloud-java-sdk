// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class UploadTranslationFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadTranslationFileResponseBody body;

    public static UploadTranslationFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadTranslationFileResponse self = new UploadTranslationFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadTranslationFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadTranslationFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadTranslationFileResponse setBody(UploadTranslationFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadTranslationFileResponseBody getBody() {
        return this.body;
    }

}
