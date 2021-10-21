// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateSendMaterialNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSendMaterialNumResponseBody body;

    public static UpdateSendMaterialNumResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSendMaterialNumResponse self = new UpdateSendMaterialNumResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSendMaterialNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSendMaterialNumResponse setBody(UpdateSendMaterialNumResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSendMaterialNumResponseBody getBody() {
        return this.body;
    }

}
