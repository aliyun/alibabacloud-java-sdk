// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class SyncAlertGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncAlertGroupsResponseBody body;

    public static SyncAlertGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncAlertGroupsResponse self = new SyncAlertGroupsResponse();
        return TeaModel.build(map, self);
    }

    public SyncAlertGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncAlertGroupsResponse setBody(SyncAlertGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncAlertGroupsResponseBody getBody() {
        return this.body;
    }

}
