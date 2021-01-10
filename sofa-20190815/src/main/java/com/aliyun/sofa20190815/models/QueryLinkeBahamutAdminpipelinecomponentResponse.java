// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAdminpipelinecomponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAdminpipelinecomponentResponseBody body;

    public static QueryLinkeBahamutAdminpipelinecomponentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAdminpipelinecomponentResponse self = new QueryLinkeBahamutAdminpipelinecomponentResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponse setBody(QueryLinkeBahamutAdminpipelinecomponentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAdminpipelinecomponentResponseBody getBody() {
        return this.body;
    }

}
