// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddMonitorResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddMonitorResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static AddMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMonitorResponseBody self = new AddMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMonitorResponseBody setData(AddMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddMonitorResponseBodyData getData() {
        return this.data;
    }

    public AddMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class AddMonitorResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static AddMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddMonitorResponseBodyData self = new AddMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddMonitorResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
