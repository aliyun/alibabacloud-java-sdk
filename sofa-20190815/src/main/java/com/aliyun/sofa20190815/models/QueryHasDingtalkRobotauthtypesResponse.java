// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDingtalkRobotauthtypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDingtalkRobotauthtypesResponseBody body;

    public static QueryHasDingtalkRobotauthtypesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDingtalkRobotauthtypesResponse self = new QueryHasDingtalkRobotauthtypesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDingtalkRobotauthtypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDingtalkRobotauthtypesResponse setBody(QueryHasDingtalkRobotauthtypesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDingtalkRobotauthtypesResponseBody getBody() {
        return this.body;
    }

}
