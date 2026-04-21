// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ListYikeAssetFoldersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListYikeAssetFoldersResponseBody body;

    public static ListYikeAssetFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListYikeAssetFoldersResponse self = new ListYikeAssetFoldersResponse();
        return TeaModel.build(map, self);
    }

    public ListYikeAssetFoldersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListYikeAssetFoldersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListYikeAssetFoldersResponse setBody(ListYikeAssetFoldersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListYikeAssetFoldersResponseBody getBody() {
        return this.body;
    }

}
