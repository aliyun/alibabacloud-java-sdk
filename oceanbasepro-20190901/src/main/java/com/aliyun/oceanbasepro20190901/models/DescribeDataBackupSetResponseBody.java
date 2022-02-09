// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDataBackupSetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeDataBackupSetResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataBackupSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataBackupSetResponseBody self = new DescribeDataBackupSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataBackupSetResponseBody setData(java.util.List<DescribeDataBackupSetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDataBackupSetResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDataBackupSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataBackupSetResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataBackupSetResponseBodyData extends TeaModel {
        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("DataSize")
        public Integer dataSize;

        @NameInMap("DataVersion")
        public Integer dataVersion;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Method")
        public String method;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("SetId")
        public Integer setId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeDataBackupSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataBackupSetResponseBodyData self = new DescribeDataBackupSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataBackupSetResponseBodyData setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDataBackupSetResponseBodyData setDataSize(Integer dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Integer getDataSize() {
            return this.dataSize;
        }

        public DescribeDataBackupSetResponseBodyData setDataVersion(Integer dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public Integer getDataVersion() {
            return this.dataVersion;
        }

        public DescribeDataBackupSetResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDataBackupSetResponseBodyData setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeDataBackupSetResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeDataBackupSetResponseBodyData setSetId(Integer setId) {
            this.setId = setId;
            return this;
        }
        public Integer getSetId() {
            return this.setId;
        }

        public DescribeDataBackupSetResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataBackupSetResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataBackupSetResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
