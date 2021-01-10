// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateDTXAppsRequest extends TeaModel {
    @NameInMap("ActivityMode")
    public Long activityMode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("DbRuleName")
    public String dbRuleName;

    @NameInMap("DbRuleTemplete")
    public String dbRuleTemplete;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TableRuleName")
    public String tableRuleName;

    @NameInMap("TableRuleTemplete")
    public String tableRuleTemplete;

    @NameInMap("ActionArray")
    public java.util.List<BatchcreateDTXAppsRequestActionArray> actionArray;

    @NameInMap("RecoveryArray")
    public java.util.List<BatchcreateDTXAppsRequestRecoveryArray> recoveryArray;

    @NameInMap("RecoveryDsArray")
    public java.util.List<BatchcreateDTXAppsRequestRecoveryDsArray> recoveryDsArray;

    public static BatchcreateDTXAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDTXAppsRequest self = new BatchcreateDTXAppsRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateDTXAppsRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public BatchcreateDTXAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BatchcreateDTXAppsRequest setDbRuleName(String dbRuleName) {
        this.dbRuleName = dbRuleName;
        return this;
    }
    public String getDbRuleName() {
        return this.dbRuleName;
    }

    public BatchcreateDTXAppsRequest setDbRuleTemplete(String dbRuleTemplete) {
        this.dbRuleTemplete = dbRuleTemplete;
        return this;
    }
    public String getDbRuleTemplete() {
        return this.dbRuleTemplete;
    }

    public BatchcreateDTXAppsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public BatchcreateDTXAppsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BatchcreateDTXAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchcreateDTXAppsRequest setTableRuleName(String tableRuleName) {
        this.tableRuleName = tableRuleName;
        return this;
    }
    public String getTableRuleName() {
        return this.tableRuleName;
    }

    public BatchcreateDTXAppsRequest setTableRuleTemplete(String tableRuleTemplete) {
        this.tableRuleTemplete = tableRuleTemplete;
        return this;
    }
    public String getTableRuleTemplete() {
        return this.tableRuleTemplete;
    }

    public BatchcreateDTXAppsRequest setActionArray(java.util.List<BatchcreateDTXAppsRequestActionArray> actionArray) {
        this.actionArray = actionArray;
        return this;
    }
    public java.util.List<BatchcreateDTXAppsRequestActionArray> getActionArray() {
        return this.actionArray;
    }

    public BatchcreateDTXAppsRequest setRecoveryArray(java.util.List<BatchcreateDTXAppsRequestRecoveryArray> recoveryArray) {
        this.recoveryArray = recoveryArray;
        return this;
    }
    public java.util.List<BatchcreateDTXAppsRequestRecoveryArray> getRecoveryArray() {
        return this.recoveryArray;
    }

    public BatchcreateDTXAppsRequest setRecoveryDsArray(java.util.List<BatchcreateDTXAppsRequestRecoveryDsArray> recoveryDsArray) {
        this.recoveryDsArray = recoveryDsArray;
        return this;
    }
    public java.util.List<BatchcreateDTXAppsRequestRecoveryDsArray> getRecoveryDsArray() {
        return this.recoveryDsArray;
    }

    public static class BatchcreateDTXAppsRequestActionArray extends TeaModel {
        @NameInMap("Used")
        public Boolean used;

        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ElasticKey")
        public String elasticKey;

        @NameInMap("RollbackMethodName")
        public String rollbackMethodName;

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

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("WsTr")
        public String wsTr;

        @NameInMap("ElasticRouteRule")
        public String elasticRouteRule;

        @NameInMap("ClassName")
        public String className;

        @NameInMap("Id")
        public Long id;

        public static BatchcreateDTXAppsRequestActionArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDTXAppsRequestActionArray self = new BatchcreateDTXAppsRequestActionArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDTXAppsRequestActionArray setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public BatchcreateDTXAppsRequestActionArray setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public BatchcreateDTXAppsRequestActionArray setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchcreateDTXAppsRequestActionArray setElasticKey(String elasticKey) {
            this.elasticKey = elasticKey;
            return this;
        }
        public String getElasticKey() {
            return this.elasticKey;
        }

        public BatchcreateDTXAppsRequestActionArray setRollbackMethodName(String rollbackMethodName) {
            this.rollbackMethodName = rollbackMethodName;
            return this;
        }
        public String getRollbackMethodName() {
            return this.rollbackMethodName;
        }

        public BatchcreateDTXAppsRequestActionArray setIsZoneRoute(Boolean isZoneRoute) {
            this.isZoneRoute = isZoneRoute;
            return this;
        }
        public Boolean getIsZoneRoute() {
            return this.isZoneRoute;
        }

        public BatchcreateDTXAppsRequestActionArray setCommitMethodName(String commitMethodName) {
            this.commitMethodName = commitMethodName;
            return this;
        }
        public String getCommitMethodName() {
            return this.commitMethodName;
        }

        public BatchcreateDTXAppsRequestActionArray setTestUrl(String testUrl) {
            this.testUrl = testUrl;
            return this;
        }
        public String getTestUrl() {
            return this.testUrl;
        }

        public BatchcreateDTXAppsRequestActionArray setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public BatchcreateDTXAppsRequestActionArray setRollbackMethodParamsType(Long rollbackMethodParamsType) {
            this.rollbackMethodParamsType = rollbackMethodParamsType;
            return this;
        }
        public Long getRollbackMethodParamsType() {
            return this.rollbackMethodParamsType;
        }

        public BatchcreateDTXAppsRequestActionArray setCommitMethodParamsType(Long commitMethodParamsType) {
            this.commitMethodParamsType = commitMethodParamsType;
            return this;
        }
        public Long getCommitMethodParamsType() {
            return this.commitMethodParamsType;
        }

        public BatchcreateDTXAppsRequestActionArray setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public BatchcreateDTXAppsRequestActionArray setWsTr(String wsTr) {
            this.wsTr = wsTr;
            return this;
        }
        public String getWsTr() {
            return this.wsTr;
        }

        public BatchcreateDTXAppsRequestActionArray setElasticRouteRule(String elasticRouteRule) {
            this.elasticRouteRule = elasticRouteRule;
            return this;
        }
        public String getElasticRouteRule() {
            return this.elasticRouteRule;
        }

        public BatchcreateDTXAppsRequestActionArray setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public BatchcreateDTXAppsRequestActionArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class BatchcreateDTXAppsRequestRecoveryArray extends TeaModel {
        @NameInMap("IsAsyn")
        public Boolean isAsyn;

        @NameInMap("IsLoadTest")
        public Boolean isLoadTest;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("IsMix")
        public Boolean isMix;

        @NameInMap("RecoveryThreadNum")
        public Long recoveryThreadNum;

        @NameInMap("RecoveryLimit")
        public Long recoveryLimit;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ClientVersion")
        public String clientVersion;

        public static BatchcreateDTXAppsRequestRecoveryArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDTXAppsRequestRecoveryArray self = new BatchcreateDTXAppsRequestRecoveryArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDTXAppsRequestRecoveryArray setIsAsyn(Boolean isAsyn) {
            this.isAsyn = isAsyn;
            return this;
        }
        public Boolean getIsAsyn() {
            return this.isAsyn;
        }

        public BatchcreateDTXAppsRequestRecoveryArray setIsLoadTest(Boolean isLoadTest) {
            this.isLoadTest = isLoadTest;
            return this;
        }
        public Boolean getIsLoadTest() {
            return this.isLoadTest;
        }

        public BatchcreateDTXAppsRequestRecoveryArray setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BatchcreateDTXAppsRequestRecoveryArray setIsMix(Boolean isMix) {
            this.isMix = isMix;
            return this;
        }
        public Boolean getIsMix() {
            return this.isMix;
        }

        public BatchcreateDTXAppsRequestRecoveryArray setRecoveryThreadNum(Long recoveryThreadNum) {
            this.recoveryThreadNum = recoveryThreadNum;
            return this;
        }
        public Long getRecoveryThreadNum() {
            return this.recoveryThreadNum;
        }

        public BatchcreateDTXAppsRequestRecoveryArray setRecoveryLimit(Long recoveryLimit) {
            this.recoveryLimit = recoveryLimit;
            return this;
        }
        public Long getRecoveryLimit() {
            return this.recoveryLimit;
        }

        public BatchcreateDTXAppsRequestRecoveryArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchcreateDTXAppsRequestRecoveryArray setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

    }

    public static class BatchcreateDTXAppsRequestRecoveryDsArray extends TeaModel {
        @NameInMap("TaskNameFormat")
        public String taskNameFormat;

        @NameInMap("IsLdc")
        public Boolean isLdc;

        @NameInMap("DsIndexEnd")
        public Long dsIndexEnd;

        @NameInMap("ActionTableNameFormat")
        public String actionTableNameFormat;

        @NameInMap("TaskIndexStart")
        public Long taskIndexStart;

        @NameInMap("IsLocalDs")
        public Boolean isLocalDs;

        @NameInMap("TaskIndexEnd")
        public Long taskIndexEnd;

        @NameInMap("ActionTableIndexEnd")
        public Long actionTableIndexEnd;

        @NameInMap("DbConnectMin")
        public Long dbConnectMin;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("DbType")
        public Long dbType;

        @NameInMap("DsIndexStart")
        public Long dsIndexStart;

        @NameInMap("DbConnMax")
        public Long dbConnMax;

        @NameInMap("DsNameFormat")
        public String dsNameFormat;

        @NameInMap("ActionTableIndexStart")
        public Long actionTableIndexStart;

        @NameInMap("ActivityTableIndexEnd")
        public Long activityTableIndexEnd;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("ActivityTableNameFormat")
        public String activityTableNameFormat;

        @NameInMap("ActivityTableIndexStart")
        public Long activityTableIndexStart;

        @NameInMap("Id")
        public Long id;

        public static BatchcreateDTXAppsRequestRecoveryDsArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDTXAppsRequestRecoveryDsArray self = new BatchcreateDTXAppsRequestRecoveryDsArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setTaskNameFormat(String taskNameFormat) {
            this.taskNameFormat = taskNameFormat;
            return this;
        }
        public String getTaskNameFormat() {
            return this.taskNameFormat;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setTaskIndexStart(Long taskIndexStart) {
            this.taskIndexStart = taskIndexStart;
            return this;
        }
        public Long getTaskIndexStart() {
            return this.taskIndexStart;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setTaskIndexEnd(Long taskIndexEnd) {
            this.taskIndexEnd = taskIndexEnd;
            return this;
        }
        public Long getTaskIndexEnd() {
            return this.taskIndexEnd;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

        public BatchcreateDTXAppsRequestRecoveryDsArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
