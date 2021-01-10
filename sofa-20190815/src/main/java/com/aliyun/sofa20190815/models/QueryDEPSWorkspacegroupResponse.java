// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDEPSWorkspacegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDEPSWorkspacegroupResponseBody body;

    public static QueryDEPSWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDEPSWorkspacegroupResponse self = new QueryDEPSWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryDEPSWorkspacegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDEPSWorkspacegroupResponse setBody(QueryDEPSWorkspacegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDEPSWorkspacegroupResponseBody getBody() {
        return this.body;
    }

}
