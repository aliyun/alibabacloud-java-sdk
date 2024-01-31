// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeModifyPGHbaConfigLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModifyPGHbaConfigLogResponseBody body;

    public static DescribeModifyPGHbaConfigLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyPGHbaConfigLogResponse self = new DescribeModifyPGHbaConfigLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModifyPGHbaConfigLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModifyPGHbaConfigLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModifyPGHbaConfigLogResponse setBody(DescribeModifyPGHbaConfigLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModifyPGHbaConfigLogResponseBody getBody() {
        return this.body;
    }

}
