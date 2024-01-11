// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class PrepaidCeaseResponseBody extends TeaModel {
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

    public static PrepaidCeaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrepaidCeaseResponseBody self = new PrepaidCeaseResponseBody();
        return TeaModel.build(map, self);
    }

    public PrepaidCeaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PrepaidCeaseResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public PrepaidCeaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PrepaidCeaseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PrepaidCeaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrepaidCeaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
