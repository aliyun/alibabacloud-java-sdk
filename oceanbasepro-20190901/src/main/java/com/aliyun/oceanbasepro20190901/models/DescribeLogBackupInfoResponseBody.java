// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeLogBackupInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeLogBackupInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLogBackupInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupInfoResponseBody self = new DescribeLogBackupInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupInfoResponseBody setData(DescribeLogBackupInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLogBackupInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeLogBackupInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLogBackupInfoResponseBodyData extends TeaModel {
        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("DelayTime")
        public Integer delayTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public String status;

        public static DescribeLogBackupInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupInfoResponseBodyData self = new DescribeLogBackupInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLogBackupInfoResponseBodyData setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeLogBackupInfoResponseBodyData setDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Integer getDelayTime() {
            return this.delayTime;
        }

        public DescribeLogBackupInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLogBackupInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
