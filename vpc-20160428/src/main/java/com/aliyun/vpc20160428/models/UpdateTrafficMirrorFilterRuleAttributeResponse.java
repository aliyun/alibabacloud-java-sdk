// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorFilterRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTrafficMirrorFilterRuleAttributeResponseBody body;

    public static UpdateTrafficMirrorFilterRuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMirrorFilterRuleAttributeResponse self = new UpdateTrafficMirrorFilterRuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMirrorFilterRuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrafficMirrorFilterRuleAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrafficMirrorFilterRuleAttributeResponse setBody(UpdateTrafficMirrorFilterRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrafficMirrorFilterRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
