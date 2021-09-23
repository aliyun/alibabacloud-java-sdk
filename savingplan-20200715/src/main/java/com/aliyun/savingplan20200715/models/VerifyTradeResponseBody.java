// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class VerifyTradeResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("message")
    public String message;

    @NameInMap("data")
    public String data;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("synchro")
    public Boolean synchro;

    @NameInMap("errorInfoList")
    public java.util.List<String> errorInfoList;

    public static VerifyTradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyTradeResponseBody self = new VerifyTradeResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyTradeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyTradeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyTradeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyTradeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public VerifyTradeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public VerifyTradeResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public VerifyTradeResponseBody setErrorInfoList(java.util.List<String> errorInfoList) {
        this.errorInfoList = errorInfoList;
        return this;
    }
    public java.util.List<String> getErrorInfoList() {
        return this.errorInfoList;
    }

}
