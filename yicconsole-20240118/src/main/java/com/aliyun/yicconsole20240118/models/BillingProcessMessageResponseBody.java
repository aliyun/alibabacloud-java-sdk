// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class BillingProcessMessageResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Synchro")
    public Boolean synchro;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static BillingProcessMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BillingProcessMessageResponseBody self = new BillingProcessMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public BillingProcessMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BillingProcessMessageResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public BillingProcessMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BillingProcessMessageResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public BillingProcessMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BillingProcessMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
