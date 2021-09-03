// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetAudienceMarketingInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAudienceMarketingInfoResponseBody body;

    public static GetAudienceMarketingInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudienceMarketingInfoResponse self = new GetAudienceMarketingInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAudienceMarketingInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAudienceMarketingInfoResponse setBody(GetAudienceMarketingInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAudienceMarketingInfoResponseBody getBody() {
        return this.body;
    }

}
