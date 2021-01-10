// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPipelineexecuteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutPipelineexecuteResponseBody body;

    public static QueryLinkeBahamutPipelineexecuteResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPipelineexecuteResponse self = new QueryLinkeBahamutPipelineexecuteResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPipelineexecuteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutPipelineexecuteResponse setBody(QueryLinkeBahamutPipelineexecuteResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutPipelineexecuteResponseBody getBody() {
        return this.body;
    }

}
