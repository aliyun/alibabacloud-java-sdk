// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeInspectionTaskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionTaskAttributeResponseBody body;

    public static DescribeInspectionTaskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTaskAttributeResponse self = new DescribeInspectionTaskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTaskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionTaskAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionTaskAttributeResponse setBody(DescribeInspectionTaskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionTaskAttributeResponseBody getBody() {
        return this.body;
    }

}
