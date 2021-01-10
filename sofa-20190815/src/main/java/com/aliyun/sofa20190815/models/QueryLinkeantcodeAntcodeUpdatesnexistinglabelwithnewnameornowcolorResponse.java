// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorResponseBody body;

    public static QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorResponse self = new QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorResponse setBody(QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorResponseBody getBody() {
        return this.body;
    }

}
