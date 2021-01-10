// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSConfigSwitchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSConfigSwitchesResponseBody body;

    public static QueryTSConfigSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSConfigSwitchesResponse self = new QueryTSConfigSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSConfigSwitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSConfigSwitchesResponse setBody(QueryTSConfigSwitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSConfigSwitchesResponseBody getBody() {
        return this.body;
    }

}
