// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateMPULayoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMPULayoutResponseBody body;

    public static UpdateMPULayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMPULayoutResponse self = new UpdateMPULayoutResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMPULayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMPULayoutResponse setBody(UpdateMPULayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMPULayoutResponseBody getBody() {
        return this.body;
    }

}
