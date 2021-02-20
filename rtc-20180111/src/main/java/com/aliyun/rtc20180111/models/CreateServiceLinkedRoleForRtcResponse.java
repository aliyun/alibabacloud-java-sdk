// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForRtcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceLinkedRoleForRtcResponseBody body;

    public static CreateServiceLinkedRoleForRtcResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleForRtcResponse self = new CreateServiceLinkedRoleForRtcResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleForRtcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceLinkedRoleForRtcResponse setBody(CreateServiceLinkedRoleForRtcResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceLinkedRoleForRtcResponseBody getBody() {
        return this.body;
    }

}
