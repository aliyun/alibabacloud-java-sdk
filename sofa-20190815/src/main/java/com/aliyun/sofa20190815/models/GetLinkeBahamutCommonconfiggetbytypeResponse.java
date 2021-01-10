// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCommonconfiggetbytypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutCommonconfiggetbytypeResponseBody body;

    public static GetLinkeBahamutCommonconfiggetbytypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCommonconfiggetbytypeResponse self = new GetLinkeBahamutCommonconfiggetbytypeResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCommonconfiggetbytypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutCommonconfiggetbytypeResponse setBody(GetLinkeBahamutCommonconfiggetbytypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutCommonconfiggetbytypeResponseBody getBody() {
        return this.body;
    }

}
