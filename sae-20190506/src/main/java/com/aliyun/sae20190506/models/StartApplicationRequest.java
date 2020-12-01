// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StartApplicationRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public StartApplicationQuery query;

    public static StartApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartApplicationRequest self = new StartApplicationRequest();
        return TeaModel.build(map, self);
    }

    public StartApplicationRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartApplicationRequest setQuery(StartApplicationQuery query) {
        this.query = query;
        return this;
    }
    public StartApplicationQuery getQuery() {
        return this.query;
    }

}
