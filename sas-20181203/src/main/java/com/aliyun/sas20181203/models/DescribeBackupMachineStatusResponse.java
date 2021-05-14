// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupMachineStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeBackupMachineStatusResponse setBody(DescribeBackupMachineStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupMachineStatusResponseBody getBody() {
        return this.body;
    }

}
