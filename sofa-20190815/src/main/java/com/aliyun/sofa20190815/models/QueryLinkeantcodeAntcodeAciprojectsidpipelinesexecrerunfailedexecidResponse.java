// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody body;

    public static QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse self = new QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponse setBody(QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody getBody() {
        return this.body;
    }

}
