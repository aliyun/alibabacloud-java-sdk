// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponseBody body;

    public static QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse self = new QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponse setBody(QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexeccancelexecidResponseBody getBody() {
        return this.body;
    }

}
