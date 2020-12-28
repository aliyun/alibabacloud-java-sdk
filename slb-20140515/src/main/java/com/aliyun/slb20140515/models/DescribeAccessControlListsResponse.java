// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccessControlListsResponseBody body;

    public static DescribeAccessControlListsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListsResponse self = new DescribeAccessControlListsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessControlListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessControlListsResponse setBody(DescribeAccessControlListsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessControlListsResponseBody getBody() {
        return this.body;
    }

}
