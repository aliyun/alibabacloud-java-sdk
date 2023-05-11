// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateBackupPolicyResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<UpdateBackupPolicyResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupPolicyResponseBody self = new UpdateBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBackupPolicyResponseBody setData(java.util.List<UpdateBackupPolicyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateBackupPolicyResponseBodyData> getData() {
        return this.data;
    }

    public UpdateBackupPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBackupPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateBackupPolicyResponseBodyData extends TeaModel {
        @NameInMap("BackupPeriod")
        public String backupPeriod;

        @NameInMap("BackupPlanBegin")
        public String backupPlanBegin;

        @NameInMap("BackupSetRetention")
        public Integer backupSetRetention;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("BackupWay")
        public String backupWay;

        @NameInMap("ColdDataBackupInterval")
        public Integer coldDataBackupInterval;

        @NameInMap("ColdDataBackupRetention")
        public Integer coldDataBackupRetention;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("ForceCleanOnHighSpaceUsage")
        public Integer forceCleanOnHighSpaceUsage;

        @NameInMap("IsEnabled")
        public Integer isEnabled;

        @NameInMap("LocalLogRetention")
        public Integer localLogRetention;

        @NameInMap("LogLocalRetentionSpace")
        public Integer logLocalRetentionSpace;

        @NameInMap("RemoveLogRetention")
        public Integer removeLogRetention;

        public static UpdateBackupPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateBackupPolicyResponseBodyData self = new UpdateBackupPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateBackupPolicyResponseBodyData setBackupPeriod(String backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        public UpdateBackupPolicyResponseBodyData setBackupPlanBegin(String backupPlanBegin) {
            this.backupPlanBegin = backupPlanBegin;
            return this;
        }
        public String getBackupPlanBegin() {
            return this.backupPlanBegin;
        }

        public UpdateBackupPolicyResponseBodyData setBackupSetRetention(Integer backupSetRetention) {
            this.backupSetRetention = backupSetRetention;
            return this;
        }
        public Integer getBackupSetRetention() {
            return this.backupSetRetention;
        }

        public UpdateBackupPolicyResponseBodyData setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public UpdateBackupPolicyResponseBodyData setBackupWay(String backupWay) {
            this.backupWay = backupWay;
            return this;
        }
        public String getBackupWay() {
            return this.backupWay;
        }

        public UpdateBackupPolicyResponseBodyData setColdDataBackupInterval(Integer coldDataBackupInterval) {
            this.coldDataBackupInterval = coldDataBackupInterval;
            return this;
        }
        public Integer getColdDataBackupInterval() {
            return this.coldDataBackupInterval;
        }

        public UpdateBackupPolicyResponseBodyData setColdDataBackupRetention(Integer coldDataBackupRetention) {
            this.coldDataBackupRetention = coldDataBackupRetention;
            return this;
        }
        public Integer getColdDataBackupRetention() {
            return this.coldDataBackupRetention;
        }

        public UpdateBackupPolicyResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public UpdateBackupPolicyResponseBodyData setForceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
            this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
            return this;
        }
        public Integer getForceCleanOnHighSpaceUsage() {
            return this.forceCleanOnHighSpaceUsage;
        }

        public UpdateBackupPolicyResponseBodyData setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public UpdateBackupPolicyResponseBodyData setLocalLogRetention(Integer localLogRetention) {
            this.localLogRetention = localLogRetention;
            return this;
        }
        public Integer getLocalLogRetention() {
            return this.localLogRetention;
        }

        public UpdateBackupPolicyResponseBodyData setLogLocalRetentionSpace(Integer logLocalRetentionSpace) {
            this.logLocalRetentionSpace = logLocalRetentionSpace;
            return this;
        }
        public Integer getLogLocalRetentionSpace() {
            return this.logLocalRetentionSpace;
        }

        public UpdateBackupPolicyResponseBodyData setRemoveLogRetention(Integer removeLogRetention) {
            this.removeLogRetention = removeLogRetention;
            return this;
        }
        public Integer getRemoveLogRetention() {
            return this.removeLogRetention;
        }

    }

}
