// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDingtalkRobotrelationtypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDingtalkRobotrelationtypesResponseBody body;

    public static QueryHasDingtalkRobotrelationtypesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDingtalkRobotrelationtypesResponse self = new QueryHasDingtalkRobotrelationtypesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDingtalkRobotrelationtypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDingtalkRobotrelationtypesResponse setBody(QueryHasDingtalkRobotrelationtypesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDingtalkRobotrelationtypesResponseBody getBody() {
        return this.body;
    }

}
