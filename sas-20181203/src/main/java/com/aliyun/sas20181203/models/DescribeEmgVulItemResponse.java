// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgVulItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEmgVulItemResponseBody body;

    public static DescribeEmgVulItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmgVulItemResponse self = new DescribeEmgVulItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEmgVulItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEmgVulItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEmgVulItemResponse setBody(DescribeEmgVulItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEmgVulItemResponseBody getBody() {
        return this.body;
    }

}
