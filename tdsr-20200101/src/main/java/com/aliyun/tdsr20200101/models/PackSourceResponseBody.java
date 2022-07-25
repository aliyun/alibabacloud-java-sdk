// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PackSourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public PackSourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PackSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PackSourceResponseBody self = new PackSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public PackSourceResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public PackSourceResponseBody setData(PackSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PackSourceResponseBodyData getData() {
        return this.data;
    }

    public PackSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PackSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PackSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PackSourceResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static PackSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PackSourceResponseBodyData self = new PackSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PackSourceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
