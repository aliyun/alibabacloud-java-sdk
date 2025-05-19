// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneEnableAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSwimmingLaneEnableAttributeResponseBody body;

    public static UpdateSwimmingLaneEnableAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneEnableAttributeResponse self = new UpdateSwimmingLaneEnableAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneEnableAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSwimmingLaneEnableAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSwimmingLaneEnableAttributeResponse setBody(UpdateSwimmingLaneEnableAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSwimmingLaneEnableAttributeResponseBody getBody() {
        return this.body;
    }

}
