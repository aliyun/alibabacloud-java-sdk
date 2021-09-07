// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupSetListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupSetListResponseBody body;

    public static DescribeBackupSetListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetListResponse self = new DescribeBackupSetListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupSetListResponse setBody(DescribeBackupSetListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupSetListResponseBody getBody() {
        return this.body;
    }

}
