// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupMachineStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupMachineStatusResponseBody body;

    public static DescribeBackupMachineStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupMachineStatusResponse self = new DescribeBackupMachineStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupMachineStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupMachineStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupMachineStatusResponse setBody(DescribeBackupMachineStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupMachineStatusResponseBody getBody() {
        return this.body;
    }

}
