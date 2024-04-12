// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyRuleRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Databases")
    public java.util.List<ModifyRuleRequestDatabases> databases;

    @NameInMap("EffectiveEndTime")
    public Long effectiveEndTime;

    @NameInMap("EffectiveStartTime")
    public Long effectiveStartTime;

    @NameInMap("HostGroups")
    public java.util.List<ModifyRuleRequestHostGroups> hostGroups;

    @NameInMap("Hosts")
    public java.util.List<ModifyRuleRequestHosts> hosts;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static ModifyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleRequest self = new ModifyRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRuleRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyRuleRequest setDatabases(java.util.List<ModifyRuleRequestDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<ModifyRuleRequestDatabases> getDatabases() {
        return this.databases;
    }

    public ModifyRuleRequest setEffectiveEndTime(Long effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public Long getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    public ModifyRuleRequest setEffectiveStartTime(Long effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public Long getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public ModifyRuleRequest setHostGroups(java.util.List<ModifyRuleRequestHostGroups> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public java.util.List<ModifyRuleRequestHostGroups> getHostGroups() {
        return this.hostGroups;
    }

    public ModifyRuleRequest setHosts(java.util.List<ModifyRuleRequestHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<ModifyRuleRequestHosts> getHosts() {
        return this.hosts;
    }

    public ModifyRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ModifyRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyRuleRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public ModifyRuleRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public static class ModifyRuleRequestDatabases extends TeaModel {
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        @NameInMap("DatabaseId")
        public String databaseId;

        public static ModifyRuleRequestDatabases build(java.util.Map<String, ?> map) throws Exception {
            ModifyRuleRequestDatabases self = new ModifyRuleRequestDatabases();
            return TeaModel.build(map, self);
        }

        public ModifyRuleRequestDatabases setDatabaseAccountIds(java.util.List<String> databaseAccountIds) {
            this.databaseAccountIds = databaseAccountIds;
            return this;
        }
        public java.util.List<String> getDatabaseAccountIds() {
            return this.databaseAccountIds;
        }

        public ModifyRuleRequestDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

    }

    public static class ModifyRuleRequestHostGroups extends TeaModel {
        @NameInMap("HostAccountNames")
        public java.util.List<String> hostAccountNames;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        public static ModifyRuleRequestHostGroups build(java.util.Map<String, ?> map) throws Exception {
            ModifyRuleRequestHostGroups self = new ModifyRuleRequestHostGroups();
            return TeaModel.build(map, self);
        }

        public ModifyRuleRequestHostGroups setHostAccountNames(java.util.List<String> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }
        public java.util.List<String> getHostAccountNames() {
            return this.hostAccountNames;
        }

        public ModifyRuleRequestHostGroups setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

    }

    public static class ModifyRuleRequestHosts extends TeaModel {
        @NameInMap("HostAccountIds")
        public java.util.List<String> hostAccountIds;

        @NameInMap("HostId")
        public String hostId;

        public static ModifyRuleRequestHosts build(java.util.Map<String, ?> map) throws Exception {
            ModifyRuleRequestHosts self = new ModifyRuleRequestHosts();
            return TeaModel.build(map, self);
        }

        public ModifyRuleRequestHosts setHostAccountIds(java.util.List<String> hostAccountIds) {
            this.hostAccountIds = hostAccountIds;
            return this;
        }
        public java.util.List<String> getHostAccountIds() {
            return this.hostAccountIds;
        }

        public ModifyRuleRequestHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
