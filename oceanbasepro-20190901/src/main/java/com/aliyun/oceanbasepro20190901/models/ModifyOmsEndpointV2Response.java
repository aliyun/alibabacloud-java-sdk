// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyOmsEndpointV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyOmsEndpointV2ResponseBody body;

    public static ModifyOmsEndpointV2Response build(java.util.Map<String, ?> map) throws Exception {
        ModifyOmsEndpointV2Response self = new ModifyOmsEndpointV2Response();
        return TeaModel.build(map, self);
    }

    public ModifyOmsEndpointV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOmsEndpointV2Response setBody(ModifyOmsEndpointV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOmsEndpointV2ResponseBody getBody() {
        return this.body;
    }

}
