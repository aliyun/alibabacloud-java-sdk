// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionPromotionResponseBody extends TeaModel {
    @NameInMap("BizErrorCode")
    public String bizErrorCode;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<java.util.Map<String, ?>> result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryUnionPromotionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionPromotionResponseBody self = new QueryUnionPromotionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUnionPromotionResponseBody setBizErrorCode(String bizErrorCode) {
        this.bizErrorCode = bizErrorCode;
        return this;
    }
    public String getBizErrorCode() {
        return this.bizErrorCode;
    }

    public QueryUnionPromotionResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public QueryUnionPromotionResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryUnionPromotionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUnionPromotionResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    public QueryUnionPromotionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
