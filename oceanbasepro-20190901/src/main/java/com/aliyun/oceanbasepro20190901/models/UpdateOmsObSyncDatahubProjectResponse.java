// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateOmsObSyncDatahubProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOmsObSyncDatahubProjectResponseBody body;

    public static UpdateOmsObSyncDatahubProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOmsObSyncDatahubProjectResponse self = new UpdateOmsObSyncDatahubProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOmsObSyncDatahubProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOmsObSyncDatahubProjectResponse setBody(UpdateOmsObSyncDatahubProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOmsObSyncDatahubProjectResponseBody getBody() {
        return this.body;
    }

}
