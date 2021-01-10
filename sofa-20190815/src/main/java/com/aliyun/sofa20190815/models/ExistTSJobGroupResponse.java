// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExistTSJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExistTSJobGroupResponseBody body;

    public static ExistTSJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistTSJobGroupResponse self = new ExistTSJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public ExistTSJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExistTSJobGroupResponse setBody(ExistTSJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ExistTSJobGroupResponseBody getBody() {
        return this.body;
    }

}
