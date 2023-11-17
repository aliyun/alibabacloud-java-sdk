// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookNodesOutputResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlaybookNodesOutputResponseBody body;

    public static DescribePlaybookNodesOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookNodesOutputResponse self = new DescribePlaybookNodesOutputResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookNodesOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlaybookNodesOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlaybookNodesOutputResponse setBody(DescribePlaybookNodesOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlaybookNodesOutputResponseBody getBody() {
        return this.body;
    }

}
