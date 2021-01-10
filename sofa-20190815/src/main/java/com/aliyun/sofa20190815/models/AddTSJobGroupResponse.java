// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddTSJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddTSJobGroupResponseBody body;

    public static AddTSJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTSJobGroupResponse self = new AddTSJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddTSJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTSJobGroupResponse setBody(AddTSJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTSJobGroupResponseBody getBody() {
        return this.body;
    }

}
