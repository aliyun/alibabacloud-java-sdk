// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningExportInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWarningExportInfoResponseBody body;

    public static DescribeWarningExportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarningExportInfoResponse self = new DescribeWarningExportInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWarningExportInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWarningExportInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWarningExportInfoResponse setBody(DescribeWarningExportInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWarningExportInfoResponseBody getBody() {
        return this.body;
    }

}
