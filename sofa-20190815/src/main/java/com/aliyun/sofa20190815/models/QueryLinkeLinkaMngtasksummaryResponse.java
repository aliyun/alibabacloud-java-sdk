// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaMngtasksummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaMngtasksummaryResponseBody body;

    public static QueryLinkeLinkaMngtasksummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaMngtasksummaryResponse self = new QueryLinkeLinkaMngtasksummaryResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaMngtasksummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaMngtasksummaryResponse setBody(QueryLinkeLinkaMngtasksummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaMngtasksummaryResponseBody getBody() {
        return this.body;
    }

}
