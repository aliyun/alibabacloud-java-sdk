// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationImageRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeApplicationImageQuery query;

    public static DescribeApplicationImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationImageRequest self = new DescribeApplicationImageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationImageRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationImageRequest setQuery(DescribeApplicationImageQuery query) {
        this.query = query;
        return this;
    }
    public DescribeApplicationImageQuery getQuery() {
        return this.query;
    }

}
