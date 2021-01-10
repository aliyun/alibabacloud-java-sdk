// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskRuleResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskRuleResultResponseBody body;

    public static GetClriskRuleResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskRuleResultResponse self = new GetClriskRuleResultResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskRuleResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskRuleResultResponse setBody(GetClriskRuleResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskRuleResultResponseBody getBody() {
        return this.body;
    }

}
