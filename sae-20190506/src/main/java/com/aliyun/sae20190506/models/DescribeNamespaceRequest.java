// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeNamespaceQuery query;

    public static DescribeNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceRequest self = new DescribeNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespaceRequest setQuery(DescribeNamespaceQuery query) {
        this.query = query;
        return this;
    }
    public DescribeNamespaceQuery getQuery() {
        return this.query;
    }

}
