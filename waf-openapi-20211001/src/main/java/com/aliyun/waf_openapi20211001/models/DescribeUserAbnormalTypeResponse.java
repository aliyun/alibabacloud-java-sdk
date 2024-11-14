// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserAbnormalTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserAbnormalTypeResponseBody body;

    public static DescribeUserAbnormalTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAbnormalTypeResponse self = new DescribeUserAbnormalTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserAbnormalTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserAbnormalTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserAbnormalTypeResponse setBody(DescribeUserAbnormalTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserAbnormalTypeResponseBody getBody() {
        return this.body;
    }

}
