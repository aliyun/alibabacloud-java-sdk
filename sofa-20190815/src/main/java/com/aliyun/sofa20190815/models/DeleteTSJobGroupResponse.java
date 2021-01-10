// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteTSJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTSJobGroupResponseBody body;

    public static DeleteTSJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTSJobGroupResponse self = new DeleteTSJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTSJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTSJobGroupResponse setBody(DeleteTSJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTSJobGroupResponseBody getBody() {
        return this.body;
    }

}
