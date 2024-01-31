// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineItemListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageBaselineItemListResponseBody body;

    public static DescribeImageBaselineItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineItemListResponse self = new DescribeImageBaselineItemListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineItemListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageBaselineItemListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageBaselineItemListResponse setBody(DescribeImageBaselineItemListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageBaselineItemListResponseBody getBody() {
        return this.body;
    }

}
