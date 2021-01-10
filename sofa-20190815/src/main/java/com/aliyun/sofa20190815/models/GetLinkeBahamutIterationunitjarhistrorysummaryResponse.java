// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationunitjarhistrorysummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody body;

    public static GetLinkeBahamutIterationunitjarhistrorysummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationunitjarhistrorysummaryResponse self = new GetLinkeBahamutIterationunitjarhistrorysummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponse setBody(GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody getBody() {
        return this.body;
    }

}
