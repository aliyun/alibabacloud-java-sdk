// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEditingProjectMaterialsResponseBody body;

    public static GetEditingProjectMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectMaterialsResponse self = new GetEditingProjectMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEditingProjectMaterialsResponse setBody(GetEditingProjectMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEditingProjectMaterialsResponseBody getBody() {
        return this.body;
    }

}
