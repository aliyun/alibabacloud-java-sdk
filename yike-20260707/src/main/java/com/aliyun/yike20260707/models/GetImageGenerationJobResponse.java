// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetImageGenerationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageGenerationJobResponseBody body;

    public static GetImageGenerationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageGenerationJobResponse self = new GetImageGenerationJobResponse();
        return TeaModel.build(map, self);
    }

    public GetImageGenerationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageGenerationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageGenerationJobResponse setBody(GetImageGenerationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageGenerationJobResponseBody getBody() {
        return this.body;
    }

}
