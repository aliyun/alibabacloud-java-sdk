// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveHotspotTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveHotspotTagResponseBody body;

    public static SaveHotspotTagResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveHotspotTagResponse self = new SaveHotspotTagResponse();
        return TeaModel.build(map, self);
    }

    public SaveHotspotTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveHotspotTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveHotspotTagResponse setBody(SaveHotspotTagResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveHotspotTagResponseBody getBody() {
        return this.body;
    }

}
