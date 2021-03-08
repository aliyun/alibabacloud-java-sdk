// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitPreprocessJobsResponseBody body;

    public static SubmitPreprocessJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreprocessJobsResponse self = new SubmitPreprocessJobsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPreprocessJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPreprocessJobsResponse setBody(SubmitPreprocessJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPreprocessJobsResponseBody getBody() {
        return this.body;
    }

}
