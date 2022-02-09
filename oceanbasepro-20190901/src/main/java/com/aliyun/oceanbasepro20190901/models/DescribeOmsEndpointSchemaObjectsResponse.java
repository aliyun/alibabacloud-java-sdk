// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsEndpointSchemaObjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOmsEndpointSchemaObjectsResponseBody body;

    public static DescribeOmsEndpointSchemaObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsEndpointSchemaObjectsResponse self = new DescribeOmsEndpointSchemaObjectsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOmsEndpointSchemaObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsEndpointSchemaObjectsResponse setBody(DescribeOmsEndpointSchemaObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsEndpointSchemaObjectsResponseBody getBody() {
        return this.body;
    }

}
