// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CancelGenerationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelGenerationJobResponseBody body;

    public static CancelGenerationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelGenerationJobResponse self = new CancelGenerationJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelGenerationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelGenerationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelGenerationJobResponse setBody(CancelGenerationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelGenerationJobResponseBody getBody() {
        return this.body;
    }

}
