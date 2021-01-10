// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSJdbcwriterOverviewResponseBody body;

    public static GetDWSJdbcwriterOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterOverviewResponse self = new GetDWSJdbcwriterOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSJdbcwriterOverviewResponse setBody(GetDWSJdbcwriterOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSJdbcwriterOverviewResponseBody getBody() {
        return this.body;
    }

}
