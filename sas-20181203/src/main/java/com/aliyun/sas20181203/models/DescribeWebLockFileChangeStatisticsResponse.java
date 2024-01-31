// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileChangeStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebLockFileChangeStatisticsResponseBody body;

    public static DescribeWebLockFileChangeStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockFileChangeStatisticsResponse self = new DescribeWebLockFileChangeStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockFileChangeStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebLockFileChangeStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebLockFileChangeStatisticsResponse setBody(DescribeWebLockFileChangeStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebLockFileChangeStatisticsResponseBody getBody() {
        return this.body;
    }

}
