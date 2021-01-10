// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody body;

    public static QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponse self = new QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponse setBody(QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody getBody() {
        return this.body;
    }

}
