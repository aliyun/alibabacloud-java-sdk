// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeCustomerModuleMetaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomerModuleMetaInfoResponseBody body;

    public static DescribeCustomerModuleMetaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerModuleMetaInfoResponse self = new DescribeCustomerModuleMetaInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerModuleMetaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomerModuleMetaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomerModuleMetaInfoResponse setBody(DescribeCustomerModuleMetaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomerModuleMetaInfoResponseBody getBody() {
        return this.body;
    }

}
