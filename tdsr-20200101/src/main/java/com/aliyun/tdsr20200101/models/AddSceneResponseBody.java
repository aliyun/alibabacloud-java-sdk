// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddSceneResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    // 场景ID
    @NameInMap("Id")
    public String id;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static AddSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSceneResponseBody self = new AddSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AddSceneResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
