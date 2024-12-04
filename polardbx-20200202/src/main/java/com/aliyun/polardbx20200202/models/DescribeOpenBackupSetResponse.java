// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenBackupSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenBackupSetResponseBody body;

    public static DescribeOpenBackupSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenBackupSetResponse self = new DescribeOpenBackupSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenBackupSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenBackupSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenBackupSetResponse setBody(DescribeOpenBackupSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenBackupSetResponseBody getBody() {
        return this.body;
    }

}
