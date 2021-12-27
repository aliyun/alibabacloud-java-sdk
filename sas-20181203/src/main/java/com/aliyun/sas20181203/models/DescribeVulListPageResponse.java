// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVulListPageResponseBody body;

    public static DescribeVulListPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListPageResponse self = new DescribeVulListPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulListPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulListPageResponse setBody(DescribeVulListPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulListPageResponseBody getBody() {
        return this.body;
    }

}
