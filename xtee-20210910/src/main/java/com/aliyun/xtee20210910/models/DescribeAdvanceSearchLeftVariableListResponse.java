// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAdvanceSearchLeftVariableListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdvanceSearchLeftVariableListResponseBody body;

    public static DescribeAdvanceSearchLeftVariableListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvanceSearchLeftVariableListResponse self = new DescribeAdvanceSearchLeftVariableListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvanceSearchLeftVariableListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvanceSearchLeftVariableListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvanceSearchLeftVariableListResponse setBody(DescribeAdvanceSearchLeftVariableListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvanceSearchLeftVariableListResponseBody getBody() {
        return this.body;
    }

}
