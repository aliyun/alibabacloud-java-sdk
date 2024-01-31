// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCanFixVulListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCanFixVulListResponseBody body;

    public static DescribeCanFixVulListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCanFixVulListResponse self = new DescribeCanFixVulListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCanFixVulListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCanFixVulListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCanFixVulListResponse setBody(DescribeCanFixVulListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCanFixVulListResponseBody getBody() {
        return this.body;
    }

}
