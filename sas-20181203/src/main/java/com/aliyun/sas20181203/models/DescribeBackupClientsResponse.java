// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupClientsResponseBody body;

    public static DescribeBackupClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupClientsResponse self = new DescribeBackupClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupClientsResponse setBody(DescribeBackupClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupClientsResponseBody getBody() {
        return this.body;
    }

}
