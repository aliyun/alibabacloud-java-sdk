// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceTDEResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UpdateDBInstanceTDEResponseBodyData data;

    public static UpdateDBInstanceTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstanceTDEResponseBody self = new UpdateDBInstanceTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstanceTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDBInstanceTDEResponseBody setData(UpdateDBInstanceTDEResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDBInstanceTDEResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateDBInstanceTDEResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static UpdateDBInstanceTDEResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDBInstanceTDEResponseBodyData self = new UpdateDBInstanceTDEResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDBInstanceTDEResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
