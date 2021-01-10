// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmrecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAlarmrecordsResponseBody body;

    public static QueryRmsAlarmrecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmrecordsResponse self = new QueryRmsAlarmrecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmrecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAlarmrecordsResponse setBody(QueryRmsAlarmrecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAlarmrecordsResponseBody getBody() {
        return this.body;
    }

}
