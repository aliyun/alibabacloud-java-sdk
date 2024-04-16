// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class DescribeFileReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFileReportResponseBody body;

    public static DescribeFileReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileReportResponse self = new DescribeFileReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileReportResponse setBody(DescribeFileReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileReportResponseBody getBody() {
        return this.body;
    }

}
