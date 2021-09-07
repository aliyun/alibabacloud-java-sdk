// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<DescribeBackupPolicyResponseBodyData> data;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupPolicyResponseBody setData(java.util.List<DescribeBackupPolicyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBackupPolicyResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeBackupPolicyResponseBodyData extends TeaModel {
        @NameInMap("LogLocalRetentionSpace")
        public Integer logLocalRetentionSpace;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("BackupWay")
        public String backupWay;

        @NameInMap("BackupPeriod")
        public String backupPeriod;

        @NameInMap("ForceCleanOnHighSpaceUsage")
        public Integer forceCleanOnHighSpaceUsage;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("LocalLogRetention")
        public Integer localLogRetention;

        @NameInMap("RemoveLogRetention")
        public Integer removeLogRetention;

        @NameInMap("BackupPlanBegin")
        public String backupPlanBegin;

        @NameInMap("BackupSetRetention")
        public Integer backupSetRetention;

        @NameInMap("IsEnabled")
        public Integer isEnabled;

        public static DescribeBackupPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyData self = new DescribeBackupPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyData setLogLocalRetentionSpace(Integer logLocalRetentionSpace) {
            this.logLocalRetentionSpace = logLocalRetentionSpace;
            return this;
        }
        public Integer getLogLocalRetentionSpace() {
            return this.logLocalRetentionSpace;
        }

        public DescribeBackupPolicyResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeBackupPolicyResponseBodyData setBackupWay(String backupWay) {
            this.backupWay = backupWay;
            return this;
        }
        public String getBackupWay() {
            return this.backupWay;
        }

        public DescribeBackupPolicyResponseBodyData setBackupPeriod(String backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        public DescribeBackupPolicyResponseBodyData setForceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
            this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
            return this;
        }
        public Integer getForceCleanOnHighSpaceUsage() {
            return this.forceCleanOnHighSpaceUsage;
        }

        public DescribeBackupPolicyResponseBodyData setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupPolicyResponseBodyData setLocalLogRetention(Integer localLogRetention) {
            this.localLogRetention = localLogRetention;
            return this;
        }
        public Integer getLocalLogRetention() {
            return this.localLogRetention;
        }

        public DescribeBackupPolicyResponseBodyData setRemoveLogRetention(Integer removeLogRetention) {
            this.removeLogRetention = removeLogRetention;
            return this;
        }
        public Integer getRemoveLogRetention() {
            return this.removeLogRetention;
        }

        public DescribeBackupPolicyResponseBodyData setBackupPlanBegin(String backupPlanBegin) {
            this.backupPlanBegin = backupPlanBegin;
            return this;
        }
        public String getBackupPlanBegin() {
            return this.backupPlanBegin;
        }

        public DescribeBackupPolicyResponseBodyData setBackupSetRetention(Integer backupSetRetention) {
            this.backupSetRetention = backupSetRetention;
            return this;
        }
        public Integer getBackupSetRetention() {
            return this.backupSetRetention;
        }

        public DescribeBackupPolicyResponseBodyData setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

    }

}
