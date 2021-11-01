// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 任务运行状态
    @NameInMap("Status")
    public Long status;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public GetJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
