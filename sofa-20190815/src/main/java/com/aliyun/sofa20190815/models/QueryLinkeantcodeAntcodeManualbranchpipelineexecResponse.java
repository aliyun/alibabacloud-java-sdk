// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody body;

    public static QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse self = new QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse setBody(QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody getBody() {
        return this.body;
    }

}
