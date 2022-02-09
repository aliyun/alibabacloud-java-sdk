// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDataBackupSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataBackupSetResponseBody body;

    public static DescribeDataBackupSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataBackupSetResponse self = new DescribeDataBackupSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataBackupSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataBackupSetResponse setBody(DescribeDataBackupSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataBackupSetResponseBody getBody() {
        return this.body;
    }

}
