// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryModuleSwitchStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryModuleSwitchStatusResponseBody body;

    public static QueryModuleSwitchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModuleSwitchStatusResponse self = new QueryModuleSwitchStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryModuleSwitchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModuleSwitchStatusResponse setBody(QueryModuleSwitchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModuleSwitchStatusResponseBody getBody() {
        return this.body;
    }

}
