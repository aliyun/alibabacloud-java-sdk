// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeChangeOrderRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeChangeOrderQuery query;

    public static DescribeChangeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeOrderRequest self = new DescribeChangeOrderRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChangeOrderRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChangeOrderRequest setQuery(DescribeChangeOrderQuery query) {
        this.query = query;
        return this;
    }
    public DescribeChangeOrderQuery getQuery() {
        return this.query;
    }

}
