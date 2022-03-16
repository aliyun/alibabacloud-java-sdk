// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshLogsResponseBody body;

    public static DescribeServiceMeshLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshLogsResponse self = new DescribeServiceMeshLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshLogsResponse setBody(DescribeServiceMeshLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshLogsResponseBody getBody() {
        return this.body;
    }

}
