// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookInputOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePlaybookInputOutputResponseBody body;

    public static DescribePlaybookInputOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookInputOutputResponse self = new DescribePlaybookInputOutputResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookInputOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlaybookInputOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlaybookInputOutputResponse setBody(DescribePlaybookInputOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlaybookInputOutputResponseBody getBody() {
        return this.body;
    }

}
