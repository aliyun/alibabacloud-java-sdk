// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeInputFeildCountByEventCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInputFeildCountByEventCodeResponseBody body;

    public static DescribeInputFeildCountByEventCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInputFeildCountByEventCodeResponse self = new DescribeInputFeildCountByEventCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInputFeildCountByEventCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInputFeildCountByEventCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInputFeildCountByEventCodeResponse setBody(DescribeInputFeildCountByEventCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInputFeildCountByEventCodeResponseBody getBody() {
        return this.body;
    }

}
