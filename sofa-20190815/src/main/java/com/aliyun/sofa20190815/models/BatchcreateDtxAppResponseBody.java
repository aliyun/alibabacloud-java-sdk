// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateDtxAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public BatchcreateDtxAppResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchcreateDtxAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDtxAppResponseBody self = new BatchcreateDtxAppResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchcreateDtxAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchcreateDtxAppResponseBody setData(BatchcreateDtxAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchcreateDtxAppResponseBodyData getData() {
        return this.data;
    }

    public BatchcreateDtxAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchcreateDtxAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchcreateDtxAppResponseBodyDataActionArray extends TeaModel {
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

        public static BatchcreateDtxAppResponseBodyDataActionArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDtxAppResponseBodyDataActionArray self = new BatchcreateDtxAppResponseBodyDataActionArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setRollbackMethodName(String rollbackMethodName) {
            this.rollbackMethodName = rollbackMethodName;
            return this;
        }
        public String getRollbackMethodName() {
            return this.rollbackMethodName;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setElasticKey(String elasticKey) {
            this.elasticKey = elasticKey;
            return this;
        }
        public String getElasticKey() {
            return this.elasticKey;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setIsZoneRoute(Boolean isZoneRoute) {
            this.isZoneRoute = isZoneRoute;
            return this;
        }
        public Boolean getIsZoneRoute() {
            return this.isZoneRoute;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setCommitMethodName(String commitMethodName) {
            this.commitMethodName = commitMethodName;
            return this;
        }
        public String getCommitMethodName() {
            return this.commitMethodName;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setTestUrl(String testUrl) {
            this.testUrl = testUrl;
            return this;
        }
        public String getTestUrl() {
            return this.testUrl;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setRollbackMethodParamsType(Long rollbackMethodParamsType) {
            this.rollbackMethodParamsType = rollbackMethodParamsType;
            return this;
        }
        public Long getRollbackMethodParamsType() {
            return this.rollbackMethodParamsType;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setCommitMethodParamsType(Long commitMethodParamsType) {
            this.commitMethodParamsType = commitMethodParamsType;
            return this;
        }
        public Long getCommitMethodParamsType() {
            return this.commitMethodParamsType;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setWsTr(String wsTr) {
            this.wsTr = wsTr;
            return this;
        }
        public String getWsTr() {
            return this.wsTr;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setElasticRouteRule(String elasticRouteRule) {
            this.elasticRouteRule = elasticRouteRule;
            return this;
        }
        public String getElasticRouteRule() {
            return this.elasticRouteRule;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public BatchcreateDtxAppResponseBodyDataActionArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray extends TeaModel {
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

        public static BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray self = new BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setTaskNameFormat(String taskNameFormat) {
            this.taskNameFormat = taskNameFormat;
            return this;
        }
        public String getTaskNameFormat() {
            return this.taskNameFormat;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setTaskIndexStart(Long taskIndexStart) {
            this.taskIndexStart = taskIndexStart;
            return this;
        }
        public Long getTaskIndexStart() {
            return this.taskIndexStart;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setTaskIndexEnd(Long taskIndexEnd) {
            this.taskIndexEnd = taskIndexEnd;
            return this;
        }
        public Long getTaskIndexEnd() {
            return this.taskIndexEnd;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

    }

    public static class BatchcreateDtxAppResponseBodyDataRecoveryArray extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("IsAsyn")
        public Boolean isAsyn;

        @NameInMap("IsDds")
        public Boolean isDds;

        @NameInMap("IsLoadTest")
        public Boolean isLoadTest;

        @NameInMap("DsArray")
        public java.util.List<BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray> dsArray;

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

        public static BatchcreateDtxAppResponseBodyDataRecoveryArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDtxAppResponseBodyDataRecoveryArray self = new BatchcreateDtxAppResponseBodyDataRecoveryArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setIsAsyn(Boolean isAsyn) {
            this.isAsyn = isAsyn;
            return this;
        }
        public Boolean getIsAsyn() {
            return this.isAsyn;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setIsDds(Boolean isDds) {
            this.isDds = isDds;
            return this;
        }
        public Boolean getIsDds() {
            return this.isDds;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setIsLoadTest(Boolean isLoadTest) {
            this.isLoadTest = isLoadTest;
            return this;
        }
        public Boolean getIsLoadTest() {
            return this.isLoadTest;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setDsArray(java.util.List<BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray> dsArray) {
            this.dsArray = dsArray;
            return this;
        }
        public java.util.List<BatchcreateDtxAppResponseBodyDataRecoveryArrayDsArray> getDsArray() {
            return this.dsArray;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setIsMix(Boolean isMix) {
            this.isMix = isMix;
            return this;
        }
        public Boolean getIsMix() {
            return this.isMix;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setRecoveryThreadNum(Long recoveryThreadNum) {
            this.recoveryThreadNum = recoveryThreadNum;
            return this;
        }
        public Long getRecoveryThreadNum() {
            return this.recoveryThreadNum;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setRecoveryLimit(Long recoveryLimit) {
            this.recoveryLimit = recoveryLimit;
            return this;
        }
        public Long getRecoveryLimit() {
            return this.recoveryLimit;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchcreateDtxAppResponseBodyDataRecoveryArray setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

    }

    public static class BatchcreateDtxAppResponseBodyData extends TeaModel {
        @NameInMap("ActionArray")
        public java.util.List<BatchcreateDtxAppResponseBodyDataActionArray> actionArray;

        @NameInMap("RecoveryArray")
        public java.util.List<BatchcreateDtxAppResponseBodyDataRecoveryArray> recoveryArray;

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

        public static BatchcreateDtxAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDtxAppResponseBodyData self = new BatchcreateDtxAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchcreateDtxAppResponseBodyData setActionArray(java.util.List<BatchcreateDtxAppResponseBodyDataActionArray> actionArray) {
            this.actionArray = actionArray;
            return this;
        }
        public java.util.List<BatchcreateDtxAppResponseBodyDataActionArray> getActionArray() {
            return this.actionArray;
        }

        public BatchcreateDtxAppResponseBodyData setRecoveryArray(java.util.List<BatchcreateDtxAppResponseBodyDataRecoveryArray> recoveryArray) {
            this.recoveryArray = recoveryArray;
            return this;
        }
        public java.util.List<BatchcreateDtxAppResponseBodyDataRecoveryArray> getRecoveryArray() {
            return this.recoveryArray;
        }

        public BatchcreateDtxAppResponseBodyData setDbRuleTemplate(String dbRuleTemplate) {
            this.dbRuleTemplate = dbRuleTemplate;
            return this;
        }
        public String getDbRuleTemplate() {
            return this.dbRuleTemplate;
        }

        public BatchcreateDtxAppResponseBodyData setActionCount(Long actionCount) {
            this.actionCount = actionCount;
            return this;
        }
        public Long getActionCount() {
            return this.actionCount;
        }

        public BatchcreateDtxAppResponseBodyData setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public BatchcreateDtxAppResponseBodyData setSpliteMode(Long spliteMode) {
            this.spliteMode = spliteMode;
            return this;
        }
        public Long getSpliteMode() {
            return this.spliteMode;
        }

        public BatchcreateDtxAppResponseBodyData setTableRuleTemplate(String tableRuleTemplate) {
            this.tableRuleTemplate = tableRuleTemplate;
            return this;
        }
        public String getTableRuleTemplate() {
            return this.tableRuleTemplate;
        }

        public BatchcreateDtxAppResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public BatchcreateDtxAppResponseBodyData setActivityMode(Long activityMode) {
            this.activityMode = activityMode;
            return this;
        }
        public Long getActivityMode() {
            return this.activityMode;
        }

        public BatchcreateDtxAppResponseBodyData setDbRuleName(String dbRuleName) {
            this.dbRuleName = dbRuleName;
            return this;
        }
        public String getDbRuleName() {
            return this.dbRuleName;
        }

        public BatchcreateDtxAppResponseBodyData setActivityCount(Long activityCount) {
            this.activityCount = activityCount;
            return this;
        }
        public Long getActivityCount() {
            return this.activityCount;
        }

        public BatchcreateDtxAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public BatchcreateDtxAppResponseBodyData setTableRuleName(String tableRuleName) {
            this.tableRuleName = tableRuleName;
            return this;
        }
        public String getTableRuleName() {
            return this.tableRuleName;
        }

        public BatchcreateDtxAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
