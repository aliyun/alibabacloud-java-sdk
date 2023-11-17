// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeDistinctReleasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDistinctReleasesResponseBody body;

    public static DescribeDistinctReleasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistinctReleasesResponse self = new DescribeDistinctReleasesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDistinctReleasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDistinctReleasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDistinctReleasesResponse setBody(DescribeDistinctReleasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDistinctReleasesResponseBody getBody() {
        return this.body;
    }

}
