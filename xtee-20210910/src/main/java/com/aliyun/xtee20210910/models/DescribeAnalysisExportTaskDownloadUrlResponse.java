// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisExportTaskDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAnalysisExportTaskDownloadUrlResponseBody body;

    public static DescribeAnalysisExportTaskDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisExportTaskDownloadUrlResponse self = new DescribeAnalysisExportTaskDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisExportTaskDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnalysisExportTaskDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAnalysisExportTaskDownloadUrlResponse setBody(DescribeAnalysisExportTaskDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnalysisExportTaskDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
