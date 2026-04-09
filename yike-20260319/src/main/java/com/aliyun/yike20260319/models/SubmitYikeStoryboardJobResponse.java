// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeStoryboardJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitYikeStoryboardJobResponseBody body;

    public static SubmitYikeStoryboardJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeStoryboardJobResponse self = new SubmitYikeStoryboardJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitYikeStoryboardJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitYikeStoryboardJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitYikeStoryboardJobResponse setBody(SubmitYikeStoryboardJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitYikeStoryboardJobResponseBody getBody() {
        return this.body;
    }

}
