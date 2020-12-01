// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationSlbsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeApplicationSlbsQuery query;

    public static DescribeApplicationSlbsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSlbsRequest self = new DescribeApplicationSlbsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSlbsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationSlbsRequest setQuery(DescribeApplicationSlbsQuery query) {
        this.query = query;
        return this;
    }
    public DescribeApplicationSlbsQuery getQuery() {
        return this.query;
    }

}
