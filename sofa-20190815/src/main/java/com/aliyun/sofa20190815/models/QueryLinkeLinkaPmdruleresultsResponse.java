// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdruleresultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaPmdruleresultsResponseBody body;

    public static QueryLinkeLinkaPmdruleresultsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdruleresultsResponse self = new QueryLinkeLinkaPmdruleresultsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdruleresultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaPmdruleresultsResponse setBody(QueryLinkeLinkaPmdruleresultsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaPmdruleresultsResponseBody getBody() {
        return this.body;
    }

}
