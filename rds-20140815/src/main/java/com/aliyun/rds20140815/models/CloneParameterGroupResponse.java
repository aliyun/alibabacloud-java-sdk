// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CloneParameterGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneParameterGroupResponse setBody(CloneParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneParameterGroupResponseBody getBody() {
        return this.body;
    }

}
