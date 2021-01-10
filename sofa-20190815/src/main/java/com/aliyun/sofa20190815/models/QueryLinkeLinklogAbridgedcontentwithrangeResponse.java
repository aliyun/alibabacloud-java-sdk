// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinklogAbridgedcontentwithrangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinklogAbridgedcontentwithrangeResponseBody body;

    public static QueryLinkeLinklogAbridgedcontentwithrangeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinklogAbridgedcontentwithrangeResponse self = new QueryLinkeLinklogAbridgedcontentwithrangeResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeResponse setBody(QueryLinkeLinklogAbridgedcontentwithrangeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinklogAbridgedcontentwithrangeResponseBody getBody() {
        return this.body;
    }

}
