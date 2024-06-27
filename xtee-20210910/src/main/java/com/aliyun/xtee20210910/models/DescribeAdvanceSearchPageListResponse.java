// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAdvanceSearchPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdvanceSearchPageListResponseBody body;

    public static DescribeAdvanceSearchPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvanceSearchPageListResponse self = new DescribeAdvanceSearchPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvanceSearchPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvanceSearchPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvanceSearchPageListResponse setBody(DescribeAdvanceSearchPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvanceSearchPageListResponseBody getBody() {
        return this.body;
    }

}
