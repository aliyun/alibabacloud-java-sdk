// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class PayOrderCallbackResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("data")
    public String data;

    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    // 是否同步
    @NameInMap("synchro")
    public Boolean synchro;

    public static PayOrderCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PayOrderCallbackResponseBody self = new PayOrderCallbackResponseBody();
        return TeaModel.build(map, self);
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

    public PayOrderCallbackResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PayOrderCallbackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PayOrderCallbackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PayOrderCallbackResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

}
