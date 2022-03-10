// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionRuleConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDataLevelPermissionRuleConfigResponseBody body;

    public static SetDataLevelPermissionRuleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionRuleConfigResponse self = new SetDataLevelPermissionRuleConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionRuleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDataLevelPermissionRuleConfigResponse setBody(SetDataLevelPermissionRuleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDataLevelPermissionRuleConfigResponseBody getBody() {
        return this.body;
    }

}
