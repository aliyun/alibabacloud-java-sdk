// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationsgetunitscountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationsgetunitscountResponseBody body;

    public static GetLinkeBahamutIterationsgetunitscountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationsgetunitscountResponse self = new GetLinkeBahamutIterationsgetunitscountResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationsgetunitscountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationsgetunitscountResponse setBody(GetLinkeBahamutIterationsgetunitscountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationsgetunitscountResponseBody getBody() {
        return this.body;
    }

}
