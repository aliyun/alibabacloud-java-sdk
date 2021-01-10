// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectPodpluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasInspectPodpluginResponseBody body;

    public static CreateHasInspectPodpluginResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectPodpluginResponse self = new CreateHasInspectPodpluginResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectPodpluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasInspectPodpluginResponse setBody(CreateHasInspectPodpluginResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasInspectPodpluginResponseBody getBody() {
        return this.body;
    }

}
