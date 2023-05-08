// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetSelectionTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAssetSelectionTargetResponseBody body;

    public static ListAssetSelectionTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssetSelectionTargetResponse self = new ListAssetSelectionTargetResponse();
        return TeaModel.build(map, self);
    }

    public ListAssetSelectionTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssetSelectionTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssetSelectionTargetResponse setBody(ListAssetSelectionTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssetSelectionTargetResponseBody getBody() {
        return this.body;
    }

}
