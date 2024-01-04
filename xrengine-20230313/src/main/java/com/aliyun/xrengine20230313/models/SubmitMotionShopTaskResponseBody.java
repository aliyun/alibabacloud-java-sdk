// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class SubmitMotionShopTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitMotionShopTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitMotionShopTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMotionShopTaskResponseBody self = new SubmitMotionShopTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMotionShopTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitMotionShopTaskResponseBody setData(SubmitMotionShopTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitMotionShopTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitMotionShopTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitMotionShopTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitMotionShopTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitMotionShopTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitMotionShopTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitMotionShopTaskResponseBodyData self = new SubmitMotionShopTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitMotionShopTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
