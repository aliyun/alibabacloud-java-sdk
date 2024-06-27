// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperatorListByTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOperatorListByTypeResponseBody body;

    public static DescribeOperatorListByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorListByTypeResponse self = new DescribeOperatorListByTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorListByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOperatorListByTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOperatorListByTypeResponse setBody(DescribeOperatorListByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOperatorListByTypeResponseBody getBody() {
        return this.body;
    }

}
