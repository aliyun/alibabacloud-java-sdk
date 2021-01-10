// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody body;

    public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse self = new QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse setBody(QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody getBody() {
        return this.body;
    }

}
