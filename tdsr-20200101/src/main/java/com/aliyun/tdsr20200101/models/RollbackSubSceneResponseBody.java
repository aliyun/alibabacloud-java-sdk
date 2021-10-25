// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RollbackSubSceneResponseBody extends TeaModel {
    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 错误消息
    @NameInMap("Message")
    public String message;

    public static RollbackSubSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackSubSceneResponseBody self = new RollbackSubSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackSubSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackSubSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public RollbackSubSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RollbackSubSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
