// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXBizTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Content")
    public String content;

    @NameInMap("Participators")
    public java.util.List<QueryDTXBizTypeResponseBodyParticipators> participators;

    @NameInMap("AsynInfo")
    public QueryDTXBizTypeResponseBodyAsynInfo asynInfo;

    @NameInMap("Initiator")
    public QueryDTXBizTypeResponseBodyInitiator initiator;

    public static QueryDTXBizTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXBizTypeResponseBody self = new QueryDTXBizTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDTXBizTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDTXBizTypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDTXBizTypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDTXBizTypeResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryDTXBizTypeResponseBody setParticipators(java.util.List<QueryDTXBizTypeResponseBodyParticipators> participators) {
        this.participators = participators;
        return this;
    }
    public java.util.List<QueryDTXBizTypeResponseBodyParticipators> getParticipators() {
        return this.participators;
    }

    public QueryDTXBizTypeResponseBody setAsynInfo(QueryDTXBizTypeResponseBodyAsynInfo asynInfo) {
        this.asynInfo = asynInfo;
        return this;
    }
    public QueryDTXBizTypeResponseBodyAsynInfo getAsynInfo() {
        return this.asynInfo;
    }

    public QueryDTXBizTypeResponseBody setInitiator(QueryDTXBizTypeResponseBodyInitiator initiator) {
        this.initiator = initiator;
        return this;
    }
    public QueryDTXBizTypeResponseBodyInitiator getInitiator() {
        return this.initiator;
    }

    public static class QueryDTXBizTypeResponseBodyParticipators extends TeaModel {
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

        public static QueryDTXBizTypeResponseBodyParticipators build(java.util.Map<String, ?> map) throws Exception {
            QueryDTXBizTypeResponseBodyParticipators self = new QueryDTXBizTypeResponseBodyParticipators();
            return TeaModel.build(map, self);
        }

        public QueryDTXBizTypeResponseBodyParticipators setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public QueryDTXBizTypeResponseBodyParticipators setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryDTXBizTypeResponseBodyParticipators setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public QueryDTXBizTypeResponseBodyParticipators setCommitMethodName(String commitMethodName) {
            this.commitMethodName = commitMethodName;
            return this;
        }
        public String getCommitMethodName() {
            return this.commitMethodName;
        }

        public QueryDTXBizTypeResponseBodyParticipators setCommitMethodParamsType(Long commitMethodParamsType) {
            this.commitMethodParamsType = commitMethodParamsType;
            return this;
        }
        public Long getCommitMethodParamsType() {
            return this.commitMethodParamsType;
        }

        public QueryDTXBizTypeResponseBodyParticipators setElasticKey(String elasticKey) {
            this.elasticKey = elasticKey;
            return this;
        }
        public String getElasticKey() {
            return this.elasticKey;
        }

        public QueryDTXBizTypeResponseBodyParticipators setElasticRouteRule(String elasticRouteRule) {
            this.elasticRouteRule = elasticRouteRule;
            return this;
        }
        public String getElasticRouteRule() {
            return this.elasticRouteRule;
        }

        public QueryDTXBizTypeResponseBodyParticipators setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDTXBizTypeResponseBodyParticipators setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryDTXBizTypeResponseBodyParticipators setIsZoneRoute(Boolean isZoneRoute) {
            this.isZoneRoute = isZoneRoute;
            return this;
        }
        public Boolean getIsZoneRoute() {
            return this.isZoneRoute;
        }

        public QueryDTXBizTypeResponseBodyParticipators setRollbackMethodName(String rollbackMethodName) {
            this.rollbackMethodName = rollbackMethodName;
            return this;
        }
        public String getRollbackMethodName() {
            return this.rollbackMethodName;
        }

        public QueryDTXBizTypeResponseBodyParticipators setRollbackMethodParamsType(Long rollbackMethodParamsType) {
            this.rollbackMethodParamsType = rollbackMethodParamsType;
            return this;
        }
        public Long getRollbackMethodParamsType() {
            return this.rollbackMethodParamsType;
        }

        public QueryDTXBizTypeResponseBodyParticipators setTestUrl(String testUrl) {
            this.testUrl = testUrl;
            return this;
        }
        public String getTestUrl() {
            return this.testUrl;
        }

        public QueryDTXBizTypeResponseBodyParticipators setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public QueryDTXBizTypeResponseBodyParticipators setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public QueryDTXBizTypeResponseBodyParticipators setWsTr(String wsTr) {
            this.wsTr = wsTr;
            return this;
        }
        public String getWsTr() {
            return this.wsTr;
        }

    }

    public static class QueryDTXBizTypeResponseBodyAsynInfoSplitRule extends TeaModel {
        @NameInMap("DbSplitRule")
        public Long dbSplitRule;

        @NameInMap("DbSplitTemplate")
        public String dbSplitTemplate;

        @NameInMap("TableSplitRule")
        public Long tableSplitRule;

        @NameInMap("TableSplitTemplate")
        public String tableSplitTemplate;

        public static QueryDTXBizTypeResponseBodyAsynInfoSplitRule build(java.util.Map<String, ?> map) throws Exception {
            QueryDTXBizTypeResponseBodyAsynInfoSplitRule self = new QueryDTXBizTypeResponseBodyAsynInfoSplitRule();
            return TeaModel.build(map, self);
        }

        public QueryDTXBizTypeResponseBodyAsynInfoSplitRule setDbSplitRule(Long dbSplitRule) {
            this.dbSplitRule = dbSplitRule;
            return this;
        }
        public Long getDbSplitRule() {
            return this.dbSplitRule;
        }

        public QueryDTXBizTypeResponseBodyAsynInfoSplitRule setDbSplitTemplate(String dbSplitTemplate) {
            this.dbSplitTemplate = dbSplitTemplate;
            return this;
        }
        public String getDbSplitTemplate() {
            return this.dbSplitTemplate;
        }

        public QueryDTXBizTypeResponseBodyAsynInfoSplitRule setTableSplitRule(Long tableSplitRule) {
            this.tableSplitRule = tableSplitRule;
            return this;
        }
        public Long getTableSplitRule() {
            return this.tableSplitRule;
        }

        public QueryDTXBizTypeResponseBodyAsynInfoSplitRule setTableSplitTemplate(String tableSplitTemplate) {
            this.tableSplitTemplate = tableSplitTemplate;
            return this;
        }
        public String getTableSplitTemplate() {
            return this.tableSplitTemplate;
        }

    }

    public static class QueryDTXBizTypeResponseBodyAsynInfo extends TeaModel {
        @NameInMap("ActionMode")
        public Long actionMode;

        @NameInMap("ActivityMode")
        public Long activityMode;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Role")
        public Long role;

        @NameInMap("SplitRule")
        public QueryDTXBizTypeResponseBodyAsynInfoSplitRule splitRule;

        public static QueryDTXBizTypeResponseBodyAsynInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDTXBizTypeResponseBodyAsynInfo self = new QueryDTXBizTypeResponseBodyAsynInfo();
            return TeaModel.build(map, self);
        }

        public QueryDTXBizTypeResponseBodyAsynInfo setActionMode(Long actionMode) {
            this.actionMode = actionMode;
            return this;
        }
        public Long getActionMode() {
            return this.actionMode;
        }

        public QueryDTXBizTypeResponseBodyAsynInfo setActivityMode(Long activityMode) {
            this.activityMode = activityMode;
            return this;
        }
        public Long getActivityMode() {
            return this.activityMode;
        }

        public QueryDTXBizTypeResponseBodyAsynInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryDTXBizTypeResponseBodyAsynInfo setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryDTXBizTypeResponseBodyAsynInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryDTXBizTypeResponseBodyAsynInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryDTXBizTypeResponseBodyAsynInfo setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public QueryDTXBizTypeResponseBodyAsynInfo setSplitRule(QueryDTXBizTypeResponseBodyAsynInfoSplitRule splitRule) {
            this.splitRule = splitRule;
            return this;
        }
        public QueryDTXBizTypeResponseBodyAsynInfoSplitRule getSplitRule() {
            return this.splitRule;
        }

    }

    public static class QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources extends TeaModel {
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

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsLdc")
        public Boolean isLdc;

        @NameInMap("IsLocalDs")
        public Boolean isLocalDs;

        @NameInMap("Zone")
        public String zone;

        public static QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources build(java.util.Map<String, ?> map) throws Exception {
            QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources self = new QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources();
            return TeaModel.build(map, self);
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QueryDTXBizTypeResponseBodyInitiator extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsAsyn")
        public Boolean isAsyn;

        @NameInMap("IsLoadTest")
        public Boolean isLoadTest;

        @NameInMap("IsMix")
        public Boolean isMix;

        @NameInMap("RecoveryLimit")
        public Long recoveryLimit;

        @NameInMap("RecoveryThreadNum")
        public Long recoveryThreadNum;

        @NameInMap("RecoveryDatasources")
        public java.util.List<QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources> recoveryDatasources;

        public static QueryDTXBizTypeResponseBodyInitiator build(java.util.Map<String, ?> map) throws Exception {
            QueryDTXBizTypeResponseBodyInitiator self = new QueryDTXBizTypeResponseBodyInitiator();
            return TeaModel.build(map, self);
        }

        public QueryDTXBizTypeResponseBodyInitiator setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryDTXBizTypeResponseBodyInitiator setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public QueryDTXBizTypeResponseBodyInitiator setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDTXBizTypeResponseBodyInitiator setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryDTXBizTypeResponseBodyInitiator setIsAsyn(Boolean isAsyn) {
            this.isAsyn = isAsyn;
            return this;
        }
        public Boolean getIsAsyn() {
            return this.isAsyn;
        }

        public QueryDTXBizTypeResponseBodyInitiator setIsLoadTest(Boolean isLoadTest) {
            this.isLoadTest = isLoadTest;
            return this;
        }
        public Boolean getIsLoadTest() {
            return this.isLoadTest;
        }

        public QueryDTXBizTypeResponseBodyInitiator setIsMix(Boolean isMix) {
            this.isMix = isMix;
            return this;
        }
        public Boolean getIsMix() {
            return this.isMix;
        }

        public QueryDTXBizTypeResponseBodyInitiator setRecoveryLimit(Long recoveryLimit) {
            this.recoveryLimit = recoveryLimit;
            return this;
        }
        public Long getRecoveryLimit() {
            return this.recoveryLimit;
        }

        public QueryDTXBizTypeResponseBodyInitiator setRecoveryThreadNum(Long recoveryThreadNum) {
            this.recoveryThreadNum = recoveryThreadNum;
            return this;
        }
        public Long getRecoveryThreadNum() {
            return this.recoveryThreadNum;
        }

        public QueryDTXBizTypeResponseBodyInitiator setRecoveryDatasources(java.util.List<QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources> recoveryDatasources) {
            this.recoveryDatasources = recoveryDatasources;
            return this;
        }
        public java.util.List<QueryDTXBizTypeResponseBodyInitiatorRecoveryDatasources> getRecoveryDatasources() {
            return this.recoveryDatasources;
        }

    }

}
