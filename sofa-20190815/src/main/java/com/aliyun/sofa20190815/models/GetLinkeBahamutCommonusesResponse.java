// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCommonusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutCommonusesResponseBody body;

    public static GetLinkeBahamutCommonusesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCommonusesResponse self = new GetLinkeBahamutCommonusesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCommonusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutCommonusesResponse setBody(GetLinkeBahamutCommonusesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutCommonusesResponseBody getBody() {
        return this.body;
    }

}
