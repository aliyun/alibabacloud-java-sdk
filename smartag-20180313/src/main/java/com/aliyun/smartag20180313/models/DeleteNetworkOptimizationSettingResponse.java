// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteNetworkOptimizationSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkOptimizationSettingResponseBody body;

    public static DeleteNetworkOptimizationSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkOptimizationSettingResponse self = new DeleteNetworkOptimizationSettingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkOptimizationSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkOptimizationSettingResponse setBody(DeleteNetworkOptimizationSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkOptimizationSettingResponseBody getBody() {
        return this.body;
    }

}
