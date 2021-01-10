// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDWSDscfgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDWSDscfgResponseBody body;

    public static UpdateDWSDscfgResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDWSDscfgResponse self = new UpdateDWSDscfgResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDWSDscfgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDWSDscfgResponse setBody(UpdateDWSDscfgResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDWSDscfgResponseBody getBody() {
        return this.body;
    }

}
