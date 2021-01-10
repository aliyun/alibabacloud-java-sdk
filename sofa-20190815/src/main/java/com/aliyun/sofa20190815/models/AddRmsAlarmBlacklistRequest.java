// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddRmsAlarmBlacklistRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("Data")
    public java.util.List<AddRmsAlarmBlacklistRequestData> data;

    public static AddRmsAlarmBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRmsAlarmBlacklistRequest self = new AddRmsAlarmBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public AddRmsAlarmBlacklistRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public AddRmsAlarmBlacklistRequest setData(java.util.List<AddRmsAlarmBlacklistRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddRmsAlarmBlacklistRequestData> getData() {
        return this.data;
    }

    public static class AddRmsAlarmBlacklistRequestData extends TeaModel {
        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("ApplyTargetId")
        public String applyTargetId;

        @NameInMap("ResId")
        public String resId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("ResName")
        public String resName;

        @NameInMap("ValidStartTime")
        public String validStartTime;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("ResType")
        public String resType;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Id")
        public String id;

        @NameInMap("ValidEndTime")
        public String validEndTime;

        @NameInMap("TenantId")
        public String tenantId;

        public static AddRmsAlarmBlacklistRequestData build(java.util.Map<String, ?> map) throws Exception {
            AddRmsAlarmBlacklistRequestData self = new AddRmsAlarmBlacklistRequestData();
            return TeaModel.build(map, self);
        }

        public AddRmsAlarmBlacklistRequestData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public AddRmsAlarmBlacklistRequestData setApplyTargetId(String applyTargetId) {
            this.applyTargetId = applyTargetId;
            return this;
        }
        public String getApplyTargetId() {
            return this.applyTargetId;
        }

        public AddRmsAlarmBlacklistRequestData setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public AddRmsAlarmBlacklistRequestData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public AddRmsAlarmBlacklistRequestData setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public AddRmsAlarmBlacklistRequestData setResName(String resName) {
            this.resName = resName;
            return this;
        }
        public String getResName() {
            return this.resName;
        }

        public AddRmsAlarmBlacklistRequestData setValidStartTime(String validStartTime) {
            this.validStartTime = validStartTime;
            return this;
        }
        public String getValidStartTime() {
            return this.validStartTime;
        }

        public AddRmsAlarmBlacklistRequestData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public AddRmsAlarmBlacklistRequestData setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public AddRmsAlarmBlacklistRequestData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public AddRmsAlarmBlacklistRequestData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public AddRmsAlarmBlacklistRequestData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddRmsAlarmBlacklistRequestData setValidEndTime(String validEndTime) {
            this.validEndTime = validEndTime;
            return this;
        }
        public String getValidEndTime() {
            return this.validEndTime;
        }

        public AddRmsAlarmBlacklistRequestData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
