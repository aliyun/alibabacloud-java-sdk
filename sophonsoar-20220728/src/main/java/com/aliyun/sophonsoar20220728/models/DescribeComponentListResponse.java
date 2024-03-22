// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComponentListResponseBody body;

    public static DescribeComponentListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentListResponse self = new DescribeComponentListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComponentListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComponentListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComponentListResponse setBody(DescribeComponentListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComponentListResponseBody getBody() {
        return this.body;
    }

}
