// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeABTestSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeABTestSceneResponseBody body;

    public static DescribeABTestSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeABTestSceneResponse self = new DescribeABTestSceneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeABTestSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeABTestSceneResponse setBody(DescribeABTestSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeABTestSceneResponseBody getBody() {
        return this.body;
    }

}
