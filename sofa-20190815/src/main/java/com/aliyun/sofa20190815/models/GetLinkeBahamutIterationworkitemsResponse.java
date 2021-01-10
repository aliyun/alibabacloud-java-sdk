// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationworkitemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationworkitemsResponseBody body;

    public static GetLinkeBahamutIterationworkitemsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationworkitemsResponse self = new GetLinkeBahamutIterationworkitemsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationworkitemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationworkitemsResponse setBody(GetLinkeBahamutIterationworkitemsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationworkitemsResponseBody getBody() {
        return this.body;
    }

}
