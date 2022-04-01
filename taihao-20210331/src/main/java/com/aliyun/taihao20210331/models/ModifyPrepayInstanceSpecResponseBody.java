// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // message
    @NameInMap("Message")
    public String message;

    // data
    @NameInMap("data")
    public String data;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    // success
    @NameInMap("success")
    public Boolean success;

    public static ModifyPrepayInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecResponseBody self = new ModifyPrepayInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyPrepayInstanceSpecResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyPrepayInstanceSpecResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ModifyPrepayInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPrepayInstanceSpecResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
