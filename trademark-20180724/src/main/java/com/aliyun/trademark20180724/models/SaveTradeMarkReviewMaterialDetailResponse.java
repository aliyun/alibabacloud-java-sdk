// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveTradeMarkReviewMaterialDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveTradeMarkReviewMaterialDetailResponse setBody(SaveTradeMarkReviewMaterialDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTradeMarkReviewMaterialDetailResponseBody getBody() {
        return this.body;
    }

}
