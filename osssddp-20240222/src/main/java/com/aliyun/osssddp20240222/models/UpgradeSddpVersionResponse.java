// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.osssddp20240222.models;

import com.aliyun.tea.*;

public class UpgradeSddpVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeSddpVersionResponseBody body;

    public static UpgradeSddpVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSddpVersionResponse self = new UpgradeSddpVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeSddpVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeSddpVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeSddpVersionResponse setBody(UpgradeSddpVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeSddpVersionResponseBody getBody() {
        return this.body;
    }

}
