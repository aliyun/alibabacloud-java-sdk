// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SubmitPreprocessJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitPreprocessJobsResponse setBody(SubmitPreprocessJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPreprocessJobsResponseBody getBody() {
        return this.body;
    }

}
