// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAdmintenantidpipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAdmintenantidpipelineResponseBody body;

    public static QueryLinkeBahamutAdmintenantidpipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAdmintenantidpipelineResponse self = new QueryLinkeBahamutAdmintenantidpipelineResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAdmintenantidpipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAdmintenantidpipelineResponse setBody(QueryLinkeBahamutAdmintenantidpipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAdmintenantidpipelineResponseBody getBody() {
        return this.body;
    }

}
