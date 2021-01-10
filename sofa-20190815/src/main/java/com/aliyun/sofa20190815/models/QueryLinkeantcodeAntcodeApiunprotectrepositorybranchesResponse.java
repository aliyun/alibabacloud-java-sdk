// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody body;

    public static QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse self = new QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse setBody(QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody getBody() {
        return this.body;
    }

}
