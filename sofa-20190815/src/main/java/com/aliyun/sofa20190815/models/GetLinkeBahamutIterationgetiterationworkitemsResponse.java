// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetiterationworkitemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationgetiterationworkitemsResponseBody body;

    public static GetLinkeBahamutIterationgetiterationworkitemsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetiterationworkitemsResponse self = new GetLinkeBahamutIterationgetiterationworkitemsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetiterationworkitemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationgetiterationworkitemsResponse setBody(GetLinkeBahamutIterationgetiterationworkitemsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationgetiterationworkitemsResponseBody getBody() {
        return this.body;
    }

}
