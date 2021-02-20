// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteMPULayoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMPULayoutResponseBody body;

    public static DeleteMPULayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMPULayoutResponse self = new DeleteMPULayoutResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMPULayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMPULayoutResponse setBody(DeleteMPULayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMPULayoutResponseBody getBody() {
        return this.body;
    }

}
