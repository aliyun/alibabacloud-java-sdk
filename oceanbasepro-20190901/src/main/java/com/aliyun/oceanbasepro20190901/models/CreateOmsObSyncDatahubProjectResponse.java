// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsObSyncDatahubProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOmsObSyncDatahubProjectResponseBody body;

    public static CreateOmsObSyncDatahubProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsObSyncDatahubProjectResponse self = new CreateOmsObSyncDatahubProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateOmsObSyncDatahubProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOmsObSyncDatahubProjectResponse setBody(CreateOmsObSyncDatahubProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOmsObSyncDatahubProjectResponseBody getBody() {
        return this.body;
    }

}
