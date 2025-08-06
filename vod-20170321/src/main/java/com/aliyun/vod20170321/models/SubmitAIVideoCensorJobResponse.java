// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCensorJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIVideoCensorJobResponseBody body;

    public static SubmitAIVideoCensorJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCensorJobResponse self = new SubmitAIVideoCensorJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoCensorJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIVideoCensorJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIVideoCensorJobResponse setBody(SubmitAIVideoCensorJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIVideoCensorJobResponseBody getBody() {
        return this.body;
    }

}
