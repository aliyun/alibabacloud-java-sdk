// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyAdvanceConfigFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAdvanceConfigFileResponseBody body;

    public static ModifyAdvanceConfigFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvanceConfigFileResponse self = new ModifyAdvanceConfigFileResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAdvanceConfigFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAdvanceConfigFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAdvanceConfigFileResponse setBody(ModifyAdvanceConfigFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAdvanceConfigFileResponseBody getBody() {
        return this.body;
    }

}
