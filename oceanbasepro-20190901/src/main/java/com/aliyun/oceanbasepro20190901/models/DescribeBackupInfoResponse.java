// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupInfoResponseBody body;

    public static DescribeBackupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupInfoResponse self = new DescribeBackupInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupInfoResponse setBody(DescribeBackupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupInfoResponseBody getBody() {
        return this.body;
    }

}
