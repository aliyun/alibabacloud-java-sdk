// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupTasksResponseBody body;

    public static DescribeBackupTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksResponse self = new DescribeBackupTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupTasksResponse setBody(DescribeBackupTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupTasksResponseBody getBody() {
        return this.body;
    }

}
