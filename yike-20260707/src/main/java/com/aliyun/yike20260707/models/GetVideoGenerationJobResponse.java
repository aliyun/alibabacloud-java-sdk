// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoGenerationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoGenerationJobResponseBody body;

    public static GetVideoGenerationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoGenerationJobResponse self = new GetVideoGenerationJobResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoGenerationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoGenerationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoGenerationJobResponse setBody(GetVideoGenerationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoGenerationJobResponseBody getBody() {
        return this.body;
    }

}
