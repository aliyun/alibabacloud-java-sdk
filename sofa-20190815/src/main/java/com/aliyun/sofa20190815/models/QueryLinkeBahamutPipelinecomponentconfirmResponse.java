// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPipelinecomponentconfirmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutPipelinecomponentconfirmResponseBody body;

    public static QueryLinkeBahamutPipelinecomponentconfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPipelinecomponentconfirmResponse self = new QueryLinkeBahamutPipelinecomponentconfirmResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPipelinecomponentconfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutPipelinecomponentconfirmResponse setBody(QueryLinkeBahamutPipelinecomponentconfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutPipelinecomponentconfirmResponseBody getBody() {
        return this.body;
    }

}
