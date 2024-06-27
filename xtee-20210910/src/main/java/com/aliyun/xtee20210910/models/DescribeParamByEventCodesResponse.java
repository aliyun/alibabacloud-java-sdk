// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeParamByEventCodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParamByEventCodesResponseBody body;

    public static DescribeParamByEventCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParamByEventCodesResponse self = new DescribeParamByEventCodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParamByEventCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParamByEventCodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParamByEventCodesResponse setBody(DescribeParamByEventCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParamByEventCodesResponseBody getBody() {
        return this.body;
    }

}
