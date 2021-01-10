// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCongfigSidemenuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasCongfigSidemenuResponseBody body;

    public static UpdateHasCongfigSidemenuResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCongfigSidemenuResponse self = new UpdateHasCongfigSidemenuResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasCongfigSidemenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasCongfigSidemenuResponse setBody(UpdateHasCongfigSidemenuResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasCongfigSidemenuResponseBody getBody() {
        return this.body;
    }

}
