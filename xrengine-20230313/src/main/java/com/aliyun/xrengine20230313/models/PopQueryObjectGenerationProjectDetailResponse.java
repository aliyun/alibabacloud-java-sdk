// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryObjectGenerationProjectDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopQueryObjectGenerationProjectDetailResponseBody body;

    public static PopQueryObjectGenerationProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        PopQueryObjectGenerationProjectDetailResponse self = new PopQueryObjectGenerationProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public PopQueryObjectGenerationProjectDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopQueryObjectGenerationProjectDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopQueryObjectGenerationProjectDetailResponse setBody(PopQueryObjectGenerationProjectDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public PopQueryObjectGenerationProjectDetailResponseBody getBody() {
        return this.body;
    }

}
