// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateMPULayoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMPULayoutResponseBody body;

    public static CreateMPULayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMPULayoutResponse self = new CreateMPULayoutResponse();
        return TeaModel.build(map, self);
    }

    public CreateMPULayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMPULayoutResponse setBody(CreateMPULayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMPULayoutResponseBody getBody() {
        return this.body;
    }

}
