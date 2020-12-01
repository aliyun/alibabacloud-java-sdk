// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeIngressRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeIngressQuery query;

    public static DescribeIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressRequest self = new DescribeIngressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIngressRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIngressRequest setQuery(DescribeIngressQuery query) {
        this.query = query;
        return this;
    }
    public DescribeIngressQuery getQuery() {
        return this.query;
    }

}
