// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasConfigSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasConfigSwitchResponseBody body;

    public static QueryHasConfigSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasConfigSwitchResponse self = new QueryHasConfigSwitchResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasConfigSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasConfigSwitchResponse setBody(QueryHasConfigSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasConfigSwitchResponseBody getBody() {
        return this.body;
    }

}
