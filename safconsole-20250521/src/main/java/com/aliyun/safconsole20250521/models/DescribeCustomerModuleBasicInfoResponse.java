// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeCustomerModuleBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomerModuleBasicInfoResponseBody body;

    public static DescribeCustomerModuleBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerModuleBasicInfoResponse self = new DescribeCustomerModuleBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerModuleBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomerModuleBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomerModuleBasicInfoResponse setBody(DescribeCustomerModuleBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomerModuleBasicInfoResponseBody getBody() {
        return this.body;
    }

}
