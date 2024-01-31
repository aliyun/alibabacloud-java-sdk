// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstallCodesResponseBody body;

    public static DescribeInstallCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstallCodesResponse self = new DescribeInstallCodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstallCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstallCodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstallCodesResponse setBody(DescribeInstallCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstallCodesResponseBody getBody() {
        return this.body;
    }

}
