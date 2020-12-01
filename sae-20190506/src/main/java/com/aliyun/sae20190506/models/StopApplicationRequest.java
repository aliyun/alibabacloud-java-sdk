// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StopApplicationRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public StopApplicationQuery query;

    public static StopApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopApplicationRequest self = new StopApplicationRequest();
        return TeaModel.build(map, self);
    }

    public StopApplicationRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopApplicationRequest setQuery(StopApplicationQuery query) {
        this.query = query;
        return this;
    }
    public StopApplicationQuery getQuery() {
        return this.query;
    }

}
