// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTranscodeJobsResponseBody body;

    public static SubmitTranscodeJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobsResponse self = new SubmitTranscodeJobsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTranscodeJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTranscodeJobsResponse setBody(SubmitTranscodeJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTranscodeJobsResponseBody getBody() {
        return this.body;
    }

}
