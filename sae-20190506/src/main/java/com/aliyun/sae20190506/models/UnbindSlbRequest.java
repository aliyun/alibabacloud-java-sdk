// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UnbindSlbRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public UnbindSlbQuery query;

    public static UnbindSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindSlbRequest self = new UnbindSlbRequest();
        return TeaModel.build(map, self);
    }

    public UnbindSlbRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSlbRequest setQuery(UnbindSlbQuery query) {
        this.query = query;
        return this;
    }
    public UnbindSlbQuery getQuery() {
        return this.query;
    }

}
