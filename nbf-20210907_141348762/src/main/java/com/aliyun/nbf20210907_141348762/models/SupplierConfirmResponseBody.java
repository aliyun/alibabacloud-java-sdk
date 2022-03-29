// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210907_141348762.models;

import com.aliyun.tea.*;

public class SupplierConfirmResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("result")
    public String result;

    @NameInMap("success")
    public Boolean success;

    public static SupplierConfirmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SupplierConfirmResponseBody self = new SupplierConfirmResponseBody();
        return TeaModel.build(map, self);
    }

    public SupplierConfirmResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SupplierConfirmResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SupplierConfirmResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public SupplierConfirmResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
