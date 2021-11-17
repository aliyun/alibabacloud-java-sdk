// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf_vpc_cloud20211115_131123360.models;

import com.aliyun.tea.*;

public class AdadaAResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("result")
    public String result;

    @NameInMap("success")
    public Boolean success;

    public static AdadaAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AdadaAResponseBody self = new AdadaAResponseBody();
        return TeaModel.build(map, self);
    }

    public AdadaAResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AdadaAResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AdadaAResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public AdadaAResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
