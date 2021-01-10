// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectRulesetdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectRulesetdetailResponseBody body;

    public static GetHasInspectRulesetdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectRulesetdetailResponse self = new GetHasInspectRulesetdetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectRulesetdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectRulesetdetailResponse setBody(GetHasInspectRulesetdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectRulesetdetailResponseBody getBody() {
        return this.body;
    }

}
