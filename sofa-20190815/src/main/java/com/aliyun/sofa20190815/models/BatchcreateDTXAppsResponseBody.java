// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateDTXAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public BatchcreateDTXAppsResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchcreateDTXAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDTXAppsResponseBody self = new BatchcreateDTXAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchcreateDTXAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchcreateDTXAppsResponseBody setData(BatchcreateDTXAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchcreateDTXAppsResponseBodyData getData() {
        return this.data;
    }

    public BatchcreateDTXAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchcreateDTXAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchcreateDTXAppsResponseBodyDataActionArray extends TeaModel {
        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("Used")
        public Boolean used;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RollbackMethodName")
        public String rollbackMethodName;

        @NameInMap("ElasticKey")
        public String elasticKey;

        @NameInMap("IsZoneRoute")
        public Boolean isZoneRoute;

        @NameInMap("CommitMethodName")
        public String commitMethodName;

        @NameInMap("TestUrl")
        public String testUrl;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("RollbackMethodParamsType")
        public Long rollbackMethodParamsType;

        @NameInMap("CommitMethodParamsType")
        public Long commitMethodParamsType;

        @NameInMap("WsTr")
        public String wsTr;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("ElasticRouteRule")
        public String elasticRouteRule;

        @NameInMap("ClassName")
        public String className;

        @NameInMap("Id")
        public Long id;

        public static BatchcreateDTXAppsResponseBodyDataActionArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDTXAppsResponseBodyDataActionArray self = new BatchcreateDTXAppsResponseBodyDataActionArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setRollbackMethodName(String rollbackMethodName) {
            this.rollbackMethodName = rollbackMethodName;
            return this;
        }
        public String getRollbackMethodName() {
            return this.rollbackMethodName;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setElasticKey(String elasticKey) {
            this.elasticKey = elasticKey;
            return this;
        }
        public String getElasticKey() {
            return this.elasticKey;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setIsZoneRoute(Boolean isZoneRoute) {
            this.isZoneRoute = isZoneRoute;
            return this;
        }
        public Boolean getIsZoneRoute() {
            return this.isZoneRoute;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setCommitMethodName(String commitMethodName) {
            this.commitMethodName = commitMethodName;
            return this;
        }
        public String getCommitMethodName() {
            return this.commitMethodName;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setTestUrl(String testUrl) {
            this.testUrl = testUrl;
            return this;
        }
        public String getTestUrl() {
            return this.testUrl;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setRollbackMethodParamsType(Long rollbackMethodParamsType) {
            this.rollbackMethodParamsType = rollbackMethodParamsType;
            return this;
        }
        public Long getRollbackMethodParamsType() {
            return this.rollbackMethodParamsType;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setCommitMethodParamsType(Long commitMethodParamsType) {
            this.commitMethodParamsType = commitMethodParamsType;
            return this;
        }
        public Long getCommitMethodParamsType() {
            return this.commitMethodParamsType;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setWsTr(String wsTr) {
            this.wsTr = wsTr;
            return this;
        }
        public String getWsTr() {
            return this.wsTr;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setElasticRouteRule(String elasticRouteRule) {
            this.elasticRouteRule = elasticRouteRule;
            return this;
        }
        public String getElasticRouteRule() {
            return this.elasticRouteRule;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public BatchcreateDTXAppsResponseBodyDataActionArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray extends TeaModel {
        @NameInMap("TaskNameFormat")
        public String taskNameFormat;

        @NameInMap("DsIndexEnd")
        public Long dsIndexEnd;

        @NameInMap("IsLdc")
        public Boolean isLdc;

        @NameInMap("ActionTableNameFormat")
        public String actionTableNameFormat;

        @NameInMap("TaskIndexStart")
        public Long taskIndexStart;

        @NameInMap("IsLocalDs")
        public Boolean isLocalDs;

        @NameInMap("ActionTableIndexEnd")
        public Long actionTableIndexEnd;

        @NameInMap("TaskIndexEnd")
        public Long taskIndexEnd;

        @NameInMap("DbConnectMin")
        public Long dbConnectMin;

        @NameInMap("DbType")
        public Long dbType;

        @NameInMap("DbConnMax")
        public Long dbConnMax;

        @NameInMap("DsIndexStart")
        public Long dsIndexStart;

        @NameInMap("DsNameFormat")
        public String dsNameFormat;

        @NameInMap("ActivityTableIndexEnd")
        public Long activityTableIndexEnd;

        @NameInMap("ActionTableIndexStart")
        public Long actionTableIndexStart;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("ActivityTableNameFormat")
        public String activityTableNameFormat;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ActivityTableIndexStart")
        public Long activityTableIndexStart;

        public static BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray self = new BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setTaskNameFormat(String taskNameFormat) {
            this.taskNameFormat = taskNameFormat;
            return this;
        }
        public String getTaskNameFormat() {
            return this.taskNameFormat;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setTaskIndexStart(Long taskIndexStart) {
            this.taskIndexStart = taskIndexStart;
            return this;
        }
        public Long getTaskIndexStart() {
            return this.taskIndexStart;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setTaskIndexEnd(Long taskIndexEnd) {
            this.taskIndexEnd = taskIndexEnd;
            return this;
        }
        public Long getTaskIndexEnd() {
            return this.taskIndexEnd;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

    }

    public static class BatchcreateDTXAppsResponseBodyDataRecoveryArray extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("IsAsyn")
        public Boolean isAsyn;

        @NameInMap("IsDds")
        public Boolean isDds;

        @NameInMap("IsLoadTest")
        public Boolean isLoadTest;

        @NameInMap("DsArray")
        public java.util.List<BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray> dsArray;

        @NameInMap("IsMix")
        public Boolean isMix;

        @NameInMap("Used")
        public Boolean used;

        @NameInMap("RecoveryThreadNum")
        public Long recoveryThreadNum;

        @NameInMap("RecoveryLimit")
        public Long recoveryLimit;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ClientVersion")
        public String clientVersion;

        public static BatchcreateDTXAppsResponseBodyDataRecoveryArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDTXAppsResponseBodyDataRecoveryArray self = new BatchcreateDTXAppsResponseBodyDataRecoveryArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setIsAsyn(Boolean isAsyn) {
            this.isAsyn = isAsyn;
            return this;
        }
        public Boolean getIsAsyn() {
            return this.isAsyn;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setIsDds(Boolean isDds) {
            this.isDds = isDds;
            return this;
        }
        public Boolean getIsDds() {
            return this.isDds;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setIsLoadTest(Boolean isLoadTest) {
            this.isLoadTest = isLoadTest;
            return this;
        }
        public Boolean getIsLoadTest() {
            return this.isLoadTest;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setDsArray(java.util.List<BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray> dsArray) {
            this.dsArray = dsArray;
            return this;
        }
        public java.util.List<BatchcreateDTXAppsResponseBodyDataRecoveryArrayDsArray> getDsArray() {
            return this.dsArray;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setIsMix(Boolean isMix) {
            this.isMix = isMix;
            return this;
        }
        public Boolean getIsMix() {
            return this.isMix;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setRecoveryThreadNum(Long recoveryThreadNum) {
            this.recoveryThreadNum = recoveryThreadNum;
            return this;
        }
        public Long getRecoveryThreadNum() {
            return this.recoveryThreadNum;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setRecoveryLimit(Long recoveryLimit) {
            this.recoveryLimit = recoveryLimit;
            return this;
        }
        public Long getRecoveryLimit() {
            return this.recoveryLimit;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchcreateDTXAppsResponseBodyDataRecoveryArray setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

    }

    public static class BatchcreateDTXAppsResponseBodyData extends TeaModel {
        @NameInMap("ActionArray")
        public java.util.List<BatchcreateDTXAppsResponseBodyDataActionArray> actionArray;

        @NameInMap("RecoveryArray")
        public java.util.List<BatchcreateDTXAppsResponseBodyDataRecoveryArray> recoveryArray;

        @NameInMap("DbRuleTemplate")
        public String dbRuleTemplate;

        @NameInMap("ActionCount")
        public Long actionCount;

        @NameInMap("Used")
        public Boolean used;

        @NameInMap("SpliteMode")
        public Long spliteMode;

        @NameInMap("TableRuleTemplate")
        public String tableRuleTemplate;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("ActivityMode")
        public Long activityMode;

        @NameInMap("DbRuleName")
        public String dbRuleName;

        @NameInMap("ActivityCount")
        public Long activityCount;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("TableRuleName")
        public String tableRuleName;

        @NameInMap("Id")
        public Long id;

        public static BatchcreateDTXAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDTXAppsResponseBodyData self = new BatchcreateDTXAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchcreateDTXAppsResponseBodyData setActionArray(java.util.List<BatchcreateDTXAppsResponseBodyDataActionArray> actionArray) {
            this.actionArray = actionArray;
            return this;
        }
        public java.util.List<BatchcreateDTXAppsResponseBodyDataActionArray> getActionArray() {
            return this.actionArray;
        }

        public BatchcreateDTXAppsResponseBodyData setRecoveryArray(java.util.List<BatchcreateDTXAppsResponseBodyDataRecoveryArray> recoveryArray) {
            this.recoveryArray = recoveryArray;
            return this;
        }
        public java.util.List<BatchcreateDTXAppsResponseBodyDataRecoveryArray> getRecoveryArray() {
            return this.recoveryArray;
        }

        public BatchcreateDTXAppsResponseBodyData setDbRuleTemplate(String dbRuleTemplate) {
            this.dbRuleTemplate = dbRuleTemplate;
            return this;
        }
        public String getDbRuleTemplate() {
            return this.dbRuleTemplate;
        }

        public BatchcreateDTXAppsResponseBodyData setActionCount(Long actionCount) {
            this.actionCount = actionCount;
            return this;
        }
        public Long getActionCount() {
            return this.actionCount;
        }

        public BatchcreateDTXAppsResponseBodyData setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public BatchcreateDTXAppsResponseBodyData setSpliteMode(Long spliteMode) {
            this.spliteMode = spliteMode;
            return this;
        }
        public Long getSpliteMode() {
            return this.spliteMode;
        }

        public BatchcreateDTXAppsResponseBodyData setTableRuleTemplate(String tableRuleTemplate) {
            this.tableRuleTemplate = tableRuleTemplate;
            return this;
        }
        public String getTableRuleTemplate() {
            return this.tableRuleTemplate;
        }

        public BatchcreateDTXAppsResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public BatchcreateDTXAppsResponseBodyData setActivityMode(Long activityMode) {
            this.activityMode = activityMode;
            return this;
        }
        public Long getActivityMode() {
            return this.activityMode;
        }

        public BatchcreateDTXAppsResponseBodyData setDbRuleName(String dbRuleName) {
            this.dbRuleName = dbRuleName;
            return this;
        }
        public String getDbRuleName() {
            return this.dbRuleName;
        }

        public BatchcreateDTXAppsResponseBodyData setActivityCount(Long activityCount) {
            this.activityCount = activityCount;
            return this;
        }
        public Long getActivityCount() {
            return this.activityCount;
        }

        public BatchcreateDTXAppsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public BatchcreateDTXAppsResponseBodyData setTableRuleName(String tableRuleName) {
            this.tableRuleName = tableRuleName;
            return this;
        }
        public String getTableRuleName() {
            return this.tableRuleName;
        }

        public BatchcreateDTXAppsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
