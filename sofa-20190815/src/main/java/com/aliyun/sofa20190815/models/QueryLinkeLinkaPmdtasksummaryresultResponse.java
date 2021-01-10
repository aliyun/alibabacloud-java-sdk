// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdtasksummaryresultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaPmdtasksummaryresultResponseBody body;

    public static QueryLinkeLinkaPmdtasksummaryresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdtasksummaryresultResponse self = new QueryLinkeLinkaPmdtasksummaryresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdtasksummaryresultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaPmdtasksummaryresultResponse setBody(QueryLinkeLinkaPmdtasksummaryresultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaPmdtasksummaryresultResponseBody getBody() {
        return this.body;
    }

}
