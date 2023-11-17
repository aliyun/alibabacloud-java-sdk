// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybooksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlaybooksResponseBody body;

    public static DescribePlaybooksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybooksResponse self = new DescribePlaybooksResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlaybooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlaybooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlaybooksResponse setBody(DescribePlaybooksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlaybooksResponseBody getBody() {
        return this.body;
    }

}
