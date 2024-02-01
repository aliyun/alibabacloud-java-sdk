// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHighDefinitionMonitorLogAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHighDefinitionMonitorLogAttributeResponseBody body;

    public static DescribeHighDefinitionMonitorLogAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighDefinitionMonitorLogAttributeResponse self = new DescribeHighDefinitionMonitorLogAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse setBody(DescribeHighDefinitionMonitorLogAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHighDefinitionMonitorLogAttributeResponseBody getBody() {
        return this.body;
    }

}
