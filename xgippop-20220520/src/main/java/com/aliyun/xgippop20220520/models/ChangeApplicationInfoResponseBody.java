// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ChangeApplicationInfoResponseBody extends TeaModel {
    // 应用id
    @NameInMap("AppId")
    public String appId;

    // 结果码
    @NameInMap("Code")
    public String code;

    // 结果描述
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static ChangeApplicationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeApplicationInfoResponseBody self = new ChangeApplicationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeApplicationInfoResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ChangeApplicationInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeApplicationInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeApplicationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeApplicationInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
