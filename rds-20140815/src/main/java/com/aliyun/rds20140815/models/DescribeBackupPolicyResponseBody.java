// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("AdvancedBackupPolicyEnabled")
    public Boolean advancedBackupPolicyEnabled;

    @NameInMap("AdvancedDataPolicies")
    public DescribeBackupPolicyResponseBodyAdvancedDataPolicies advancedDataPolicies;

    @NameInMap("AdvancedLogPolicies")
    public DescribeBackupPolicyResponseBodyAdvancedLogPolicies advancedLogPolicies;

    @NameInMap("ArchiveBackupKeepCount")
    public String archiveBackupKeepCount;

    @NameInMap("ArchiveBackupKeepPolicy")
    public String archiveBackupKeepPolicy;

    @NameInMap("ArchiveBackupRetentionPeriod")
    public String archiveBackupRetentionPeriod;

    @NameInMap("BackupInterval")
    public String backupInterval;

    @NameInMap("BackupLog")
    public String backupLog;

    @NameInMap("BackupMethod")
    public String backupMethod;

    @NameInMap("BackupPriority")
    public Integer backupPriority;

    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    @NameInMap("Category")
    public String category;

    @NameInMap("CompressType")
    public String compressType;

    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    @NameInMap("EnableIncrementDataBackup")
    public Boolean enableIncrementDataBackup;

    @NameInMap("EnablePitrProtection")
    public Boolean enablePitrProtection;

    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    @NameInMap("LocalLogRetentionHours")
    public Integer localLogRetentionHours;

    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    @NameInMap("LogBackupFrequency")
    public String logBackupFrequency;

    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    @NameInMap("PitrRetentionPeriod")
    public Integer pitrRetentionPeriod;

    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    @NameInMap("ReleasedKeepPolicy")
    public String releasedKeepPolicy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportModifyBackupPriority")
    public Boolean supportModifyBackupPriority;

    @NameInMap("SupportReleasedKeep")
    public Integer supportReleasedKeep;

    @NameInMap("SupportVolumeShadowCopy")
    public Integer supportVolumeShadowCopy;

    @NameInMap("SupportsHighFrequencyBackup")
    public Long supportsHighFrequencyBackup;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setAdvancedBackupPolicyEnabled(Boolean advancedBackupPolicyEnabled) {
        this.advancedBackupPolicyEnabled = advancedBackupPolicyEnabled;
        return this;
    }
    public Boolean getAdvancedBackupPolicyEnabled() {
        return this.advancedBackupPolicyEnabled;
    }

    public DescribeBackupPolicyResponseBody setAdvancedDataPolicies(DescribeBackupPolicyResponseBodyAdvancedDataPolicies advancedDataPolicies) {
        this.advancedDataPolicies = advancedDataPolicies;
        return this;
    }
    public DescribeBackupPolicyResponseBodyAdvancedDataPolicies getAdvancedDataPolicies() {
        return this.advancedDataPolicies;
    }

    public DescribeBackupPolicyResponseBody setAdvancedLogPolicies(DescribeBackupPolicyResponseBodyAdvancedLogPolicies advancedLogPolicies) {
        this.advancedLogPolicies = advancedLogPolicies;
        return this;
    }
    public DescribeBackupPolicyResponseBodyAdvancedLogPolicies getAdvancedLogPolicies() {
        return this.advancedLogPolicies;
    }

    public DescribeBackupPolicyResponseBody setArchiveBackupKeepCount(String archiveBackupKeepCount) {
        this.archiveBackupKeepCount = archiveBackupKeepCount;
        return this;
    }
    public String getArchiveBackupKeepCount() {
        return this.archiveBackupKeepCount;
    }

    public DescribeBackupPolicyResponseBody setArchiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
        this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
        return this;
    }
    public String getArchiveBackupKeepPolicy() {
        return this.archiveBackupKeepPolicy;
    }

    public DescribeBackupPolicyResponseBody setArchiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
        this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
        return this;
    }
    public String getArchiveBackupRetentionPeriod() {
        return this.archiveBackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setBackupInterval(String backupInterval) {
        this.backupInterval = backupInterval;
        return this;
    }
    public String getBackupInterval() {
        return this.backupInterval;
    }

    public DescribeBackupPolicyResponseBody setBackupLog(String backupLog) {
        this.backupLog = backupLog;
        return this;
    }
    public String getBackupLog() {
        return this.backupLog;
    }

    public DescribeBackupPolicyResponseBody setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public DescribeBackupPolicyResponseBody setBackupPriority(Integer backupPriority) {
        this.backupPriority = backupPriority;
        return this;
    }
    public Integer getBackupPriority() {
        return this.backupPriority;
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeBackupPolicyResponseBody setCompressType(String compressType) {
        this.compressType = compressType;
        return this;
    }
    public String getCompressType() {
        return this.compressType;
    }

    public DescribeBackupPolicyResponseBody setEnableBackupLog(String enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public DescribeBackupPolicyResponseBody setEnableIncrementDataBackup(Boolean enableIncrementDataBackup) {
        this.enableIncrementDataBackup = enableIncrementDataBackup;
        return this;
    }
    public Boolean getEnableIncrementDataBackup() {
        return this.enableIncrementDataBackup;
    }

    public DescribeBackupPolicyResponseBody setEnablePitrProtection(Boolean enablePitrProtection) {
        this.enablePitrProtection = enablePitrProtection;
        return this;
    }
    public Boolean getEnablePitrProtection() {
        return this.enablePitrProtection;
    }

    public DescribeBackupPolicyResponseBody setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public DescribeBackupPolicyResponseBody setLocalLogRetentionHours(Integer localLogRetentionHours) {
        this.localLogRetentionHours = localLogRetentionHours;
        return this;
    }
    public Integer getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    public DescribeBackupPolicyResponseBody setLocalLogRetentionSpace(String localLogRetentionSpace) {
        this.localLogRetentionSpace = localLogRetentionSpace;
        return this;
    }
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    public DescribeBackupPolicyResponseBody setLogBackupFrequency(String logBackupFrequency) {
        this.logBackupFrequency = logBackupFrequency;
        return this;
    }
    public String getLogBackupFrequency() {
        return this.logBackupFrequency;
    }

    public DescribeBackupPolicyResponseBody setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
        this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
        return this;
    }
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    public DescribeBackupPolicyResponseBody setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setPitrRetentionPeriod(Integer pitrRetentionPeriod) {
        this.pitrRetentionPeriod = pitrRetentionPeriod;
        return this;
    }
    public Integer getPitrRetentionPeriod() {
        return this.pitrRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeBackupPolicyResponseBody setPreferredNextBackupTime(String preferredNextBackupTime) {
        this.preferredNextBackupTime = preferredNextBackupTime;
        return this;
    }
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    public DescribeBackupPolicyResponseBody setReleasedKeepPolicy(String releasedKeepPolicy) {
        this.releasedKeepPolicy = releasedKeepPolicy;
        return this;
    }
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setSupportModifyBackupPriority(Boolean supportModifyBackupPriority) {
        this.supportModifyBackupPriority = supportModifyBackupPriority;
        return this;
    }
    public Boolean getSupportModifyBackupPriority() {
        return this.supportModifyBackupPriority;
    }

    public DescribeBackupPolicyResponseBody setSupportReleasedKeep(Integer supportReleasedKeep) {
        this.supportReleasedKeep = supportReleasedKeep;
        return this;
    }
    public Integer getSupportReleasedKeep() {
        return this.supportReleasedKeep;
    }

    public DescribeBackupPolicyResponseBody setSupportVolumeShadowCopy(Integer supportVolumeShadowCopy) {
        this.supportVolumeShadowCopy = supportVolumeShadowCopy;
        return this;
    }
    public Integer getSupportVolumeShadowCopy() {
        return this.supportVolumeShadowCopy;
    }

    public DescribeBackupPolicyResponseBody setSupportsHighFrequencyBackup(Long supportsHighFrequencyBackup) {
        this.supportsHighFrequencyBackup = supportsHighFrequencyBackup;
        return this;
    }
    public Long getSupportsHighFrequencyBackup() {
        return this.supportsHighFrequencyBackup;
    }

    public static class DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("BakType")
        public String bakType;

        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("FilterKey")
        public String filterKey;

        @NameInMap("FilterType")
        public String filterType;

        @NameInMap("FilterValue")
        public String filterValue;

        @NameInMap("OnlyPreserveOneEachDay")
        public Boolean onlyPreserveOneEachDay;

        @NameInMap("OnlyPreserveOneEachHour")
        public Boolean onlyPreserveOneEachHour;

        @NameInMap("RetentionType")
        public String retentionType;

        @NameInMap("RetentionValue")
        public Integer retentionValue;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcType")
        public String srcType;

        @NameInMap("StrategyId")
        public String strategyId;

        public static DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy self = new DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setBakType(String bakType) {
            this.bakType = bakType;
            return this;
        }
        public String getBakType() {
            return this.bakType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setOnlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
            this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
            return this;
        }
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setOnlyPreserveOneEachHour(Boolean onlyPreserveOneEachHour) {
            this.onlyPreserveOneEachHour = onlyPreserveOneEachHour;
            return this;
        }
        public Boolean getOnlyPreserveOneEachHour() {
            return this.onlyPreserveOneEachHour;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setRetentionValue(Integer retentionValue) {
            this.retentionValue = retentionValue;
            return this;
        }
        public Integer getRetentionValue() {
            return this.retentionValue;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

    }

    public static class DescribeBackupPolicyResponseBodyAdvancedDataPolicies extends TeaModel {
        @NameInMap("AdvancedDataPolicy")
        public java.util.List<DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy> advancedDataPolicy;

        public static DescribeBackupPolicyResponseBodyAdvancedDataPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyAdvancedDataPolicies self = new DescribeBackupPolicyResponseBodyAdvancedDataPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyAdvancedDataPolicies setAdvancedDataPolicy(java.util.List<DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy> advancedDataPolicy) {
            this.advancedDataPolicy = advancedDataPolicy;
            return this;
        }
        public java.util.List<DescribeBackupPolicyResponseBodyAdvancedDataPoliciesAdvancedDataPolicy> getAdvancedDataPolicy() {
            return this.advancedDataPolicy;
        }

    }

    public static class DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("EnableLogBackup")
        public Integer enableLogBackup;

        @NameInMap("FilterKey")
        public String filterKey;

        @NameInMap("FilterValue")
        public String filterValue;

        @NameInMap("LogRetentionType")
        public String logRetentionType;

        @NameInMap("LogRetentionValue")
        public Integer logRetentionValue;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcType")
        public String srcType;

        @NameInMap("StrategyId")
        public String strategyId;

        public static DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy self = new DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setEnableLogBackup(Integer enableLogBackup) {
            this.enableLogBackup = enableLogBackup;
            return this;
        }
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setLogRetentionType(String logRetentionType) {
            this.logRetentionType = logRetentionType;
            return this;
        }
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setLogRetentionValue(Integer logRetentionValue) {
            this.logRetentionValue = logRetentionValue;
            return this;
        }
        public Integer getLogRetentionValue() {
            return this.logRetentionValue;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

    }

    public static class DescribeBackupPolicyResponseBodyAdvancedLogPolicies extends TeaModel {
        @NameInMap("AdvancedLogPolicy")
        public java.util.List<DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy> advancedLogPolicy;

        public static DescribeBackupPolicyResponseBodyAdvancedLogPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyAdvancedLogPolicies self = new DescribeBackupPolicyResponseBodyAdvancedLogPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyAdvancedLogPolicies setAdvancedLogPolicy(java.util.List<DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy> advancedLogPolicy) {
            this.advancedLogPolicy = advancedLogPolicy;
            return this;
        }
        public java.util.List<DescribeBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy> getAdvancedLogPolicy() {
            return this.advancedLogPolicy;
        }

    }

}
