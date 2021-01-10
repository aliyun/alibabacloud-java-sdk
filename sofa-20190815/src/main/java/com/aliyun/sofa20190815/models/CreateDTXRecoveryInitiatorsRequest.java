// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXRecoveryInitiatorsRequest extends TeaModel {
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
    public java.util.List<CreateDTXRecoveryInitiatorsRequestRecoveryDatasources> recoveryDatasources;

    public static CreateDTXRecoveryInitiatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXRecoveryInitiatorsRequest self = new CreateDTXRecoveryInitiatorsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDTXRecoveryInitiatorsRequest setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

    public CreateDTXRecoveryInitiatorsRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public CreateDTXRecoveryInitiatorsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDTXRecoveryInitiatorsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateDTXRecoveryInitiatorsRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public CreateDTXRecoveryInitiatorsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDTXRecoveryInitiatorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDTXRecoveryInitiatorsRequest setIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
        return this;
    }
    public Boolean getIsAsyn() {
        return this.isAsyn;
    }

    public CreateDTXRecoveryInitiatorsRequest setIsLoadTest(Boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Boolean getIsLoadTest() {
        return this.isLoadTest;
    }

    public CreateDTXRecoveryInitiatorsRequest setIsMix(Boolean isMix) {
        this.isMix = isMix;
        return this;
    }
    public Boolean getIsMix() {
        return this.isMix;
    }

    public CreateDTXRecoveryInitiatorsRequest setRecoveryLimit(Long recoveryLimit) {
        this.recoveryLimit = recoveryLimit;
        return this;
    }
    public Long getRecoveryLimit() {
        return this.recoveryLimit;
    }

    public CreateDTXRecoveryInitiatorsRequest setRecoveryThreadNum(Long recoveryThreadNum) {
        this.recoveryThreadNum = recoveryThreadNum;
        return this;
    }
    public Long getRecoveryThreadNum() {
        return this.recoveryThreadNum;
    }

    public CreateDTXRecoveryInitiatorsRequest setSplitMode(String splitMode) {
        this.splitMode = splitMode;
        return this;
    }
    public String getSplitMode() {
        return this.splitMode;
    }

    public CreateDTXRecoveryInitiatorsRequest setSplitRuleJsonStr(String splitRuleJsonStr) {
        this.splitRuleJsonStr = splitRuleJsonStr;
        return this;
    }
    public String getSplitRuleJsonStr() {
        return this.splitRuleJsonStr;
    }

    public CreateDTXRecoveryInitiatorsRequest setRecoveryDatasources(java.util.List<CreateDTXRecoveryInitiatorsRequestRecoveryDatasources> recoveryDatasources) {
        this.recoveryDatasources = recoveryDatasources;
        return this;
    }
    public java.util.List<CreateDTXRecoveryInitiatorsRequestRecoveryDatasources> getRecoveryDatasources() {
        return this.recoveryDatasources;
    }

    public static class CreateDTXRecoveryInitiatorsRequestRecoveryDatasources extends TeaModel {
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

        public static CreateDTXRecoveryInitiatorsRequestRecoveryDatasources build(java.util.Map<String, ?> map) throws Exception {
            CreateDTXRecoveryInitiatorsRequestRecoveryDatasources self = new CreateDTXRecoveryInitiatorsRequestRecoveryDatasources();
            return TeaModel.build(map, self);
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

        public CreateDTXRecoveryInitiatorsRequestRecoveryDatasources setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
