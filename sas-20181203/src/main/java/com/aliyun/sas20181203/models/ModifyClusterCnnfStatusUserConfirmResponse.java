// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClusterCnnfStatusUserConfirmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterCnnfStatusUserConfirmResponseBody body;

    public static ModifyClusterCnnfStatusUserConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterCnnfStatusUserConfirmResponse self = new ModifyClusterCnnfStatusUserConfirmResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterCnnfStatusUserConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterCnnfStatusUserConfirmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterCnnfStatusUserConfirmResponse setBody(ModifyClusterCnnfStatusUserConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterCnnfStatusUserConfirmResponseBody getBody() {
        return this.body;
    }

}
