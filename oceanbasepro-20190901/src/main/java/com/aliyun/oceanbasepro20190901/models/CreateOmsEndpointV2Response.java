// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsEndpointV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOmsEndpointV2ResponseBody body;

    public static CreateOmsEndpointV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsEndpointV2Response self = new CreateOmsEndpointV2Response();
        return TeaModel.build(map, self);
    }

    public CreateOmsEndpointV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOmsEndpointV2Response setBody(CreateOmsEndpointV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOmsEndpointV2ResponseBody getBody() {
        return this.body;
    }

}
