// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodStorageForAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddVodStorageForAppResponseBody body;

    public static AddVodStorageForAppResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVodStorageForAppResponse self = new AddVodStorageForAppResponse();
        return TeaModel.build(map, self);
    }

    public AddVodStorageForAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVodStorageForAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddVodStorageForAppResponse setBody(AddVodStorageForAppResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVodStorageForAppResponseBody getBody() {
        return this.body;
    }

}
