// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class GetAllStoreDataByTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllStoreDataByTypeResponseBody body;

    public static GetAllStoreDataByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllStoreDataByTypeResponse self = new GetAllStoreDataByTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetAllStoreDataByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllStoreDataByTypeResponse setBody(GetAllStoreDataByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllStoreDataByTypeResponseBody getBody() {
        return this.body;
    }

}
