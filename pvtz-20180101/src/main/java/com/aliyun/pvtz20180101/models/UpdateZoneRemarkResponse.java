// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateZoneRemarkResponseBody body;

    public static UpdateZoneRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRemarkResponse self = new UpdateZoneRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateZoneRemarkResponse setBody(UpdateZoneRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateZoneRemarkResponseBody getBody() {
        return this.body;
    }

}
