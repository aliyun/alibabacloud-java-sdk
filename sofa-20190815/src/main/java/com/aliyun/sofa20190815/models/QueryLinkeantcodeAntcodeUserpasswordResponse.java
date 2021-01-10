// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeUserpasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeUserpasswordResponseBody body;

    public static QueryLinkeantcodeAntcodeUserpasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeUserpasswordResponse self = new QueryLinkeantcodeAntcodeUserpasswordResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeUserpasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeUserpasswordResponse setBody(QueryLinkeantcodeAntcodeUserpasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeUserpasswordResponseBody getBody() {
        return this.body;
    }

}
