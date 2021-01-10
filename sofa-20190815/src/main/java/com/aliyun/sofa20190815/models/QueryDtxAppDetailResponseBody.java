// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDtxAppDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryDtxAppDetailResponseBodyData data;

    public static QueryDtxAppDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDtxAppDetailResponseBody self = new QueryDtxAppDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDtxAppDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDtxAppDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDtxAppDetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDtxAppDetailResponseBody setData(QueryDtxAppDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDtxAppDetailResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDtxAppDetailResponseBodyDataActionArray extends TeaModel {
        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClassName")
        public String className;

        @NameInMap("CommitMethodName")
        public String commitMethodName;

        @NameInMap("CommitMethodParamsType")
        public Long commitMethodParamsType;

        @NameInMap("ElasticKey")
        public String elasticKey;

        @NameInMap("ElasticRouteRule")
        public String elasticRouteRule;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsZoneRoute")
        public Boolean isZoneRoute;

        @NameInMap("RollbackMethodName")
        public String rollbackMethodName;

        @NameInMap("RollbackMethodParamsType")
        public Long rollbackMethodParamsType;

        @NameInMap("TestUrl")
        public String testUrl;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("Used")
        public Boolean used;

        @NameInMap("WsTr")
        public String wsTr;

        public static QueryDtxAppDetailResponseBodyDataActionArray build(java.util.Map<String, ?> map) throws Exception {
            QueryDtxAppDetailResponseBodyDataActionArray self = new QueryDtxAppDetailResponseBodyDataActionArray();
            return TeaModel.build(map, self);
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setCommitMethodName(String commitMethodName) {
            this.commitMethodName = commitMethodName;
            return this;
        }
        public String getCommitMethodName() {
            return this.commitMethodName;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setCommitMethodParamsType(Long commitMethodParamsType) {
            this.commitMethodParamsType = commitMethodParamsType;
            return this;
        }
        public Long getCommitMethodParamsType() {
            return this.commitMethodParamsType;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setElasticKey(String elasticKey) {
            this.elasticKey = elasticKey;
            return this;
        }
        public String getElasticKey() {
            return this.elasticKey;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setElasticRouteRule(String elasticRouteRule) {
            this.elasticRouteRule = elasticRouteRule;
            return this;
        }
        public String getElasticRouteRule() {
            return this.elasticRouteRule;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setIsZoneRoute(Boolean isZoneRoute) {
            this.isZoneRoute = isZoneRoute;
            return this;
        }
        public Boolean getIsZoneRoute() {
            return this.isZoneRoute;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setRollbackMethodName(String rollbackMethodName) {
            this.rollbackMethodName = rollbackMethodName;
            return this;
        }
        public String getRollbackMethodName() {
            return this.rollbackMethodName;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setRollbackMethodParamsType(Long rollbackMethodParamsType) {
            this.rollbackMethodParamsType = rollbackMethodParamsType;
            return this;
        }
        public Long getRollbackMethodParamsType() {
            return this.rollbackMethodParamsType;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setTestUrl(String testUrl) {
            this.testUrl = testUrl;
            return this;
        }
        public String getTestUrl() {
            return this.testUrl;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public QueryDtxAppDetailResponseBodyDataActionArray setWsTr(String wsTr) {
            this.wsTr = wsTr;
            return this;
        }
        public String getWsTr() {
            return this.wsTr;
        }

    }

    public static class QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray extends TeaModel {
        @NameInMap("ActionTableIndexEnd")
        public Long actionTableIndexEnd;

        @NameInMap("ActionTableIndexStart")
        public Long actionTableIndexStart;

        @NameInMap("ActionTableNameFormat")
        public String actionTableNameFormat;

        @NameInMap("ActivityTableIndexEnd")
        public Long activityTableIndexEnd;

        @NameInMap("ActivityTableIndexStart")
        public Long activityTableIndexStart;

        @NameInMap("ActivityTableNameFormat")
        public String activityTableNameFormat;

        @NameInMap("DbConnectMin")
        public Long dbConnectMin;

        @NameInMap("DbConnMax")
        public Long dbConnMax;

        @NameInMap("DbType")
        public Long dbType;

        @NameInMap("DsIndexEnd")
        public Long dsIndexEnd;

        @NameInMap("DsIndexStart")
        public Long dsIndexStart;

        @NameInMap("DsNameFormat")
        public String dsNameFormat;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsLdc")
        public Boolean isLdc;

        @NameInMap("IsLocalDs")
        public Boolean isLocalDs;

        @NameInMap("TaskIndexEnd")
        public Long taskIndexEnd;

        @NameInMap("TaskIndexStart")
        public Long taskIndexStart;

        @NameInMap("TaskNameFormat")
        public String taskNameFormat;

        @NameInMap("Zone")
        public String zone;

        public static QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray build(java.util.Map<String, ?> map) throws Exception {
            QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray self = new QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray();
            return TeaModel.build(map, self);
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setTaskIndexEnd(Long taskIndexEnd) {
            this.taskIndexEnd = taskIndexEnd;
            return this;
        }
        public Long getTaskIndexEnd() {
            return this.taskIndexEnd;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setTaskIndexStart(Long taskIndexStart) {
            this.taskIndexStart = taskIndexStart;
            return this;
        }
        public Long getTaskIndexStart() {
            return this.taskIndexStart;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setTaskNameFormat(String taskNameFormat) {
            this.taskNameFormat = taskNameFormat;
            return this;
        }
        public String getTaskNameFormat() {
            return this.taskNameFormat;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QueryDtxAppDetailResponseBodyDataRecoveryArray extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsAsyn")
        public Boolean isAsyn;

        @NameInMap("IsDds")
        public Boolean isDds;

        @NameInMap("IsLoadTest")
        public Boolean isLoadTest;

        @NameInMap("IsMix")
        public Boolean isMix;

        @NameInMap("RecoveryLimit")
        public Long recoveryLimit;

        @NameInMap("RecoveryThreadNum")
        public Long recoveryThreadNum;

        @NameInMap("Used")
        public Boolean used;

        @NameInMap("DsArray")
        public java.util.List<QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray> dsArray;

        public static QueryDtxAppDetailResponseBodyDataRecoveryArray build(java.util.Map<String, ?> map) throws Exception {
            QueryDtxAppDetailResponseBodyDataRecoveryArray self = new QueryDtxAppDetailResponseBodyDataRecoveryArray();
            return TeaModel.build(map, self);
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setIsAsyn(Boolean isAsyn) {
            this.isAsyn = isAsyn;
            return this;
        }
        public Boolean getIsAsyn() {
            return this.isAsyn;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setIsDds(Boolean isDds) {
            this.isDds = isDds;
            return this;
        }
        public Boolean getIsDds() {
            return this.isDds;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setIsLoadTest(Boolean isLoadTest) {
            this.isLoadTest = isLoadTest;
            return this;
        }
        public Boolean getIsLoadTest() {
            return this.isLoadTest;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setIsMix(Boolean isMix) {
            this.isMix = isMix;
            return this;
        }
        public Boolean getIsMix() {
            return this.isMix;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setRecoveryLimit(Long recoveryLimit) {
            this.recoveryLimit = recoveryLimit;
            return this;
        }
        public Long getRecoveryLimit() {
            return this.recoveryLimit;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setRecoveryThreadNum(Long recoveryThreadNum) {
            this.recoveryThreadNum = recoveryThreadNum;
            return this;
        }
        public Long getRecoveryThreadNum() {
            return this.recoveryThreadNum;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public QueryDtxAppDetailResponseBodyDataRecoveryArray setDsArray(java.util.List<QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray> dsArray) {
            this.dsArray = dsArray;
            return this;
        }
        public java.util.List<QueryDtxAppDetailResponseBodyDataRecoveryArrayDsArray> getDsArray() {
            return this.dsArray;
        }

    }

    public static class QueryDtxAppDetailResponseBodyData extends TeaModel {
        @NameInMap("ActionCount")
        public Long actionCount;

        @NameInMap("ActivityCount")
        public Long activityCount;

        @NameInMap("ActivityMode")
        public Long activityMode;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("DbRuleName")
        public String dbRuleName;

        @NameInMap("DbRuleTemplate")
        public String dbRuleTemplate;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SpliteMode")
        public Long spliteMode;

        @NameInMap("TableRuleName")
        public String tableRuleName;

        @NameInMap("TableRuleTemplate")
        public String tableRuleTemplate;

        @NameInMap("Used")
        public Boolean used;

        @NameInMap("ActionArray")
        public java.util.List<QueryDtxAppDetailResponseBodyDataActionArray> actionArray;

        @NameInMap("RecoveryArray")
        public java.util.List<QueryDtxAppDetailResponseBodyDataRecoveryArray> recoveryArray;

        public static QueryDtxAppDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDtxAppDetailResponseBodyData self = new QueryDtxAppDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDtxAppDetailResponseBodyData setActionCount(Long actionCount) {
            this.actionCount = actionCount;
            return this;
        }
        public Long getActionCount() {
            return this.actionCount;
        }

        public QueryDtxAppDetailResponseBodyData setActivityCount(Long activityCount) {
            this.activityCount = activityCount;
            return this;
        }
        public Long getActivityCount() {
            return this.activityCount;
        }

        public QueryDtxAppDetailResponseBodyData setActivityMode(Long activityMode) {
            this.activityMode = activityMode;
            return this;
        }
        public Long getActivityMode() {
            return this.activityMode;
        }

        public QueryDtxAppDetailResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryDtxAppDetailResponseBodyData setDbRuleName(String dbRuleName) {
            this.dbRuleName = dbRuleName;
            return this;
        }
        public String getDbRuleName() {
            return this.dbRuleName;
        }

        public QueryDtxAppDetailResponseBodyData setDbRuleTemplate(String dbRuleTemplate) {
            this.dbRuleTemplate = dbRuleTemplate;
            return this;
        }
        public String getDbRuleTemplate() {
            return this.dbRuleTemplate;
        }

        public QueryDtxAppDetailResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryDtxAppDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDtxAppDetailResponseBodyData setSpliteMode(Long spliteMode) {
            this.spliteMode = spliteMode;
            return this;
        }
        public Long getSpliteMode() {
            return this.spliteMode;
        }

        public QueryDtxAppDetailResponseBodyData setTableRuleName(String tableRuleName) {
            this.tableRuleName = tableRuleName;
            return this;
        }
        public String getTableRuleName() {
            return this.tableRuleName;
        }

        public QueryDtxAppDetailResponseBodyData setTableRuleTemplate(String tableRuleTemplate) {
            this.tableRuleTemplate = tableRuleTemplate;
            return this;
        }
        public String getTableRuleTemplate() {
            return this.tableRuleTemplate;
        }

        public QueryDtxAppDetailResponseBodyData setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public QueryDtxAppDetailResponseBodyData setActionArray(java.util.List<QueryDtxAppDetailResponseBodyDataActionArray> actionArray) {
            this.actionArray = actionArray;
            return this;
        }
        public java.util.List<QueryDtxAppDetailResponseBodyDataActionArray> getActionArray() {
            return this.actionArray;
        }

        public QueryDtxAppDetailResponseBodyData setRecoveryArray(java.util.List<QueryDtxAppDetailResponseBodyDataRecoveryArray> recoveryArray) {
            this.recoveryArray = recoveryArray;
            return this;
        }
        public java.util.List<QueryDtxAppDetailResponseBodyDataRecoveryArray> getRecoveryArray() {
            return this.recoveryArray;
        }

    }

}
