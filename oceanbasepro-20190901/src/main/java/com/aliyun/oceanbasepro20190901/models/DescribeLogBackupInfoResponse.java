// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeLogBackupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogBackupInfoResponseBody body;

    public static DescribeLogBackupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupInfoResponse self = new DescribeLogBackupInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogBackupInfoResponse setBody(DescribeLogBackupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogBackupInfoResponseBody getBody() {
        return this.body;
    }

}
