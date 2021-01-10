// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsergetbyempidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUsergetbyempidResponseBody body;

    public static GetLinkeBahamutUsergetbyempidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsergetbyempidResponse self = new GetLinkeBahamutUsergetbyempidResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsergetbyempidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUsergetbyempidResponse setBody(GetLinkeBahamutUsergetbyempidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUsergetbyempidResponseBody getBody() {
        return this.body;
    }

}
