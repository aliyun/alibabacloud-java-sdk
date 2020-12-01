// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartInstancesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public RestartInstancesQuery query;

    public static RestartInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartInstancesRequest self = new RestartInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RestartInstancesRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartInstancesRequest setQuery(RestartInstancesQuery query) {
        this.query = query;
        return this;
    }
    public RestartInstancesQuery getQuery() {
        return this.query;
    }

}
