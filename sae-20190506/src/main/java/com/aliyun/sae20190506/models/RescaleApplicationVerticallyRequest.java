// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationVerticallyRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public RescaleApplicationVerticallyQuery query;

    public static RescaleApplicationVerticallyRequest build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationVerticallyRequest self = new RescaleApplicationVerticallyRequest();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationVerticallyRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RescaleApplicationVerticallyRequest setQuery(RescaleApplicationVerticallyQuery query) {
        this.query = query;
        return this;
    }
    public RescaleApplicationVerticallyQuery getQuery() {
        return this.query;
    }

}
