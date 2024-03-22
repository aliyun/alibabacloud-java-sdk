// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePlaybookResponseBody body;

    public static DescribePlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookResponse self = new DescribePlaybookResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlaybookResponse setBody(DescribePlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlaybookResponseBody getBody() {
        return this.body;
    }

}
