// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitPreprocessJobsConsoleResponseBody body;

    public static SubmitPreprocessJobsConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreprocessJobsConsoleResponse self = new SubmitPreprocessJobsConsoleResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPreprocessJobsConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPreprocessJobsConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitPreprocessJobsConsoleResponse setBody(SubmitPreprocessJobsConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPreprocessJobsConsoleResponseBody getBody() {
        return this.body;
    }

}
