// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeComponentsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeComponentsQuery query;

    public static DescribeComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentsRequest self = new DescribeComponentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComponentsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComponentsRequest setQuery(DescribeComponentsQuery query) {
        this.query = query;
        return this;
    }
    public DescribeComponentsQuery getQuery() {
        return this.query;
    }

}
