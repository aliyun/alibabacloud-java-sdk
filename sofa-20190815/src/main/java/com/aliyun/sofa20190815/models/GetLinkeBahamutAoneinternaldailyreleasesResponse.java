// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaldailyreleasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody body;

    public static GetLinkeBahamutAoneinternaldailyreleasesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaldailyreleasesResponse self = new GetLinkeBahamutAoneinternaldailyreleasesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponse setBody(GetLinkeBahamutAoneinternaldailyreleasesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody getBody() {
        return this.body;
    }

}
