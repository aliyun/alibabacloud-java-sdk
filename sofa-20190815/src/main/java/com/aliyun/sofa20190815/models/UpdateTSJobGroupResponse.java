// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateTSJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTSJobGroupResponseBody body;

    public static UpdateTSJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTSJobGroupResponse self = new UpdateTSJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTSJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTSJobGroupResponse setBody(UpdateTSJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTSJobGroupResponseBody getBody() {
        return this.body;
    }

}
