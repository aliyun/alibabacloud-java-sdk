// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupStrategyResponseBody body;

    public static DescribeBackupStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupStrategyResponse self = new DescribeBackupStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupStrategyResponse setBody(DescribeBackupStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupStrategyResponseBody getBody() {
        return this.body;
    }

}
