// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidstarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProjectsidstarResponseBody body;

    public static QueryLinkeantcodeAntcodeProjectsidstarResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidstarResponse self = new QueryLinkeantcodeAntcodeProjectsidstarResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidstarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProjectsidstarResponse setBody(QueryLinkeantcodeAntcodeProjectsidstarResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsidstarResponseBody getBody() {
        return this.body;
    }

}
