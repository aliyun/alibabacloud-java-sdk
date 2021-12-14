// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class CompleteTradeResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    @NameInMap("errorInfoList")
    public java.util.List<String> errorInfoList;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("synchro")
    public Boolean synchro;

    public static CompleteTradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteTradeResponseBody self = new CompleteTradeResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteTradeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CompleteTradeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CompleteTradeResponseBody setErrorInfoList(java.util.List<String> errorInfoList) {
        this.errorInfoList = errorInfoList;
        return this;
    }
    public java.util.List<String> getErrorInfoList() {
        return this.errorInfoList;
    }

    public CompleteTradeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CompleteTradeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompleteTradeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CompleteTradeResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

}
