// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationInstancesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeApplicationInstancesQuery query;

    public static DescribeApplicationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationInstancesRequest self = new DescribeApplicationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationInstancesRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationInstancesRequest setQuery(DescribeApplicationInstancesQuery query) {
        this.query = query;
        return this;
    }
    public DescribeApplicationInstancesQuery getQuery() {
        return this.query;
    }

}
