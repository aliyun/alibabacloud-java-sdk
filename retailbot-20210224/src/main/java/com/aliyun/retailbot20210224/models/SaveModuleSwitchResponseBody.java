// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SaveModuleSwitchResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 保存是否成功
    @NameInMap("Data")
    public Boolean data;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static SaveModuleSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveModuleSwitchResponseBody self = new SaveModuleSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveModuleSwitchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveModuleSwitchResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SaveModuleSwitchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveModuleSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveModuleSwitchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
