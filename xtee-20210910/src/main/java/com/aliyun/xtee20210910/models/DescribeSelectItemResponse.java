// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSelectItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSelectItemResponseBody body;

    public static DescribeSelectItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSelectItemResponse self = new DescribeSelectItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSelectItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSelectItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSelectItemResponse setBody(DescribeSelectItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSelectItemResponseBody getBody() {
        return this.body;
    }

}
