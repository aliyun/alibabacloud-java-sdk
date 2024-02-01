// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnAttachmentAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpnAttachmentAttributeResponseBody body;

    public static ModifyVpnAttachmentAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnAttachmentAttributeResponse self = new ModifyVpnAttachmentAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpnAttachmentAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpnAttachmentAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpnAttachmentAttributeResponse setBody(ModifyVpnAttachmentAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpnAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

}
