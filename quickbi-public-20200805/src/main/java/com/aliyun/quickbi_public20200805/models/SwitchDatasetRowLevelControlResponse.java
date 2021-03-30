// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class SwitchDatasetRowLevelControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchDatasetRowLevelControlResponseBody body;

    public static SwitchDatasetRowLevelControlResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchDatasetRowLevelControlResponse self = new SwitchDatasetRowLevelControlResponse();
        return TeaModel.build(map, self);
    }

    public SwitchDatasetRowLevelControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchDatasetRowLevelControlResponse setBody(SwitchDatasetRowLevelControlResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchDatasetRowLevelControlResponseBody getBody() {
        return this.body;
    }

}
