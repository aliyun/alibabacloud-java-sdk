// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDingtalkRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDingtalkRobotResponseBody body;

    public static QueryHasDingtalkRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDingtalkRobotResponse self = new QueryHasDingtalkRobotResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDingtalkRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDingtalkRobotResponse setBody(QueryHasDingtalkRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDingtalkRobotResponseBody getBody() {
        return this.body;
    }

}
