// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByInfoV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateOmsEndpointConnectionByInfoV2ResponseBody body;

    public static ValidateOmsEndpointConnectionByInfoV2Response build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByInfoV2Response self = new ValidateOmsEndpointConnectionByInfoV2Response();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByInfoV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateOmsEndpointConnectionByInfoV2Response setBody(ValidateOmsEndpointConnectionByInfoV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateOmsEndpointConnectionByInfoV2ResponseBody getBody() {
        return this.body;
    }

}
