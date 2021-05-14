// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserBackupMachinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeUserBackupMachinesResponse setBody(DescribeUserBackupMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserBackupMachinesResponseBody getBody() {
        return this.body;
    }

}
