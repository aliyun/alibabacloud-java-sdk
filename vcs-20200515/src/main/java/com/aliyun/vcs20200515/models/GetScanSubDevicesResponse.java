// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetScanSubDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScanSubDevicesResponseBody body;

    public static GetScanSubDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScanSubDevicesResponse self = new GetScanSubDevicesResponse();
        return TeaModel.build(map, self);
    }

    public GetScanSubDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScanSubDevicesResponse setBody(GetScanSubDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScanSubDevicesResponseBody getBody() {
        return this.body;
    }

}
