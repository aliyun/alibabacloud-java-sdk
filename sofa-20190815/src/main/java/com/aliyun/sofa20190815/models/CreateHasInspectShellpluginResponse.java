// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectShellpluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasInspectShellpluginResponseBody body;

    public static CreateHasInspectShellpluginResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectShellpluginResponse self = new CreateHasInspectShellpluginResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectShellpluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasInspectShellpluginResponse setBody(CreateHasInspectShellpluginResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasInspectShellpluginResponseBody getBody() {
        return this.body;
    }

}
