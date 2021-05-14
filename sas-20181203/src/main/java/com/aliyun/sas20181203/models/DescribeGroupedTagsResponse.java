// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupedTagsResponseBody body;

    public static DescribeGroupedTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedTagsResponse self = new DescribeGroupedTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupedTagsResponse setBody(DescribeGroupedTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupedTagsResponseBody getBody() {
        return this.body;
    }

}
