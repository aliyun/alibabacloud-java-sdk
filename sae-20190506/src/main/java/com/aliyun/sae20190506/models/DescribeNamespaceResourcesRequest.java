// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeNamespaceResourcesQuery query;

    public static DescribeNamespaceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResourcesRequest self = new DescribeNamespaceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResourcesRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespaceResourcesRequest setQuery(DescribeNamespaceResourcesQuery query) {
        this.query = query;
        return this;
    }
    public DescribeNamespaceResourcesQuery getQuery() {
        return this.query;
    }

}
