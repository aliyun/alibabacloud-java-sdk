// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupSetListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<DescribeBackupSetListResponseBodyData> data;

    public static DescribeBackupSetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetListResponseBody self = new DescribeBackupSetListResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeBackupSetListResponseBody setData(java.util.List<DescribeBackupSetListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBackupSetListResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeBackupSetListResponseBodyData extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("BackupSetSize")
        public Long backupSetSize;

        @NameInMap("BackupSetId")
        public Long backupSetId;

        @NameInMap("BackupType")
        public Integer backupType;

        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("BackupModel")
        public Integer backupModel;

        public static DescribeBackupSetListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetListResponseBodyData self = new DescribeBackupSetListResponseBodyData();
            return TeaModel.build(map, self);
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

        public DescribeBackupSetListResponseBodyData setBackupSetSize(Long backupSetSize) {
            this.backupSetSize = backupSetSize;
            return this;
        }
        public Long getBackupSetSize() {
            return this.backupSetSize;
        }

        public DescribeBackupSetListResponseBodyData setBackupSetId(Long backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public Long getBackupSetId() {
            return this.backupSetId;
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

        public DescribeBackupSetListResponseBodyData setBackupModel(Integer backupModel) {
            this.backupModel = backupModel;
            return this;
        }
        public Integer getBackupModel() {
            return this.backupModel;
        }

    }

}
