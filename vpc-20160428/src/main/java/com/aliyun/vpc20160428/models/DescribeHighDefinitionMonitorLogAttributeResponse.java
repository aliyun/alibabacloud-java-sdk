// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHighDefinitionMonitorLogAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeHighDefinitionMonitorLogAttributeResponse setBody(DescribeHighDefinitionMonitorLogAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHighDefinitionMonitorLogAttributeResponseBody getBody() {
        return this.body;
    }

}
