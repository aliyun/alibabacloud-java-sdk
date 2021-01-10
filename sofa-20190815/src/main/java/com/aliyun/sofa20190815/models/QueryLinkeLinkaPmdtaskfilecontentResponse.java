// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdtaskfilecontentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaPmdtaskfilecontentResponseBody body;

    public static QueryLinkeLinkaPmdtaskfilecontentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdtaskfilecontentResponse self = new QueryLinkeLinkaPmdtaskfilecontentResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdtaskfilecontentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaPmdtaskfilecontentResponse setBody(QueryLinkeLinkaPmdtaskfilecontentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaPmdtaskfilecontentResponseBody getBody() {
        return this.body;
    }

}
