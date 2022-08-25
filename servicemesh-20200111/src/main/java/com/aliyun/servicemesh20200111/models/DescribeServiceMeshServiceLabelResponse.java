// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshServiceLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshServiceLabelResponseBody body;

    public static DescribeServiceMeshServiceLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshServiceLabelResponse self = new DescribeServiceMeshServiceLabelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshServiceLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshServiceLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceMeshServiceLabelResponse setBody(DescribeServiceMeshServiceLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshServiceLabelResponseBody getBody() {
        return this.body;
    }

}
