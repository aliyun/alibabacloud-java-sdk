// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SubmitTranscodeJobsResponse setBody(SubmitTranscodeJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTranscodeJobsResponseBody getBody() {
        return this.body;
    }

}
