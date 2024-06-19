// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeBackupPolicyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B87E2AB3-B7C9-4394-9160-7F639F732031</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setData(DescribeBackupPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBackupPolicyResponseBodyData getData() {
        return this.data;
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

    public static class DescribeBackupPolicyResponseBodyData extends TeaModel {
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

        @NameInMap("CrossRegionDataBackupRetention")
        public Integer crossRegionDataBackupRetention;

        @NameInMap("CrossRegionLogBackupRetention")
        public Integer crossRegionLogBackupRetention;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("DestCrossRegion")
        public String destCrossRegion;

        @NameInMap("ForceCleanOnHighSpaceUsage")
        public Integer forceCleanOnHighSpaceUsage;

        @NameInMap("IsCrossRegionDataBackupEnabled")
        public Boolean isCrossRegionDataBackupEnabled;

        @NameInMap("IsCrossRegionLogBackupEnabled")
        public Boolean isCrossRegionLogBackupEnabled;

        @NameInMap("IsEnabled")
        public Integer isEnabled;

        @NameInMap("LocalLogRetention")
        public Integer localLogRetention;

        @NameInMap("LocalLogRetentionNumber")
        public Integer localLogRetentionNumber;

        @NameInMap("LogLocalRetentionSpace")
        public Integer logLocalRetentionSpace;

        @NameInMap("RemoveLogRetention")
        public Integer removeLogRetention;

        public static DescribeBackupPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyData self = new DescribeBackupPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyData setBackupPeriod(String backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public String getBackupPeriod() {
            return this.backupPeriod;
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

        public DescribeBackupPolicyResponseBodyData setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupPolicyResponseBodyData setBackupWay(String backupWay) {
            this.backupWay = backupWay;
            return this;
        }
        public String getBackupWay() {
            return this.backupWay;
        }

        public DescribeBackupPolicyResponseBodyData setColdDataBackupInterval(Integer coldDataBackupInterval) {
            this.coldDataBackupInterval = coldDataBackupInterval;
            return this;
        }
        public Integer getColdDataBackupInterval() {
            return this.coldDataBackupInterval;
        }

        public DescribeBackupPolicyResponseBodyData setColdDataBackupRetention(Integer coldDataBackupRetention) {
            this.coldDataBackupRetention = coldDataBackupRetention;
            return this;
        }
        public Integer getColdDataBackupRetention() {
            return this.coldDataBackupRetention;
        }

        public DescribeBackupPolicyResponseBodyData setCrossRegionDataBackupRetention(Integer crossRegionDataBackupRetention) {
            this.crossRegionDataBackupRetention = crossRegionDataBackupRetention;
            return this;
        }
        public Integer getCrossRegionDataBackupRetention() {
            return this.crossRegionDataBackupRetention;
        }

        public DescribeBackupPolicyResponseBodyData setCrossRegionLogBackupRetention(Integer crossRegionLogBackupRetention) {
            this.crossRegionLogBackupRetention = crossRegionLogBackupRetention;
            return this;
        }
        public Integer getCrossRegionLogBackupRetention() {
            return this.crossRegionLogBackupRetention;
        }

        public DescribeBackupPolicyResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeBackupPolicyResponseBodyData setDestCrossRegion(String destCrossRegion) {
            this.destCrossRegion = destCrossRegion;
            return this;
        }
        public String getDestCrossRegion() {
            return this.destCrossRegion;
        }

        public DescribeBackupPolicyResponseBodyData setForceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
            this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
            return this;
        }
        public Integer getForceCleanOnHighSpaceUsage() {
            return this.forceCleanOnHighSpaceUsage;
        }

        public DescribeBackupPolicyResponseBodyData setIsCrossRegionDataBackupEnabled(Boolean isCrossRegionDataBackupEnabled) {
            this.isCrossRegionDataBackupEnabled = isCrossRegionDataBackupEnabled;
            return this;
        }
        public Boolean getIsCrossRegionDataBackupEnabled() {
            return this.isCrossRegionDataBackupEnabled;
        }

        public DescribeBackupPolicyResponseBodyData setIsCrossRegionLogBackupEnabled(Boolean isCrossRegionLogBackupEnabled) {
            this.isCrossRegionLogBackupEnabled = isCrossRegionLogBackupEnabled;
            return this;
        }
        public Boolean getIsCrossRegionLogBackupEnabled() {
            return this.isCrossRegionLogBackupEnabled;
        }

        public DescribeBackupPolicyResponseBodyData setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public DescribeBackupPolicyResponseBodyData setLocalLogRetention(Integer localLogRetention) {
            this.localLogRetention = localLogRetention;
            return this;
        }
        public Integer getLocalLogRetention() {
            return this.localLogRetention;
        }

        public DescribeBackupPolicyResponseBodyData setLocalLogRetentionNumber(Integer localLogRetentionNumber) {
            this.localLogRetentionNumber = localLogRetentionNumber;
            return this;
        }
        public Integer getLocalLogRetentionNumber() {
            return this.localLogRetentionNumber;
        }

        public DescribeBackupPolicyResponseBodyData setLogLocalRetentionSpace(Integer logLocalRetentionSpace) {
            this.logLocalRetentionSpace = logLocalRetentionSpace;
            return this;
        }
        public Integer getLogLocalRetentionSpace() {
            return this.logLocalRetentionSpace;
        }

        public DescribeBackupPolicyResponseBodyData setRemoveLogRetention(Integer removeLogRetention) {
            this.removeLogRetention = removeLogRetention;
            return this;
        }
        public Integer getRemoveLogRetention() {
            return this.removeLogRetention;
        }

    }

}
