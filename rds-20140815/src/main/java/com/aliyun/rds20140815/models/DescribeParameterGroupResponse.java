// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeParameterGroupResponseBody body;

    public static DescribeParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupResponse self = new DescribeParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterGroupResponse setBody(DescribeParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterGroupResponseBody getBody() {
        return this.body;
    }

}
