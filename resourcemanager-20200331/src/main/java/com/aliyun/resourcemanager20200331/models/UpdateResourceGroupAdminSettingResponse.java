// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupAdminSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceGroupAdminSettingResponseBody body;

    public static UpdateResourceGroupAdminSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupAdminSettingResponse self = new UpdateResourceGroupAdminSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupAdminSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceGroupAdminSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceGroupAdminSettingResponse setBody(UpdateResourceGroupAdminSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceGroupAdminSettingResponseBody getBody() {
        return this.body;
    }

}
