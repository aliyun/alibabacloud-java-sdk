// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody body;

    public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse self = new QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse setBody(QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody getBody() {
        return this.body;
    }

}
