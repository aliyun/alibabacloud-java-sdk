// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectScheduleofmissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectScheduleofmissionResponseBody body;

    public static QueryHasInspectScheduleofmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectScheduleofmissionResponse self = new QueryHasInspectScheduleofmissionResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectScheduleofmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectScheduleofmissionResponse setBody(QueryHasInspectScheduleofmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectScheduleofmissionResponseBody getBody() {
        return this.body;
    }

}
