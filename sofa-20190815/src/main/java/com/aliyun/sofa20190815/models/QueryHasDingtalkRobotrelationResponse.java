// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDingtalkRobotrelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDingtalkRobotrelationResponseBody body;

    public static QueryHasDingtalkRobotrelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDingtalkRobotrelationResponse self = new QueryHasDingtalkRobotrelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDingtalkRobotrelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDingtalkRobotrelationResponse setBody(QueryHasDingtalkRobotrelationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDingtalkRobotrelationResponseBody getBody() {
        return this.body;
    }

}
