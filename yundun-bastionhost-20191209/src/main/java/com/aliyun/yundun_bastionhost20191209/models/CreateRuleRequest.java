// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Databases")
    public java.util.List<CreateRuleRequestDatabases> databases;

    @NameInMap("EffectiveEndTime")
    public Long effectiveEndTime;

    @NameInMap("EffectiveStartTime")
    public Long effectiveStartTime;

    @NameInMap("HostGroups")
    public java.util.List<CreateRuleRequestHostGroups> hostGroups;

    @NameInMap("Hosts")
    public java.util.List<CreateRuleRequestHosts> hosts;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static CreateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleRequest self = new CreateRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateRuleRequest setDatabases(java.util.List<CreateRuleRequestDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<CreateRuleRequestDatabases> getDatabases() {
        return this.databases;
    }

    public CreateRuleRequest setEffectiveEndTime(Long effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public Long getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    public CreateRuleRequest setEffectiveStartTime(Long effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public Long getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public CreateRuleRequest setHostGroups(java.util.List<CreateRuleRequestHostGroups> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public java.util.List<CreateRuleRequestHostGroups> getHostGroups() {
        return this.hostGroups;
    }

    public CreateRuleRequest setHosts(java.util.List<CreateRuleRequestHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<CreateRuleRequestHosts> getHosts() {
        return this.hosts;
    }

    public CreateRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateRuleRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateRuleRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public static class CreateRuleRequestDatabases extends TeaModel {
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        @NameInMap("DatabaseId")
        public String databaseId;

        public static CreateRuleRequestDatabases build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestDatabases self = new CreateRuleRequestDatabases();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestDatabases setDatabaseAccountIds(java.util.List<String> databaseAccountIds) {
            this.databaseAccountIds = databaseAccountIds;
            return this;
        }
        public java.util.List<String> getDatabaseAccountIds() {
            return this.databaseAccountIds;
        }

        public CreateRuleRequestDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

    }

    public static class CreateRuleRequestHostGroups extends TeaModel {
        @NameInMap("HostAccountNames")
        public java.util.List<String> hostAccountNames;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        public static CreateRuleRequestHostGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestHostGroups self = new CreateRuleRequestHostGroups();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestHostGroups setHostAccountNames(java.util.List<String> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }
        public java.util.List<String> getHostAccountNames() {
            return this.hostAccountNames;
        }

        public CreateRuleRequestHostGroups setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

    }

    public static class CreateRuleRequestHosts extends TeaModel {
        @NameInMap("HostAccountIds")
        public java.util.List<String> hostAccountIds;

        @NameInMap("HostId")
        public String hostId;

        public static CreateRuleRequestHosts build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestHosts self = new CreateRuleRequestHosts();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestHosts setHostAccountIds(java.util.List<String> hostAccountIds) {
            this.hostAccountIds = hostAccountIds;
            return this;
        }
        public java.util.List<String> getHostAccountIds() {
            return this.hostAccountIds;
        }

        public CreateRuleRequestHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
