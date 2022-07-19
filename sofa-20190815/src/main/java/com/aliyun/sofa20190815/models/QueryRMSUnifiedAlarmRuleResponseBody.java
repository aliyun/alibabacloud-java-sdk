// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmRuleResponseBody extends TeaModel {
    @NameInMap("AlarmRules")
    public java.util.List<QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules> alarmRules;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryRMSUnifiedAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmRuleResponseBody self = new QueryRMSUnifiedAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmRuleResponseBody setAlarmRules(java.util.List<QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules> alarmRules) {
        this.alarmRules = alarmRules;
        return this;
    }
    public java.util.List<QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules> getAlarmRules() {
        return this.alarmRules;
    }

    public QueryRMSUnifiedAlarmRuleResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryRMSUnifiedAlarmRuleResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRMSUnifiedAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRMSUnifiedAlarmRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRMSUnifiedAlarmRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRMSUnifiedAlarmRuleResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules extends TeaModel {
        @NameInMap("AlarmEmpty")
        public Long alarmEmpty;

        @NameInMap("AlarmStatus")
        public Long alarmStatus;

        @NameInMap("Category")
        public String category;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("ConditionsDes")
        public java.util.List<String> conditionsDes;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Long deleted;

        @NameInMap("Emergency")
        public String emergency;

        @NameInMap("EmergencyUrl")
        public String emergencyUrl;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Level")
        public Long level;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyEmpty")
        public Long notifyEmpty;

        @NameInMap("NotifyFiring")
        public Long notifyFiring;

        @NameInMap("NotifyRecovered")
        public Long notifyRecovered;

        @NameInMap("NotifyTimeFilter")
        public String notifyTimeFilter;

        @NameInMap("NotifyTplId")
        public Long notifyTplId;

        @NameInMap("PendingHit")
        public Long pendingHit;

        @NameInMap("RecoveredHit")
        public Long recoveredHit;

        @NameInMap("RuleConfig")
        public String ruleConfig;

        @NameInMap("SilenceTime")
        public Long silenceTime;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Step")
        public Long step;

        @NameInMap("SuspendedEndTime")
        public Long suspendedEndTime;

        @NameInMap("SuspendedReason")
        public String suspendedReason;

        @NameInMap("SuspendedStartTime")
        public Long suspendedStartTime;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("UniqueIdentity")
        public String uniqueIdentity;

        @NameInMap("WorkspaceId")
        public Long workspaceId;

        public static QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules self = new QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules();
            return TeaModel.build(map, self);
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setAlarmEmpty(Long alarmEmpty) {
            this.alarmEmpty = alarmEmpty;
            return this;
        }
        public Long getAlarmEmpty() {
            return this.alarmEmpty;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setAlarmStatus(Long alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public Long getAlarmStatus() {
            return this.alarmStatus;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setConditionsDes(java.util.List<String> conditionsDes) {
            this.conditionsDes = conditionsDes;
            return this;
        }
        public java.util.List<String> getConditionsDes() {
            return this.conditionsDes;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setDeleted(Long deleted) {
            this.deleted = deleted;
            return this;
        }
        public Long getDeleted() {
            return this.deleted;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setEmergency(String emergency) {
            this.emergency = emergency;
            return this;
        }
        public String getEmergency() {
            return this.emergency;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setEmergencyUrl(String emergencyUrl) {
            this.emergencyUrl = emergencyUrl;
            return this;
        }
        public String getEmergencyUrl() {
            return this.emergencyUrl;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setNotifyEmpty(Long notifyEmpty) {
            this.notifyEmpty = notifyEmpty;
            return this;
        }
        public Long getNotifyEmpty() {
            return this.notifyEmpty;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setNotifyFiring(Long notifyFiring) {
            this.notifyFiring = notifyFiring;
            return this;
        }
        public Long getNotifyFiring() {
            return this.notifyFiring;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setNotifyRecovered(Long notifyRecovered) {
            this.notifyRecovered = notifyRecovered;
            return this;
        }
        public Long getNotifyRecovered() {
            return this.notifyRecovered;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setNotifyTimeFilter(String notifyTimeFilter) {
            this.notifyTimeFilter = notifyTimeFilter;
            return this;
        }
        public String getNotifyTimeFilter() {
            return this.notifyTimeFilter;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setNotifyTplId(Long notifyTplId) {
            this.notifyTplId = notifyTplId;
            return this;
        }
        public Long getNotifyTplId() {
            return this.notifyTplId;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setPendingHit(Long pendingHit) {
            this.pendingHit = pendingHit;
            return this;
        }
        public Long getPendingHit() {
            return this.pendingHit;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setRecoveredHit(Long recoveredHit) {
            this.recoveredHit = recoveredHit;
            return this;
        }
        public Long getRecoveredHit() {
            return this.recoveredHit;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setSilenceTime(Long silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Long getSilenceTime() {
            return this.silenceTime;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setSuspendedEndTime(Long suspendedEndTime) {
            this.suspendedEndTime = suspendedEndTime;
            return this;
        }
        public Long getSuspendedEndTime() {
            return this.suspendedEndTime;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setSuspendedReason(String suspendedReason) {
            this.suspendedReason = suspendedReason;
            return this;
        }
        public String getSuspendedReason() {
            return this.suspendedReason;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setSuspendedStartTime(Long suspendedStartTime) {
            this.suspendedStartTime = suspendedStartTime;
            return this;
        }
        public Long getSuspendedStartTime() {
            return this.suspendedStartTime;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setUniqueIdentity(String uniqueIdentity) {
            this.uniqueIdentity = uniqueIdentity;
            return this;
        }
        public String getUniqueIdentity() {
            return this.uniqueIdentity;
        }

        public QueryRMSUnifiedAlarmRuleResponseBodyAlarmRules setWorkspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
