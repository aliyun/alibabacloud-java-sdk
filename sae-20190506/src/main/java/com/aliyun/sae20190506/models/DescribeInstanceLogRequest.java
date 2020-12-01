// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceLogRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeInstanceLogQuery query;

    public static DescribeInstanceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLogRequest self = new DescribeInstanceLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLogRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceLogRequest setQuery(DescribeInstanceLogQuery query) {
        this.query = query;
        return this;
    }
    public DescribeInstanceLogQuery getQuery() {
        return this.query;
    }

}
