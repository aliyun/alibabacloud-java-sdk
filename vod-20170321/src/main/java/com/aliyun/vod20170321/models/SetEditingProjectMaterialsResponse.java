// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetEditingProjectMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetEditingProjectMaterialsResponseBody body;

    public static SetEditingProjectMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEditingProjectMaterialsResponse self = new SetEditingProjectMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public SetEditingProjectMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetEditingProjectMaterialsResponse setBody(SetEditingProjectMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEditingProjectMaterialsResponseBody getBody() {
        return this.body;
    }

}
