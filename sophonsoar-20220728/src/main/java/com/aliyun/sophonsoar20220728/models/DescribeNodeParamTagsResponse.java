// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNodeParamTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNodeParamTagsResponseBody body;

    public static DescribeNodeParamTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeParamTagsResponse self = new DescribeNodeParamTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeParamTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeParamTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNodeParamTagsResponse setBody(DescribeNodeParamTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeParamTagsResponseBody getBody() {
        return this.body;
    }

}
