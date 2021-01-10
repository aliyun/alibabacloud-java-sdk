// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasConfigSyncstatusfortenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasConfigSyncstatusfortenantResponseBody body;

    public static QueryHasConfigSyncstatusfortenantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasConfigSyncstatusfortenantResponse self = new QueryHasConfigSyncstatusfortenantResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasConfigSyncstatusfortenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasConfigSyncstatusfortenantResponse setBody(QueryHasConfigSyncstatusfortenantResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasConfigSyncstatusfortenantResponseBody getBody() {
        return this.body;
    }

}
