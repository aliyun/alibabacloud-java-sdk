// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeVideoCloneJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitYikeVideoCloneJobResponseBody body;

    public static SubmitYikeVideoCloneJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeVideoCloneJobResponse self = new SubmitYikeVideoCloneJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitYikeVideoCloneJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitYikeVideoCloneJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitYikeVideoCloneJobResponse setBody(SubmitYikeVideoCloneJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitYikeVideoCloneJobResponseBody getBody() {
        return this.body;
    }

}
