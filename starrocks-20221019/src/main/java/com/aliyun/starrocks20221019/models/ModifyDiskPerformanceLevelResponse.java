// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyDiskPerformanceLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDiskPerformanceLevelResponseBody body;

    public static ModifyDiskPerformanceLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskPerformanceLevelResponse self = new ModifyDiskPerformanceLevelResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskPerformanceLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskPerformanceLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskPerformanceLevelResponse setBody(ModifyDiskPerformanceLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskPerformanceLevelResponseBody getBody() {
        return this.body;
    }

}
