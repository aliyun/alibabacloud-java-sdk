// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationGroupsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeApplicationGroupsQuery query;

    public static DescribeApplicationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationGroupsRequest self = new DescribeApplicationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationGroupsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationGroupsRequest setQuery(DescribeApplicationGroupsQuery query) {
        this.query = query;
        return this;
    }
    public DescribeApplicationGroupsQuery getQuery() {
        return this.query;
    }

}
