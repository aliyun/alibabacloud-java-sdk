// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ConfirmPipelineBatchRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ConfirmPipelineBatchQuery query;

    public static ConfirmPipelineBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPipelineBatchRequest self = new ConfirmPipelineBatchRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmPipelineBatchRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmPipelineBatchRequest setQuery(ConfirmPipelineBatchQuery query) {
        this.query = query;
        return this;
    }
    public ConfirmPipelineBatchQuery getQuery() {
        return this.query;
    }

}
