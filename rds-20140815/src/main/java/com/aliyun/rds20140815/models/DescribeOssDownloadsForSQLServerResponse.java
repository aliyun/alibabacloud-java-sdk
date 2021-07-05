// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeOssDownloadsForSQLServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOssDownloadsForSQLServerResponseBody body;

    public static DescribeOssDownloadsForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssDownloadsForSQLServerResponse self = new DescribeOssDownloadsForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssDownloadsForSQLServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssDownloadsForSQLServerResponse setBody(DescribeOssDownloadsForSQLServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssDownloadsForSQLServerResponseBody getBody() {
        return this.body;
    }

}
