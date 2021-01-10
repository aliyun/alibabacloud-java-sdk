// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsResponseBody body;

    public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsResponse self = new QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsResponse setBody(QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsResponseBody getBody() {
        return this.body;
    }

}
