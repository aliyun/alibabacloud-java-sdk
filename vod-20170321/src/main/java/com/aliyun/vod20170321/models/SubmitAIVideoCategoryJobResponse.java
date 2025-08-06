// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCategoryJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIVideoCategoryJobResponseBody body;

    public static SubmitAIVideoCategoryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCategoryJobResponse self = new SubmitAIVideoCategoryJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoCategoryJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIVideoCategoryJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIVideoCategoryJobResponse setBody(SubmitAIVideoCategoryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIVideoCategoryJobResponseBody getBody() {
        return this.body;
    }

}
