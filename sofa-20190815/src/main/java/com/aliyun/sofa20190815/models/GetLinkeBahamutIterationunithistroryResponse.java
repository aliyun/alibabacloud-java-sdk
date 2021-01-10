// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationunithistroryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationunithistroryResponseBody body;

    public static GetLinkeBahamutIterationunithistroryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationunithistroryResponse self = new GetLinkeBahamutIterationunithistroryResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationunithistroryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationunithistroryResponse setBody(GetLinkeBahamutIterationunithistroryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationunithistroryResponseBody getBody() {
        return this.body;
    }

}
