// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeUserkeyskeyidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeUserkeyskeyidResponseBody body;

    public static QueryLinkeantcodeAntcodeUserkeyskeyidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeUserkeyskeyidResponse self = new QueryLinkeantcodeAntcodeUserkeyskeyidResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeUserkeyskeyidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeUserkeyskeyidResponse setBody(QueryLinkeantcodeAntcodeUserkeyskeyidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeUserkeyskeyidResponseBody getBody() {
        return this.body;
    }

}
