// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponseBody body;

    public static QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse self = new QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse setBody(QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponseBody getBody() {
        return this.body;
    }

}
