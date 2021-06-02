// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveHotspotConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveHotspotConfigResponseBody body;

    public static SaveHotspotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveHotspotConfigResponse self = new SaveHotspotConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveHotspotConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveHotspotConfigResponse setBody(SaveHotspotConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveHotspotConfigResponseBody getBody() {
        return this.body;
    }

}
