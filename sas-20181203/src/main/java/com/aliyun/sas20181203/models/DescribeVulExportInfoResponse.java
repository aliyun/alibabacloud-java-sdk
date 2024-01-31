// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulExportInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulExportInfoResponseBody body;

    public static DescribeVulExportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulExportInfoResponse self = new DescribeVulExportInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulExportInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulExportInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulExportInfoResponse setBody(DescribeVulExportInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulExportInfoResponseBody getBody() {
        return this.body;
    }

}
