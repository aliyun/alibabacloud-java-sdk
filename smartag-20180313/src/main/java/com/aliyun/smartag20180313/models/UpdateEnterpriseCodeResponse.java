// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEnterpriseCodeResponseBody body;

    public static UpdateEnterpriseCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseCodeResponse self = new UpdateEnterpriseCodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnterpriseCodeResponse setBody(UpdateEnterpriseCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnterpriseCodeResponseBody getBody() {
        return this.body;
    }

}
