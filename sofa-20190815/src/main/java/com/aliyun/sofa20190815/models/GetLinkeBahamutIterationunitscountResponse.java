// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationunitscountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationunitscountResponseBody body;

    public static GetLinkeBahamutIterationunitscountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationunitscountResponse self = new GetLinkeBahamutIterationunitscountResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationunitscountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationunitscountResponse setBody(GetLinkeBahamutIterationunitscountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationunitscountResponseBody getBody() {
        return this.body;
    }

}
