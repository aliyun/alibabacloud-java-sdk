// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniRecoverableListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUniRecoverableListResponseBody body;

    public static DescribeUniRecoverableListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniRecoverableListResponse self = new DescribeUniRecoverableListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUniRecoverableListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUniRecoverableListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUniRecoverableListResponse setBody(DescribeUniRecoverableListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUniRecoverableListResponseBody getBody() {
        return this.body;
    }

}
