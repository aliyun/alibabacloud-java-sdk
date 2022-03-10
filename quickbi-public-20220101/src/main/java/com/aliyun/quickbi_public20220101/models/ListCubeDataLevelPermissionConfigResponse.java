// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListCubeDataLevelPermissionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCubeDataLevelPermissionConfigResponseBody body;

    public static ListCubeDataLevelPermissionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCubeDataLevelPermissionConfigResponse self = new ListCubeDataLevelPermissionConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListCubeDataLevelPermissionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCubeDataLevelPermissionConfigResponse setBody(ListCubeDataLevelPermissionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCubeDataLevelPermissionConfigResponseBody getBody() {
        return this.body;
    }

}
