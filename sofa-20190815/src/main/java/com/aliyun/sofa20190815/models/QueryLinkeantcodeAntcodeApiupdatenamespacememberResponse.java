// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeApiupdatenamespacememberResponseBody body;

    public static QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse self = new QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse setBody(QueryLinkeantcodeAntcodeApiupdatenamespacememberResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeApiupdatenamespacememberResponseBody getBody() {
        return this.body;
    }

}
