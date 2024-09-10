// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUniBackupStatisticsResponseBody body;

    public static DescribeUniBackupStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupStatisticsResponse self = new DescribeUniBackupStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUniBackupStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUniBackupStatisticsResponse setBody(DescribeUniBackupStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUniBackupStatisticsResponseBody getBody() {
        return this.body;
    }

}
