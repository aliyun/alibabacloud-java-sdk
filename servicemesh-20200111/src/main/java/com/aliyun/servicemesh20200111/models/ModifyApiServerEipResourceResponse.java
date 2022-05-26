// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyApiServerEipResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyApiServerEipResourceResponseBody body;

    public static ModifyApiServerEipResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiServerEipResourceResponse self = new ModifyApiServerEipResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApiServerEipResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApiServerEipResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApiServerEipResourceResponse setBody(ModifyApiServerEipResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiServerEipResourceResponseBody getBody() {
        return this.body;
    }

}
