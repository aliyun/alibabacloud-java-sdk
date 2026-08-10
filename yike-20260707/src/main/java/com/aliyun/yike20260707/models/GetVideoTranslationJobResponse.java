// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoTranslationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoTranslationJobResponseBody body;

    public static GetVideoTranslationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTranslationJobResponse self = new GetVideoTranslationJobResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoTranslationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoTranslationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoTranslationJobResponse setBody(GetVideoTranslationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoTranslationJobResponseBody getBody() {
        return this.body;
    }

}
