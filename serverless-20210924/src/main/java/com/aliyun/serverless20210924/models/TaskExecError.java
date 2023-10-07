// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class TaskExecError extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("extraInfo")
    public String extraInfo;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("title")
    public String title;

    public static TaskExecError build(java.util.Map<String, ?> map) throws Exception {
        TaskExecError self = new TaskExecError();
        return TeaModel.build(map, self);
    }

    public TaskExecError setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TaskExecError setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public TaskExecError setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskExecError setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaskExecError setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
