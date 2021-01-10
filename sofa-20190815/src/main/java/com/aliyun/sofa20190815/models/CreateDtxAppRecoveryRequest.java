// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDtxAppRecoveryRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RecoveryJsonStr")
    public String recoveryJsonStr;

    @NameInMap("RecoveryDsArray")
    public java.util.List<CreateDtxAppRecoveryRequestRecoveryDsArray> recoveryDsArray;

    public static CreateDtxAppRecoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDtxAppRecoveryRequest self = new CreateDtxAppRecoveryRequest();
        return TeaModel.build(map, self);
    }

    public CreateDtxAppRecoveryRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDtxAppRecoveryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDtxAppRecoveryRequest setRecoveryJsonStr(String recoveryJsonStr) {
        this.recoveryJsonStr = recoveryJsonStr;
        return this;
    }
    public String getRecoveryJsonStr() {
        return this.recoveryJsonStr;
    }

    public CreateDtxAppRecoveryRequest setRecoveryDsArray(java.util.List<CreateDtxAppRecoveryRequestRecoveryDsArray> recoveryDsArray) {
        this.recoveryDsArray = recoveryDsArray;
        return this;
    }
    public java.util.List<CreateDtxAppRecoveryRequestRecoveryDsArray> getRecoveryDsArray() {
        return this.recoveryDsArray;
    }

    public static class CreateDtxAppRecoveryRequestRecoveryDsArray extends TeaModel {
        @NameInMap("IsLdc")
        public Boolean isLdc;

        @NameInMap("DsIndexEnd")
        public Long dsIndexEnd;

        @NameInMap("ActionTableNameFormat")
        public String actionTableNameFormat;

        @NameInMap("IsLocalDs")
        public Boolean isLocalDs;

        @NameInMap("ActionTableIndexEnd")
        public Long actionTableIndexEnd;

        @NameInMap("DbConnectMin")
        public Long dbConnectMin;

        @NameInMap("GroupId")
        public String groupId;

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

        public static CreateDtxAppRecoveryRequestRecoveryDsArray build(java.util.Map<String, ?> map) throws Exception {
            CreateDtxAppRecoveryRequestRecoveryDsArray self = new CreateDtxAppRecoveryRequestRecoveryDsArray();
            return TeaModel.build(map, self);
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

        public CreateDtxAppRecoveryRequestRecoveryDsArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
