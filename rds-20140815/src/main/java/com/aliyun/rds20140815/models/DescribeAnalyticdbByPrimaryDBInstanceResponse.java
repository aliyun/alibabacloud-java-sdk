// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAnalyticdbByPrimaryDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAnalyticdbByPrimaryDBInstanceResponseBody body;

    public static DescribeAnalyticdbByPrimaryDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalyticdbByPrimaryDBInstanceResponse self = new DescribeAnalyticdbByPrimaryDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnalyticdbByPrimaryDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnalyticdbByPrimaryDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAnalyticdbByPrimaryDBInstanceResponse setBody(DescribeAnalyticdbByPrimaryDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnalyticdbByPrimaryDBInstanceResponseBody getBody() {
        return this.body;
    }

}
