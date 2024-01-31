// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserBackupMachinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserBackupMachinesResponseBody body;

    public static DescribeUserBackupMachinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBackupMachinesResponse self = new DescribeUserBackupMachinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserBackupMachinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserBackupMachinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserBackupMachinesResponse setBody(DescribeUserBackupMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserBackupMachinesResponseBody getBody() {
        return this.body;
    }

}
