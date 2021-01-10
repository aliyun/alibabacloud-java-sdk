// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectPluginResponseBody body;

    public static QueryHasInspectPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectPluginResponse self = new QueryHasInspectPluginResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectPluginResponse setBody(QueryHasInspectPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectPluginResponseBody getBody() {
        return this.body;
    }

}
