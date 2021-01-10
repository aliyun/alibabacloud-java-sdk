// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidgcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProjectsidgcResponseBody body;

    public static QueryLinkeantcodeAntcodeProjectsidgcResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidgcResponse self = new QueryLinkeantcodeAntcodeProjectsidgcResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidgcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProjectsidgcResponse setBody(QueryLinkeantcodeAntcodeProjectsidgcResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsidgcResponseBody getBody() {
        return this.body;
    }

}
