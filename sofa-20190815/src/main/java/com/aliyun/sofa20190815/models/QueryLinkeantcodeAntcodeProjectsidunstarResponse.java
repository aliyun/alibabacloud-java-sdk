// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidunstarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProjectsidunstarResponseBody body;

    public static QueryLinkeantcodeAntcodeProjectsidunstarResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidunstarResponse self = new QueryLinkeantcodeAntcodeProjectsidunstarResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidunstarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProjectsidunstarResponse setBody(QueryLinkeantcodeAntcodeProjectsidunstarResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsidunstarResponseBody getBody() {
        return this.body;
    }

}
