// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAlarmBlacklistResponseBody body;

    public static QueryRmsAlarmBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmBlacklistResponse self = new QueryRmsAlarmBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAlarmBlacklistResponse setBody(QueryRmsAlarmBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAlarmBlacklistResponseBody getBody() {
        return this.body;
    }

}
