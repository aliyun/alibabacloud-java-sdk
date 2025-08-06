// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ReportUploadProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportUploadProgressResponseBody body;

    public static ReportUploadProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportUploadProgressResponse self = new ReportUploadProgressResponse();
        return TeaModel.build(map, self);
    }

    public ReportUploadProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportUploadProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportUploadProgressResponse setBody(ReportUploadProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportUploadProgressResponseBody getBody() {
        return this.body;
    }

}
