// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExcuteNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExcuteNumResponseBody body;

    public static DescribeExcuteNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcuteNumResponse self = new DescribeExcuteNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExcuteNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExcuteNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExcuteNumResponse setBody(DescribeExcuteNumResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExcuteNumResponseBody getBody() {
        return this.body;
    }

}
