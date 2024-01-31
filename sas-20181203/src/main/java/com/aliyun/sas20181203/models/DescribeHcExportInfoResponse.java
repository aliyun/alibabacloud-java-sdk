// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHcExportInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHcExportInfoResponseBody body;

    public static DescribeHcExportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHcExportInfoResponse self = new DescribeHcExportInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHcExportInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHcExportInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHcExportInfoResponse setBody(DescribeHcExportInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHcExportInfoResponseBody getBody() {
        return this.body;
    }

}
