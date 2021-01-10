// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPInstancesUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPInstancesUsersResponseBody body;

    public static QueryODPInstancesUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPInstancesUsersResponse self = new QueryODPInstancesUsersResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPInstancesUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPInstancesUsersResponse setBody(QueryODPInstancesUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPInstancesUsersResponseBody getBody() {
        return this.body;
    }

}
