// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddProjectResponseBody extends TeaModel {
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

    // 项目ID
    @NameInMap("Id")
    public String id;

    public static AddProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProjectResponseBody self = new AddProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddProjectResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AddProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddProjectResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
