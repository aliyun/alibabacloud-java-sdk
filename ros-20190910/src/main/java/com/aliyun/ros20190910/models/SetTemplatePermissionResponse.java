// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetTemplatePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetTemplatePermissionResponseBody body;

    public static SetTemplatePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetTemplatePermissionResponse self = new SetTemplatePermissionResponse();
        return TeaModel.build(map, self);
    }

    public SetTemplatePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetTemplatePermissionResponse setBody(SetTemplatePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetTemplatePermissionResponseBody getBody() {
        return this.body;
    }

}
