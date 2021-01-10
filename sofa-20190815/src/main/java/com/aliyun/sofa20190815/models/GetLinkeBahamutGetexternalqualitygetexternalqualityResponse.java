// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetexternalqualitygetexternalqualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutGetexternalqualitygetexternalqualityResponseBody body;

    public static GetLinkeBahamutGetexternalqualitygetexternalqualityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetexternalqualitygetexternalqualityResponse self = new GetLinkeBahamutGetexternalqualitygetexternalqualityResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetexternalqualitygetexternalqualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutGetexternalqualitygetexternalqualityResponse setBody(GetLinkeBahamutGetexternalqualitygetexternalqualityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutGetexternalqualitygetexternalqualityResponseBody getBody() {
        return this.body;
    }

}
