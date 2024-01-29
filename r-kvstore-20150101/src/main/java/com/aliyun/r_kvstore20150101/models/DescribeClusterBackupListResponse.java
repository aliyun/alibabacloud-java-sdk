// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeClusterBackupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterBackupListResponseBody body;

    public static DescribeClusterBackupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBackupListResponse self = new DescribeClusterBackupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBackupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterBackupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterBackupListResponse setBody(DescribeClusterBackupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterBackupListResponseBody getBody() {
        return this.body;
    }

}
