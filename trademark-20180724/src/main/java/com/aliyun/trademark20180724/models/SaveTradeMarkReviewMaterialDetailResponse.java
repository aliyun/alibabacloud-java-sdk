// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveTradeMarkReviewMaterialDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTradeMarkReviewMaterialDetailResponseBody body;

    public static SaveTradeMarkReviewMaterialDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTradeMarkReviewMaterialDetailResponse self = new SaveTradeMarkReviewMaterialDetailResponse();
        return TeaModel.build(map, self);
    }

    public SaveTradeMarkReviewMaterialDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTradeMarkReviewMaterialDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTradeMarkReviewMaterialDetailResponse setBody(SaveTradeMarkReviewMaterialDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTradeMarkReviewMaterialDetailResponseBody getBody() {
        return this.body;
    }

}
