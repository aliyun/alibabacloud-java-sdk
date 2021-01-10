// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmRecentcountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAlarmRecentcountResponseBody body;

    public static QueryRmsAlarmRecentcountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmRecentcountResponse self = new QueryRmsAlarmRecentcountResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmRecentcountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAlarmRecentcountResponse setBody(QueryRmsAlarmRecentcountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAlarmRecentcountResponseBody getBody() {
        return this.body;
    }

}
