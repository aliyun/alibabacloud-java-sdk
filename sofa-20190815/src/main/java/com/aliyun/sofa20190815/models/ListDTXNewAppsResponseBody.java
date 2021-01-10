// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXNewAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Data")
    public java.util.List<ListDTXNewAppsResponseBodyData> data;

    public static ListDTXNewAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDTXNewAppsResponseBody self = new ListDTXNewAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDTXNewAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDTXNewAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDTXNewAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDTXNewAppsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListDTXNewAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDTXNewAppsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListDTXNewAppsResponseBody setData(java.util.List<ListDTXNewAppsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDTXNewAppsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListDTXNewAppsResponseBodyDataActionArray extends TeaModel {
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

        public static ListDTXNewAppsResponseBodyDataActionArray build(java.util.Map<String, ?> map) throws Exception {
            ListDTXNewAppsResponseBodyDataActionArray self = new ListDTXNewAppsResponseBodyDataActionArray();
            return TeaModel.build(map, self);
        }

        public ListDTXNewAppsResponseBodyDataActionArray setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setCommitMethodName(String commitMethodName) {
            this.commitMethodName = commitMethodName;
            return this;
        }
        public String getCommitMethodName() {
            return this.commitMethodName;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setCommitMethodParamsType(Long commitMethodParamsType) {
            this.commitMethodParamsType = commitMethodParamsType;
            return this;
        }
        public Long getCommitMethodParamsType() {
            return this.commitMethodParamsType;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setElasticKey(String elasticKey) {
            this.elasticKey = elasticKey;
            return this;
        }
        public String getElasticKey() {
            return this.elasticKey;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setElasticRouteRule(String elasticRouteRule) {
            this.elasticRouteRule = elasticRouteRule;
            return this;
        }
        public String getElasticRouteRule() {
            return this.elasticRouteRule;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setIsZoneRoute(Boolean isZoneRoute) {
            this.isZoneRoute = isZoneRoute;
            return this;
        }
        public Boolean getIsZoneRoute() {
            return this.isZoneRoute;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setRollbackMethodName(String rollbackMethodName) {
            this.rollbackMethodName = rollbackMethodName;
            return this;
        }
        public String getRollbackMethodName() {
            return this.rollbackMethodName;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setRollbackMethodParamsType(Long rollbackMethodParamsType) {
            this.rollbackMethodParamsType = rollbackMethodParamsType;
            return this;
        }
        public Long getRollbackMethodParamsType() {
            return this.rollbackMethodParamsType;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setTestUrl(String testUrl) {
            this.testUrl = testUrl;
            return this;
        }
        public String getTestUrl() {
            return this.testUrl;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public ListDTXNewAppsResponseBodyDataActionArray setWsTr(String wsTr) {
            this.wsTr = wsTr;
            return this;
        }
        public String getWsTr() {
            return this.wsTr;
        }

    }

    public static class ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray extends TeaModel {
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

        public static ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray build(java.util.Map<String, ?> map) throws Exception {
            ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray self = new ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray();
            return TeaModel.build(map, self);
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setTaskIndexEnd(Long taskIndexEnd) {
            this.taskIndexEnd = taskIndexEnd;
            return this;
        }
        public Long getTaskIndexEnd() {
            return this.taskIndexEnd;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setTaskIndexStart(Long taskIndexStart) {
            this.taskIndexStart = taskIndexStart;
            return this;
        }
        public Long getTaskIndexStart() {
            return this.taskIndexStart;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setTaskNameFormat(String taskNameFormat) {
            this.taskNameFormat = taskNameFormat;
            return this;
        }
        public String getTaskNameFormat() {
            return this.taskNameFormat;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class ListDTXNewAppsResponseBodyDataRecoveryArray extends TeaModel {
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
        public java.util.List<ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray> dsArray;

        public static ListDTXNewAppsResponseBodyDataRecoveryArray build(java.util.Map<String, ?> map) throws Exception {
            ListDTXNewAppsResponseBodyDataRecoveryArray self = new ListDTXNewAppsResponseBodyDataRecoveryArray();
            return TeaModel.build(map, self);
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setIsAsyn(Boolean isAsyn) {
            this.isAsyn = isAsyn;
            return this;
        }
        public Boolean getIsAsyn() {
            return this.isAsyn;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setIsDds(Boolean isDds) {
            this.isDds = isDds;
            return this;
        }
        public Boolean getIsDds() {
            return this.isDds;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setIsLoadTest(Boolean isLoadTest) {
            this.isLoadTest = isLoadTest;
            return this;
        }
        public Boolean getIsLoadTest() {
            return this.isLoadTest;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setIsMix(Boolean isMix) {
            this.isMix = isMix;
            return this;
        }
        public Boolean getIsMix() {
            return this.isMix;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setRecoveryLimit(Long recoveryLimit) {
            this.recoveryLimit = recoveryLimit;
            return this;
        }
        public Long getRecoveryLimit() {
            return this.recoveryLimit;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setRecoveryThreadNum(Long recoveryThreadNum) {
            this.recoveryThreadNum = recoveryThreadNum;
            return this;
        }
        public Long getRecoveryThreadNum() {
            return this.recoveryThreadNum;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public ListDTXNewAppsResponseBodyDataRecoveryArray setDsArray(java.util.List<ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray> dsArray) {
            this.dsArray = dsArray;
            return this;
        }
        public java.util.List<ListDTXNewAppsResponseBodyDataRecoveryArrayDsArray> getDsArray() {
            return this.dsArray;
        }

    }

    public static class ListDTXNewAppsResponseBodyData extends TeaModel {
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
        public java.util.List<ListDTXNewAppsResponseBodyDataActionArray> actionArray;

        @NameInMap("RecoveryArray")
        public java.util.List<ListDTXNewAppsResponseBodyDataRecoveryArray> recoveryArray;

        public static ListDTXNewAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDTXNewAppsResponseBodyData self = new ListDTXNewAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDTXNewAppsResponseBodyData setActionCount(Long actionCount) {
            this.actionCount = actionCount;
            return this;
        }
        public Long getActionCount() {
            return this.actionCount;
        }

        public ListDTXNewAppsResponseBodyData setActivityCount(Long activityCount) {
            this.activityCount = activityCount;
            return this;
        }
        public Long getActivityCount() {
            return this.activityCount;
        }

        public ListDTXNewAppsResponseBodyData setActivityMode(Long activityMode) {
            this.activityMode = activityMode;
            return this;
        }
        public Long getActivityMode() {
            return this.activityMode;
        }

        public ListDTXNewAppsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDTXNewAppsResponseBodyData setDbRuleName(String dbRuleName) {
            this.dbRuleName = dbRuleName;
            return this;
        }
        public String getDbRuleName() {
            return this.dbRuleName;
        }

        public ListDTXNewAppsResponseBodyData setDbRuleTemplate(String dbRuleTemplate) {
            this.dbRuleTemplate = dbRuleTemplate;
            return this;
        }
        public String getDbRuleTemplate() {
            return this.dbRuleTemplate;
        }

        public ListDTXNewAppsResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListDTXNewAppsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDTXNewAppsResponseBodyData setSpliteMode(Long spliteMode) {
            this.spliteMode = spliteMode;
            return this;
        }
        public Long getSpliteMode() {
            return this.spliteMode;
        }

        public ListDTXNewAppsResponseBodyData setTableRuleName(String tableRuleName) {
            this.tableRuleName = tableRuleName;
            return this;
        }
        public String getTableRuleName() {
            return this.tableRuleName;
        }

        public ListDTXNewAppsResponseBodyData setTableRuleTemplate(String tableRuleTemplate) {
            this.tableRuleTemplate = tableRuleTemplate;
            return this;
        }
        public String getTableRuleTemplate() {
            return this.tableRuleTemplate;
        }

        public ListDTXNewAppsResponseBodyData setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public ListDTXNewAppsResponseBodyData setActionArray(java.util.List<ListDTXNewAppsResponseBodyDataActionArray> actionArray) {
            this.actionArray = actionArray;
            return this;
        }
        public java.util.List<ListDTXNewAppsResponseBodyDataActionArray> getActionArray() {
            return this.actionArray;
        }

        public ListDTXNewAppsResponseBodyData setRecoveryArray(java.util.List<ListDTXNewAppsResponseBodyDataRecoveryArray> recoveryArray) {
            this.recoveryArray = recoveryArray;
            return this;
        }
        public java.util.List<ListDTXNewAppsResponseBodyDataRecoveryArray> getRecoveryArray() {
            return this.recoveryArray;
        }

    }

}
