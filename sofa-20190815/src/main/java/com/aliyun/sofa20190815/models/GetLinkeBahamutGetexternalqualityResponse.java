// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetexternalqualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutGetexternalqualityResponseBody body;

    public static GetLinkeBahamutGetexternalqualityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetexternalqualityResponse self = new GetLinkeBahamutGetexternalqualityResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetexternalqualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutGetexternalqualityResponse setBody(GetLinkeBahamutGetexternalqualityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutGetexternalqualityResponseBody getBody() {
        return this.body;
    }

}
