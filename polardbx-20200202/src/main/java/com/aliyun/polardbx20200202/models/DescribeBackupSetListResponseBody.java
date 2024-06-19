// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupSetListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeBackupSetListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeBackupSetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetListResponseBody self = new DescribeBackupSetListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetListResponseBody setData(java.util.List<DescribeBackupSetListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBackupSetListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeBackupSetListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBackupSetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupSetListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBackupSetListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BackupModel")
        public Integer backupModel;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("BackupSetId")
        public String backupSetId;

        /**
         * <strong>example:</strong>
         * <p>88803195</p>
         */
        @NameInMap("BackupSetSize")
        public Long backupSetSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackupType")
        public Integer backupType;

        /**
         * <strong>example:</strong>
         * <p>1635706960956</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <strong>example:</strong>
         * <p>1635706960956</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeBackupSetListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetListResponseBodyData self = new DescribeBackupSetListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetListResponseBodyData setBackupModel(Integer backupModel) {
            this.backupModel = backupModel;
            return this;
        }
        public Integer getBackupModel() {
            return this.backupModel;
        }

        public DescribeBackupSetListResponseBodyData setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeBackupSetListResponseBodyData setBackupSetSize(Long backupSetSize) {
            this.backupSetSize = backupSetSize;
            return this;
        }
        public Long getBackupSetSize() {
            return this.backupSetSize;
        }

        public DescribeBackupSetListResponseBodyData setBackupType(Integer backupType) {
            this.backupType = backupType;
            return this;
        }
        public Integer getBackupType() {
            return this.backupType;
        }

        public DescribeBackupSetListResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public DescribeBackupSetListResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeBackupSetListResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
