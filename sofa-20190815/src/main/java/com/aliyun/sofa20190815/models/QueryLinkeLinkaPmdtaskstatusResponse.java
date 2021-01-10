// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdtaskstatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaPmdtaskstatusResponseBody body;

    public static QueryLinkeLinkaPmdtaskstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdtaskstatusResponse self = new QueryLinkeLinkaPmdtaskstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdtaskstatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaPmdtaskstatusResponse setBody(QueryLinkeLinkaPmdtaskstatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaPmdtaskstatusResponseBody getBody() {
        return this.body;
    }

}
