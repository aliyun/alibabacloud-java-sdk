// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossBackupRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableCrossBackupRegionsResponseBody body;

    public static DescribeAvailableCrossBackupRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCrossBackupRegionsResponse self = new DescribeAvailableCrossBackupRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCrossBackupRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableCrossBackupRegionsResponse setBody(DescribeAvailableCrossBackupRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableCrossBackupRegionsResponseBody getBody() {
        return this.body;
    }

}
