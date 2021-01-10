// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSExecuteInstanceByIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSExecuteInstanceByIpResponseBody body;

    public static QueryTSExecuteInstanceByIpResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSExecuteInstanceByIpResponse self = new QueryTSExecuteInstanceByIpResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSExecuteInstanceByIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSExecuteInstanceByIpResponse setBody(QueryTSExecuteInstanceByIpResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSExecuteInstanceByIpResponseBody getBody() {
        return this.body;
    }

}
