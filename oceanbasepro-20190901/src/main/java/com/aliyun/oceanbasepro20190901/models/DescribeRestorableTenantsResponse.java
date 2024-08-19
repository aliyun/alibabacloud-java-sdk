// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestorableTenantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRestorableTenantsResponseBody body;

    public static DescribeRestorableTenantsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorableTenantsResponse self = new DescribeRestorableTenantsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestorableTenantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestorableTenantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRestorableTenantsResponse setBody(DescribeRestorableTenantsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestorableTenantsResponseBody getBody() {
        return this.body;
    }

}
