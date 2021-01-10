// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXAppsRecoveryRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RecoveryJsonStr")
    public String recoveryJsonStr;

    @NameInMap("RecoveryDsArray")
    public java.util.List<CreateDTXAppsRecoveryRequestRecoveryDsArray> recoveryDsArray;

    public static CreateDTXAppsRecoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXAppsRecoveryRequest self = new CreateDTXAppsRecoveryRequest();
        return TeaModel.build(map, self);
    }

    public CreateDTXAppsRecoveryRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDTXAppsRecoveryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDTXAppsRecoveryRequest setRecoveryJsonStr(String recoveryJsonStr) {
        this.recoveryJsonStr = recoveryJsonStr;
        return this;
    }
    public String getRecoveryJsonStr() {
        return this.recoveryJsonStr;
    }

    public CreateDTXAppsRecoveryRequest setRecoveryDsArray(java.util.List<CreateDTXAppsRecoveryRequestRecoveryDsArray> recoveryDsArray) {
        this.recoveryDsArray = recoveryDsArray;
        return this;
    }
    public java.util.List<CreateDTXAppsRecoveryRequestRecoveryDsArray> getRecoveryDsArray() {
        return this.recoveryDsArray;
    }

    public static class CreateDTXAppsRecoveryRequestRecoveryDsArray extends TeaModel {
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

        public static CreateDTXAppsRecoveryRequestRecoveryDsArray build(java.util.Map<String, ?> map) throws Exception {
            CreateDTXAppsRecoveryRequestRecoveryDsArray self = new CreateDTXAppsRecoveryRequestRecoveryDsArray();
            return TeaModel.build(map, self);
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setTaskNameFormat(String taskNameFormat) {
            this.taskNameFormat = taskNameFormat;
            return this;
        }
        public String getTaskNameFormat() {
            return this.taskNameFormat;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setIsLdc(Boolean isLdc) {
            this.isLdc = isLdc;
            return this;
        }
        public Boolean getIsLdc() {
            return this.isLdc;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setDsIndexEnd(Long dsIndexEnd) {
            this.dsIndexEnd = dsIndexEnd;
            return this;
        }
        public Long getDsIndexEnd() {
            return this.dsIndexEnd;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setActionTableNameFormat(String actionTableNameFormat) {
            this.actionTableNameFormat = actionTableNameFormat;
            return this;
        }
        public String getActionTableNameFormat() {
            return this.actionTableNameFormat;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setTaskIndexStart(Long taskIndexStart) {
            this.taskIndexStart = taskIndexStart;
            return this;
        }
        public Long getTaskIndexStart() {
            return this.taskIndexStart;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setIsLocalDs(Boolean isLocalDs) {
            this.isLocalDs = isLocalDs;
            return this;
        }
        public Boolean getIsLocalDs() {
            return this.isLocalDs;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setTaskIndexEnd(Long taskIndexEnd) {
            this.taskIndexEnd = taskIndexEnd;
            return this;
        }
        public Long getTaskIndexEnd() {
            return this.taskIndexEnd;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setActionTableIndexEnd(Long actionTableIndexEnd) {
            this.actionTableIndexEnd = actionTableIndexEnd;
            return this;
        }
        public Long getActionTableIndexEnd() {
            return this.actionTableIndexEnd;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setDbConnectMin(Long dbConnectMin) {
            this.dbConnectMin = dbConnectMin;
            return this;
        }
        public Long getDbConnectMin() {
            return this.dbConnectMin;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setDbType(Long dbType) {
            this.dbType = dbType;
            return this;
        }
        public Long getDbType() {
            return this.dbType;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setDsIndexStart(Long dsIndexStart) {
            this.dsIndexStart = dsIndexStart;
            return this;
        }
        public Long getDsIndexStart() {
            return this.dsIndexStart;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setDbConnMax(Long dbConnMax) {
            this.dbConnMax = dbConnMax;
            return this;
        }
        public Long getDbConnMax() {
            return this.dbConnMax;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setDsNameFormat(String dsNameFormat) {
            this.dsNameFormat = dsNameFormat;
            return this;
        }
        public String getDsNameFormat() {
            return this.dsNameFormat;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setActionTableIndexStart(Long actionTableIndexStart) {
            this.actionTableIndexStart = actionTableIndexStart;
            return this;
        }
        public Long getActionTableIndexStart() {
            return this.actionTableIndexStart;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setActivityTableIndexEnd(Long activityTableIndexEnd) {
            this.activityTableIndexEnd = activityTableIndexEnd;
            return this;
        }
        public Long getActivityTableIndexEnd() {
            return this.activityTableIndexEnd;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setActivityTableNameFormat(String activityTableNameFormat) {
            this.activityTableNameFormat = activityTableNameFormat;
            return this;
        }
        public String getActivityTableNameFormat() {
            return this.activityTableNameFormat;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setActivityTableIndexStart(Long activityTableIndexStart) {
            this.activityTableIndexStart = activityTableIndexStart;
            return this;
        }
        public Long getActivityTableIndexStart() {
            return this.activityTableIndexStart;
        }

        public CreateDTXAppsRecoveryRequestRecoveryDsArray setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
