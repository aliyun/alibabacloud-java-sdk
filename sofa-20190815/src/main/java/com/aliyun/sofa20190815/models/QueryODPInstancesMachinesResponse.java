// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPInstancesMachinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPInstancesMachinesResponseBody body;

    public static QueryODPInstancesMachinesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPInstancesMachinesResponse self = new QueryODPInstancesMachinesResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPInstancesMachinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPInstancesMachinesResponse setBody(QueryODPInstancesMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPInstancesMachinesResponseBody getBody() {
        return this.body;
    }

}
