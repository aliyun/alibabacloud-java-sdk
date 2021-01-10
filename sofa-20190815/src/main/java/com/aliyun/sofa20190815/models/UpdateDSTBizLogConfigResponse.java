// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDSTBizLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDSTBizLogConfigResponseBody body;

    public static UpdateDSTBizLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDSTBizLogConfigResponse self = new UpdateDSTBizLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDSTBizLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDSTBizLogConfigResponse setBody(UpdateDSTBizLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDSTBizLogConfigResponseBody getBody() {
        return this.body;
    }

}
