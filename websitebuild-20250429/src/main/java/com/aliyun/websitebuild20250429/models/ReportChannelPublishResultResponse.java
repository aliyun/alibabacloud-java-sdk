// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ReportChannelPublishResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportChannelPublishResultResponseBody body;

    public static ReportChannelPublishResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportChannelPublishResultResponse self = new ReportChannelPublishResultResponse();
        return TeaModel.build(map, self);
    }

    public ReportChannelPublishResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportChannelPublishResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportChannelPublishResultResponse setBody(ReportChannelPublishResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportChannelPublishResultResponseBody getBody() {
        return this.body;
    }

}
