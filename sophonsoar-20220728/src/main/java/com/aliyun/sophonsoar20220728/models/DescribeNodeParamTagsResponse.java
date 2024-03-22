// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNodeParamTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
