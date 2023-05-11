// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupSetResponseBody body;

    public static DescribeBackupSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetResponse self = new DescribeBackupSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupSetResponse setBody(DescribeBackupSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupSetResponseBody getBody() {
        return this.body;
    }

}
