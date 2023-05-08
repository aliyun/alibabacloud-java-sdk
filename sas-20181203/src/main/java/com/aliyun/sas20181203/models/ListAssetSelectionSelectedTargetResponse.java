// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetSelectionSelectedTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAssetSelectionSelectedTargetResponseBody body;

    public static ListAssetSelectionSelectedTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssetSelectionSelectedTargetResponse self = new ListAssetSelectionSelectedTargetResponse();
        return TeaModel.build(map, self);
    }

    public ListAssetSelectionSelectedTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssetSelectionSelectedTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssetSelectionSelectedTargetResponse setBody(ListAssetSelectionSelectedTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssetSelectionSelectedTargetResponseBody getBody() {
        return this.body;
    }

}
