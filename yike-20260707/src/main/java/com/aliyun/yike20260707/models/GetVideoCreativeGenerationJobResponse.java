// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoCreativeGenerationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoCreativeGenerationJobResponseBody body;

    public static GetVideoCreativeGenerationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCreativeGenerationJobResponse self = new GetVideoCreativeGenerationJobResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoCreativeGenerationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoCreativeGenerationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoCreativeGenerationJobResponse setBody(GetVideoCreativeGenerationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoCreativeGenerationJobResponseBody getBody() {
        return this.body;
    }

}
