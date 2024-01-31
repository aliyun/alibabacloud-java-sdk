// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupedTagsResponseBody body;

    public static DescribeGroupedTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedTagsResponse self = new DescribeGroupedTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupedTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupedTagsResponse setBody(DescribeGroupedTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupedTagsResponseBody getBody() {
        return this.body;
    }

}
