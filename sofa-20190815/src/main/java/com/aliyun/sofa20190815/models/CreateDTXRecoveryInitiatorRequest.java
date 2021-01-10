// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXRecoveryInitiatorRequest extends TeaModel {
    @NameInMap("ActionMode")
    public Long actionMode;

    @NameInMap("ActivityMode")
    public Long activityMode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("Desc")
    public String desc;

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

    @NameInMap("SplitMode")
    public String splitMode;

    @NameInMap("SplitRuleJsonStr")
    public String splitRuleJsonStr;

    @NameInMap("RecoveryDatasources")
    public java.util.List<CreateDTXRecoveryInitiatorRequestRecoveryDatasources> recoveryDatasources;

    public static CreateDTXRecoveryInitiatorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXRecoveryInitiatorRequest self = new CreateDTXRecoveryInitiatorRequest();
        return TeaModel.build(map, self);
    }

    public CreateDTXRecoveryInitiatorRequest setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

    public CreateDTXRecoveryInitiatorRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public CreateDTXRecoveryInitiatorRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDTXRecoveryInitiatorRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateDTXRecoveryInitiatorRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public CreateDTXRecoveryInitiatorRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDTXRecoveryInitiatorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDTXRecoveryInitiatorRequest setIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
        return this;
    }
    public Boolean getIsAsyn() {
        return this.isAsyn;
    }

    public CreateDTXRecoveryInitiatorRequest setIsLoadTest(Boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Boolean getIsLoadTest() {
        return this.isLoadTest;
    }

    public CreateDTXRecoveryInitiatorRequest setIsMix(Boolean isMix) {
        this.isMix = isMix;
        return this;
    }
    public Boolean getIsMix() {
        return this.isMix;
    }

    public CreateDTXRecoveryInitiatorRequest setRecoveryLimit(Long recoveryLimit) {
        this.recoveryLimit = recoveryLimit;
        return this;
    }
    public Long getRecoveryLimit() {
        return this.recoveryLimit;
    }

    public CreateDTXRecoveryInitiatorRequest setRecoveryThreadNum(Long recoveryThreadNum) {
        this.recoveryThreadNum = recoveryThreadNum;
        return this;
    }
    public Long getRecoveryThreadNum() {
        return this.recoveryThreadNum;
    }

    public CreateDTXRecoveryInitiatorRequest setSplitMode(String splitMode) {
        this.splitMode = splitMode;
        return this;
    }
    public String getSplitMode() {
        return this.splitMode;
    }

    public CreateDTXRecoveryInitiatorRequest setSplitRuleJsonStr(String splitRuleJsonStr) {
        this.splitRuleJsonStr = splitRuleJsonStr;
        return this;
    }
    public String getSplitRuleJsonStr() {
        return this.splitRuleJsonStr;
    }

    public CreateDTXRecoveryInitiatorRequest setRecoveryDatasources(java.util.List<CreateDTXRecoveryInitiatorRequestRecoveryDatasources> recoveryDatasources) {
        this.recoveryDatasources = recoveryDatasources;
        return this;
    }
    public java.util.List<CreateDTXRecoveryInitiatorRequestRecoveryDatasources> getRecoveryDatasources() {
        return this.recoveryDatasources;
    }

    public static class CreateDTXRecoveryInitiatorRequestRecoveryDatasources extends TeaModel {
        @NameInMap("IsLdc")
        public Boolean isLdc;

        @NameInMap("DsIndexEnd")
        public Long dsIndexEnd;

        @NameInMap("ActionTableNameFormat")
        public String actionTableNameFormat;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsLocalDs")
        public Boolean isLocalDs;

        @NameInMap("ActionTableIndexEnd")
        public Long actionTableIndexEnd;

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

        public static CreateDTXRecoveryInitiatorRequestRecoveryDatasources build(java.util.Map<String, ?> map) throws Exception {
            CreateDTXRecoveryInitiatorRequestRecoveryDatasources self = new CreateDTXRecoveryInitiatorRequestRecoveryDatasources();
            return TeaModel.build(map, self);
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

        public CreateDTXRecoveryInitiatorRequestRecoveryDatasources setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
