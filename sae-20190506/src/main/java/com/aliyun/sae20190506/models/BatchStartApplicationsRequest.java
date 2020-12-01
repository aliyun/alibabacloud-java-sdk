// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStartApplicationsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public BatchStartApplicationsQuery query;

    public static BatchStartApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStartApplicationsRequest self = new BatchStartApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchStartApplicationsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStartApplicationsRequest setQuery(BatchStartApplicationsQuery query) {
        this.query = query;
        return this;
    }
    public BatchStartApplicationsQuery getQuery() {
        return this.query;
    }

}
