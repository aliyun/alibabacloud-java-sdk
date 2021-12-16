// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbfplangjpterpspi1_0_0.models;

import com.aliyun.tea.*;

public class CreatePlanOrderResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("success")
    public Boolean success;

    public static CreatePlanOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePlanOrderResponseBody self = new CreatePlanOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePlanOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreatePlanOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreatePlanOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
