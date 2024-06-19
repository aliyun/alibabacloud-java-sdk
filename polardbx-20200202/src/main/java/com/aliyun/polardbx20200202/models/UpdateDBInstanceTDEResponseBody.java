// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceTDEResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateDBInstanceTDEResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDBInstanceTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstanceTDEResponseBody self = new UpdateDBInstanceTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstanceTDEResponseBody setData(UpdateDBInstanceTDEResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDBInstanceTDEResponseBodyData getData() {
        return this.data;
    }

    public UpdateDBInstanceTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateDBInstanceTDEResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>42292****</p>
         */
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
