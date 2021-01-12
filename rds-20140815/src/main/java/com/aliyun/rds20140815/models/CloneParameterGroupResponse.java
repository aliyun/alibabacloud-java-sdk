// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloneParameterGroupResponseBody body;

    public static CloneParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneParameterGroupResponse self = new CloneParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public CloneParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneParameterGroupResponse setBody(CloneParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneParameterGroupResponseBody getBody() {
        return this.body;
    }

}
