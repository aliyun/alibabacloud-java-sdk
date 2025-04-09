// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCInstanceTypesResponseBody body;

    public static DescribeRCInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceTypesResponse self = new DescribeRCInstanceTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCInstanceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCInstanceTypesResponse setBody(DescribeRCInstanceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCInstanceTypesResponseBody getBody() {
        return this.body;
    }

}
