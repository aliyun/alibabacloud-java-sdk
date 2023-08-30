// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDocTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDocTypesResponseBody body;

    public static DescribeDocTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocTypesResponse self = new DescribeDocTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDocTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDocTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDocTypesResponse setBody(DescribeDocTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDocTypesResponseBody getBody() {
        return this.body;
    }

}
