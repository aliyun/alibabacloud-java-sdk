// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModuleServiceExistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModuleServiceExistResponseBody body;

    public static DescribeModuleServiceExistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModuleServiceExistResponse self = new DescribeModuleServiceExistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModuleServiceExistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModuleServiceExistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModuleServiceExistResponse setBody(DescribeModuleServiceExistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModuleServiceExistResponseBody getBody() {
        return this.body;
    }

}
