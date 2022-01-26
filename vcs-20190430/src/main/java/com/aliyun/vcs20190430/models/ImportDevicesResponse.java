// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class ImportDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportDevicesResponseBody body;

    public static ImportDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDevicesResponse self = new ImportDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ImportDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDevicesResponse setBody(ImportDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDevicesResponseBody getBody() {
        return this.body;
    }

}
