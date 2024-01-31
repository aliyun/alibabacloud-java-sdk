// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetImportantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAssetImportantResponseBody body;

    public static ModifyAssetImportantResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetImportantResponse self = new ModifyAssetImportantResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAssetImportantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAssetImportantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAssetImportantResponse setBody(ModifyAssetImportantResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAssetImportantResponseBody getBody() {
        return this.body;
    }

}
