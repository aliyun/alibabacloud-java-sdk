// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitCheckResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitCheckResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static SubmitCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitCheckResponseBody self = new SubmitCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitCheckResponseBody setData(SubmitCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitCheckResponseBodyData getData() {
        return this.data;
    }

    public SubmitCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitCheckResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class SubmitCheckResponseBodyData extends TeaModel {
        @NameInMap("OperateCode")
        public String operateCode;

        public static SubmitCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitCheckResponseBodyData self = new SubmitCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitCheckResponseBodyData setOperateCode(String operateCode) {
            this.operateCode = operateCode;
            return this;
        }
        public String getOperateCode() {
            return this.operateCode;
        }

    }

}
