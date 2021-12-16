// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbfplangjpterprecall1_0_0.models;

import com.aliyun.tea.*;

public class BhOrderChangeResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("success")
    public Boolean success;

    public static BhOrderChangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BhOrderChangeResponseBody self = new BhOrderChangeResponseBody();
        return TeaModel.build(map, self);
    }

    public BhOrderChangeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BhOrderChangeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public BhOrderChangeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
