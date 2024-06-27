// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperationLogPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOperationLogPageListResponseBody body;

    public static DescribeOperationLogPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperationLogPageListResponse self = new DescribeOperationLogPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOperationLogPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOperationLogPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOperationLogPageListResponse setBody(DescribeOperationLogPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOperationLogPageListResponseBody getBody() {
        return this.body;
    }

}
