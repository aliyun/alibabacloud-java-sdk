// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinklogAccountlistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinklogAccountlistResponseBody body;

    public static QueryLinkeLinklogAccountlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinklogAccountlistResponse self = new QueryLinkeLinklogAccountlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinklogAccountlistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinklogAccountlistResponse setBody(QueryLinkeLinklogAccountlistResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinklogAccountlistResponseBody getBody() {
        return this.body;
    }

}
