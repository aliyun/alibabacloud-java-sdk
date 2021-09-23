// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceUpgradeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceUpgradeInfoResponseBody body;

    public static GetInstanceUpgradeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUpgradeInfoResponse self = new GetInstanceUpgradeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceUpgradeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceUpgradeInfoResponse setBody(GetInstanceUpgradeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceUpgradeInfoResponseBody getBody() {
        return this.body;
    }

}
