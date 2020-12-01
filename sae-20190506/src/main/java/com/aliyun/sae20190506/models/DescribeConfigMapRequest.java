// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigMapRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeConfigMapQuery query;

    public static DescribeConfigMapRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigMapRequest self = new DescribeConfigMapRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigMapRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigMapRequest setQuery(DescribeConfigMapQuery query) {
        this.query = query;
        return this;
    }
    public DescribeConfigMapQuery getQuery() {
        return this.query;
    }

}
