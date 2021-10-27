// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceSSLResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateDBInstanceSSLResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDBInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstanceSSLResponseBody self = new UpdateDBInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstanceSSLResponseBody setData(UpdateDBInstanceSSLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDBInstanceSSLResponseBodyData getData() {
        return this.data;
    }

    public UpdateDBInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateDBInstanceSSLResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public Long taskId;

        public static UpdateDBInstanceSSLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDBInstanceSSLResponseBodyData self = new UpdateDBInstanceSSLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDBInstanceSSLResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
