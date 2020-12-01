// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatusRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeApplicationStatusQuery query;

    public static DescribeApplicationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationStatusRequest self = new DescribeApplicationStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationStatusRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationStatusRequest setQuery(DescribeApplicationStatusQuery query) {
        this.query = query;
        return this;
    }
    public DescribeApplicationStatusQuery getQuery() {
        return this.query;
    }

}
