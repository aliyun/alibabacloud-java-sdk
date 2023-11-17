// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeComponentPlaybookResponseBody body;

    public static DescribeComponentPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentPlaybookResponse self = new DescribeComponentPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComponentPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComponentPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComponentPlaybookResponse setBody(DescribeComponentPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComponentPlaybookResponseBody getBody() {
        return this.body;
    }

}
