// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class PayOrderCallbackResponseBody extends TeaModel {
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

    public static PayOrderCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PayOrderCallbackResponseBody self = new PayOrderCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public PayOrderCallbackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PayOrderCallbackResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PayOrderCallbackResponseBody setErrorInfoList(java.util.List<String> errorInfoList) {
        this.errorInfoList = errorInfoList;
        return this;
    }
    public java.util.List<String> getErrorInfoList() {
        return this.errorInfoList;
    }

    public PayOrderCallbackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PayOrderCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PayOrderCallbackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PayOrderCallbackResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

}
