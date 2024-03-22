// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeEnumItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnumItemsResponseBody body;

    public static DescribeEnumItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnumItemsResponse self = new DescribeEnumItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnumItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnumItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnumItemsResponse setBody(DescribeEnumItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnumItemsResponseBody getBody() {
        return this.body;
    }

}
