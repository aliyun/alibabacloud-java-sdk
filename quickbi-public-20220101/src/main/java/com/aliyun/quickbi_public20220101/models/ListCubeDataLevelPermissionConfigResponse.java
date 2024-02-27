// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListCubeDataLevelPermissionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListCubeDataLevelPermissionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCubeDataLevelPermissionConfigResponse setBody(ListCubeDataLevelPermissionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCubeDataLevelPermissionConfigResponseBody getBody() {
        return this.body;
    }

}
