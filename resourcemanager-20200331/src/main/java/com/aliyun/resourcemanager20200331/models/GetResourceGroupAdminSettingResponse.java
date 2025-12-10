// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupAdminSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceGroupAdminSettingResponseBody body;

    public static GetResourceGroupAdminSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupAdminSettingResponse self = new GetResourceGroupAdminSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupAdminSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceGroupAdminSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceGroupAdminSettingResponse setBody(GetResourceGroupAdminSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceGroupAdminSettingResponseBody getBody() {
        return this.body;
    }

}
