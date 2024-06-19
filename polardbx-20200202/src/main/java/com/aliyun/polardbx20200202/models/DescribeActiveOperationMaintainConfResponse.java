// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintainConfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeActiveOperationMaintainConfResponseBody body;

    public static DescribeActiveOperationMaintainConfResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationMaintainConfResponse self = new DescribeActiveOperationMaintainConfResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationMaintainConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveOperationMaintainConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActiveOperationMaintainConfResponse setBody(DescribeActiveOperationMaintainConfResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveOperationMaintainConfResponseBody getBody() {
        return this.body;
    }

}
