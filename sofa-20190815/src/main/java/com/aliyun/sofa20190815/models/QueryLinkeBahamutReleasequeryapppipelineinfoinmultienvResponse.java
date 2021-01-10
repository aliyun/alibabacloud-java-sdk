// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponseBody body;

    public static QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse self = new QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse setBody(QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponseBody getBody() {
        return this.body;
    }

}
