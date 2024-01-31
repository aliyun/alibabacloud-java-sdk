// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListWithBaselineNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageListWithBaselineNameResponseBody body;

    public static DescribeImageListWithBaselineNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListWithBaselineNameResponse self = new DescribeImageListWithBaselineNameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageListWithBaselineNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageListWithBaselineNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageListWithBaselineNameResponse setBody(DescribeImageListWithBaselineNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageListWithBaselineNameResponseBody getBody() {
        return this.body;
    }

}
