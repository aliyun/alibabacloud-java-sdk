// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUniBackupDatabaseResponseBody body;

    public static DescribeUniBackupDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupDatabaseResponse self = new DescribeUniBackupDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUniBackupDatabaseResponse setBody(DescribeUniBackupDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUniBackupDatabaseResponseBody getBody() {
        return this.body;
    }

}
