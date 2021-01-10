// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateDtxAppRequest extends TeaModel {
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
    public java.util.List<BatchcreateDtxAppRequestActionArray> actionArray;

    @NameInMap("RecoveryArray")
    public java.util.List<BatchcreateDtxAppRequestRecoveryArray> recoveryArray;

    @NameInMap("RecoveryDsArray")
    public java.util.List<BatchcreateDtxAppRequestRecoveryDsArray> recoveryDsArray;

    public static BatchcreateDtxAppRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDtxAppRequest self = new BatchcreateDtxAppRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateDtxAppRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public BatchcreateDtxAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BatchcreateDtxAppRequest setDbRuleName(String dbRuleName) {
        this.dbRuleName = dbRuleName;
        return this;
    }
    public String getDbRuleName() {
        return this.dbRuleName;
    }

    public BatchcreateDtxAppRequest setDbRuleTemplete(String dbRuleTemplete) {
        this.dbRuleTemplete = dbRuleTemplete;
        return this;
    }
    public String getDbRuleTemplete() {
        return this.dbRuleTemplete;
    }

    public BatchcreateDtxAppRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public BatchcreateDtxAppRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BatchcreateDtxAppRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchcreateDtxAppRequest setTableRuleName(String tableRuleName) {
        this.tableRuleName = tableRuleName;
        return this;
    }
    public String getTableRuleName() {
        return this.tableRuleName;
    }

    public BatchcreateDtxAppRequest setTableRuleTemplete(String tableRuleTemplete) {
        this.tableRuleTemplete = tableRuleTemplete;
        return this;
    }
    public String getTableRuleTemplete() {
        return this.tableRuleTemplete;
    }

    public BatchcreateDtxAppRequest setActionArray(java.util.List<BatchcreateDtxAppRequestActionArray> actionArray) {
        this.actionArray = actionArray;
        return this;
    }
    public java.util.List<BatchcreateDtxAppRequestActionArray> getActionArray() {
        return this.actionArray;
    }

    public BatchcreateDtxAppRequest setRecoveryArray(java.util.List<BatchcreateDtxAppRequestRecoveryArray> recoveryArray) {
        this.recoveryArray = recoveryArray;
        return this;
    }
    public java.util.List<BatchcreateDtxAppRequestRecoveryArray> getRecoveryArray() {
        return this.recoveryArray;
    }

    public BatchcreateDtxAppRequest setRecoveryDsArray(java.util.List<BatchcreateDtxAppRequestRecoveryDsArray> recoveryDsArray) {
        this.recoveryDsArray = recoveryDsArray;
        return this;
    }
    public java.util.List<BatchcreateDtxAppRequestRecoveryDsArray> getRecoveryDsArray() {
        return this.recoveryDsArray;
    }

    public static class BatchcreateDtxAppRequestActionArray extends TeaModel {
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

        public static BatchcreateDtxAppRequestActionArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDtxAppRequestActionArray self = new BatchcreateDtxAppRequestActionArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDtxAppRequestActionArray setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public BatchcreateDtxAppRequestActionArray setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public BatchcreateDtxAppRequestActionArray setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchcreateDtxAppRequestActionArray setElasticKey(String elasticKey) {
            this.elasticKey = elasticKey;
            return this;
        }
        public String getElasticKey() {
            return this.elasticKey;
        }

        public BatchcreateDtxAppRequestActionArray setRollbackMethodName(String rollbackMethodName) {
            this.rollbackMethodName = rollbackMethodName;
            return this;
        }
        public String getRollbackMethodName() {
            return this.rollbackMethodName;
        }

        public BatchcreateDtxAppRequestActionArray setIsZoneRoute(Boolean isZoneRoute) {
            this.isZoneRoute = isZoneRoute;
            return this;
        }
        public Boolean getIsZoneRoute() {
            return this.isZoneRoute;
        }

        public BatchcreateDtxAppRequestActionArray setCommitMethodName(String commitMethodName) {
            this.commitMethodName = commitMethodName;
            return this;
        }
        public String getCommitMethodName() {
            return this.commitMethodName;
        }

        public BatchcreateDtxAppRequestActionArray setTestUrl(String testUrl) {
            this.testUrl = testUrl;
            return this;
        }
        public String getTestUrl() {
            return this.testUrl;
        }

        public BatchcreateDtxAppRequestActionArray setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public BatchcreateDtxAppRequestActionArray setRollbackMethodParamsType(Long rollbackMethodParamsType) {
            this.rollbackMethodParamsType = rollbackMethodParamsType;
            return this;
        }
        public Long getRollbackMethodParamsType() {
            return this.rollbackMethodParamsType;
        }

        public BatchcreateDtxAppRequestActionArray setCommitMethodParamsType(Long commitMethodParamsType) {
            this.commitMethodParamsType = commitMethodParamsType;
            return this;
        }
        public Long getCommitMethodParamsType() {
            return this.commitMethodParamsType;
        }

        public BatchcreateDtxAppRequestActionArray setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public BatchcreateDtxAppRequestActionArray setWsTr(String wsTr) {
            this.wsTr = wsTr;
            return this;
        }
        public String getWsTr() {
            return this.wsTr;
        }

        public BatchcreateDtxAppRequestActionArray setElasticRouteRule(String elasticRouteRule) {
            this.elasticRouteRule = elasticRouteRule;
            return this;
        }
        public String getElasticRouteRule() {
            return this.elasticRouteRule;
        }

        public BatchcreateDtxAppRequestActionArray setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public BatchcreateDtxAppRequestActionArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class BatchcreateDtxAppRequestRecoveryArray extends TeaModel {
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

        public static BatchcreateDtxAppRequestRecoveryArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDtxAppRequestRecoveryArray self = new BatchcreateDtxAppRequestRecoveryArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDtxAppRequestRecoveryArray setIsAsyn(Boolean isAsyn) {
            this.isAsyn = isAsyn;
            return this;
        }
        public Boolean getIsAsyn() {
            return this.isAsyn;
        }

        public BatchcreateDtxAppRequestRecoveryArray setIsLoadTest(Boolean isLoadTest) {
            this.isLoadTest = isLoadTest;
            return this;
        }
        public Boolean getIsLoadTest() {
            return this.isLoadTest;
        }

        public BatchcreateDtxAppRequestRecoveryArray setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BatchcreateDtxAppRequestRecoveryArray setIsMix(Boolean isMix) {
            this.isMix = isMix;
            return this;
        }
        public Boolean getIsMix() {
            return this.isMix;
        }

        public BatchcreateDtxAppRequestRecoveryArray setRecoveryThreadNum(Long recoveryThreadNum) {
            this.recoveryThreadNum = recoveryThreadNum;
            return this;
        }
        public Long getRecoveryThreadNum() {
            return this.recoveryThreadNum;
        }

        public BatchcreateDtxAppRequestRecoveryArray setRecoveryLimit(Long recoveryLimit) {
            this.recoveryLimit = recoveryLimit;
            return this;
        }
        public Long getRecoveryLimit() {
            return this.recoveryLimit;
        }

        public BatchcreateDtxAppRequestRecoveryArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchcreateDtxAppRequestRecoveryArray setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

    }

    public static class BatchcreateDtxAppRequestRecoveryDsArray extends TeaModel {
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

        public static BatchcreateDtxAppRequestRecoveryDsArray build(java.util.Map<String, ?> map) throws Exception {
            BatchcreateDtxAppRequestRecoveryDsArray self = new BatchcreateDtxAppRequestRecoveryDsArray();
            return TeaModel.build(map, self);
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setTaskNameFormat(String taskNameFormat) {
            this.taskNameFormat = taskNameFormat;
            return this;
        }
        public String getTaskNameFormat() {
            return this.taskNameFormat;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setTaskIndexStart(Long taskIndexStart) {
            this.taskIndexStart = taskIndexStart;
            return this;
        }
        public Long getTaskIndexStart() {
            return this.taskIndexStart;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setTaskIndexEnd(Long taskIndexEnd) {
            this.taskIndexEnd = taskIndexEnd;
            return this;
        }
        public Long getTaskIndexEnd() {
            return this.taskIndexEnd;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

        public BatchcreateDtxAppRequestRecoveryDsArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
