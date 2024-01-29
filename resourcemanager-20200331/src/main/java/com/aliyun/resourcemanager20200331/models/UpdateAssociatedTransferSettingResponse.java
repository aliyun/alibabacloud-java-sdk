// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAssociatedTransferSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAssociatedTransferSettingResponseBody body;

    public static UpdateAssociatedTransferSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssociatedTransferSettingResponse self = new UpdateAssociatedTransferSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAssociatedTransferSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAssociatedTransferSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAssociatedTransferSettingResponse setBody(UpdateAssociatedTransferSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAssociatedTransferSettingResponseBody getBody() {
        return this.body;
    }

}
