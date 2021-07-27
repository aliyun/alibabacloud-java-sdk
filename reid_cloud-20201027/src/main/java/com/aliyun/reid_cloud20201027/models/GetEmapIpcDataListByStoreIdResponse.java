// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class GetEmapIpcDataListByStoreIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEmapIpcDataListByStoreIdResponseBody body;

    public static GetEmapIpcDataListByStoreIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmapIpcDataListByStoreIdResponse self = new GetEmapIpcDataListByStoreIdResponse();
        return TeaModel.build(map, self);
    }

    public GetEmapIpcDataListByStoreIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmapIpcDataListByStoreIdResponse setBody(GetEmapIpcDataListByStoreIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmapIpcDataListByStoreIdResponseBody getBody() {
        return this.body;
    }

}
