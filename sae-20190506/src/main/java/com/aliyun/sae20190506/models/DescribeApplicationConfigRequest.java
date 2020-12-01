// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeApplicationConfigQuery query;

    public static DescribeApplicationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationConfigRequest self = new DescribeApplicationConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationConfigRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationConfigRequest setQuery(DescribeApplicationConfigQuery query) {
        this.query = query;
        return this;
    }
    public DescribeApplicationConfigQuery getQuery() {
        return this.query;
    }

}
