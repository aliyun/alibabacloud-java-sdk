// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeMetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetadataResponseBody body;

    public static DescribeMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetadataResponse self = new DescribeMetadataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetadataResponse setBody(DescribeMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetadataResponseBody getBody() {
        return this.body;
    }

}
