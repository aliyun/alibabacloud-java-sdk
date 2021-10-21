// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveTradeMarkReviewMaterialDetailResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SaveTradeMarkReviewMaterialDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTradeMarkReviewMaterialDetailResponseBody self = new SaveTradeMarkReviewMaterialDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTradeMarkReviewMaterialDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SaveTradeMarkReviewMaterialDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveTradeMarkReviewMaterialDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
