// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetAutoInjectionLabelSyncStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAutoInjectionLabelSyncStatusResponseBody body;

    public static GetAutoInjectionLabelSyncStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoInjectionLabelSyncStatusResponse self = new GetAutoInjectionLabelSyncStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoInjectionLabelSyncStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoInjectionLabelSyncStatusResponse setBody(GetAutoInjectionLabelSyncStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoInjectionLabelSyncStatusResponseBody getBody() {
        return this.body;
    }

}
