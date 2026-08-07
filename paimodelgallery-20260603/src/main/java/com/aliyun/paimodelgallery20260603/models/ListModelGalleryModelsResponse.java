// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class ListModelGalleryModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelGalleryModelsResponseBody body;

    public static ListModelGalleryModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelGalleryModelsResponse self = new ListModelGalleryModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListModelGalleryModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelGalleryModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelGalleryModelsResponse setBody(ListModelGalleryModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelGalleryModelsResponseBody getBody() {
        return this.body;
    }

}
