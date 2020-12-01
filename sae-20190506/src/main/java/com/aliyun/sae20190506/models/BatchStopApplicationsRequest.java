// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStopApplicationsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public BatchStopApplicationsQuery query;

    public static BatchStopApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStopApplicationsRequest self = new BatchStopApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchStopApplicationsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopApplicationsRequest setQuery(BatchStopApplicationsQuery query) {
        this.query = query;
        return this;
    }
    public BatchStopApplicationsQuery getQuery() {
        return this.query;
    }

}
