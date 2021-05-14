// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgVulItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeEmgVulItemResponse setBody(DescribeEmgVulItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEmgVulItemResponseBody getBody() {
        return this.body;
    }

}
