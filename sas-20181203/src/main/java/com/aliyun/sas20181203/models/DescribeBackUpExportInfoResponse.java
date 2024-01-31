// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackUpExportInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackUpExportInfoResponseBody body;

    public static DescribeBackUpExportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackUpExportInfoResponse self = new DescribeBackUpExportInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackUpExportInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackUpExportInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackUpExportInfoResponse setBody(DescribeBackUpExportInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackUpExportInfoResponseBody getBody() {
        return this.body;
    }

}
