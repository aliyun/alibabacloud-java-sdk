// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExportInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExportInfoResponseBody body;

    public static DescribeExportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportInfoResponse self = new DescribeExportInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExportInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExportInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExportInfoResponse setBody(DescribeExportInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExportInfoResponseBody getBody() {
        return this.body;
    }

}
