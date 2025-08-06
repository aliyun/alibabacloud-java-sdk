// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCoverJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIVideoCoverJobResponseBody body;

    public static SubmitAIVideoCoverJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCoverJobResponse self = new SubmitAIVideoCoverJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoCoverJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIVideoCoverJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIVideoCoverJobResponse setBody(SubmitAIVideoCoverJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIVideoCoverJobResponseBody getBody() {
        return this.body;
    }

}
