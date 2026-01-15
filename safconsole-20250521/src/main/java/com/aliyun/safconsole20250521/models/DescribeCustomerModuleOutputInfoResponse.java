// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeCustomerModuleOutputInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomerModuleOutputInfoResponseBody body;

    public static DescribeCustomerModuleOutputInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerModuleOutputInfoResponse self = new DescribeCustomerModuleOutputInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerModuleOutputInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomerModuleOutputInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomerModuleOutputInfoResponse setBody(DescribeCustomerModuleOutputInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomerModuleOutputInfoResponseBody getBody() {
        return this.body;
    }

}
