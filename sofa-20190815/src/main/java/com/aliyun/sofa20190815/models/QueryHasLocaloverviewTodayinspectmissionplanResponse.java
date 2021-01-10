// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewTodayinspectmissionplanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasLocaloverviewTodayinspectmissionplanResponseBody body;

    public static QueryHasLocaloverviewTodayinspectmissionplanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewTodayinspectmissionplanResponse self = new QueryHasLocaloverviewTodayinspectmissionplanResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewTodayinspectmissionplanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasLocaloverviewTodayinspectmissionplanResponse setBody(QueryHasLocaloverviewTodayinspectmissionplanResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasLocaloverviewTodayinspectmissionplanResponseBody getBody() {
        return this.body;
    }

}
