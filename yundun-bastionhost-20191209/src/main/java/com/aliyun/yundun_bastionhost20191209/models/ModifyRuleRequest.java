// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyRuleRequest extends TeaModel {
    /**
     * <p>The new remarks for the authorization rule. The remarks can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The new list of database instances and database accounts associated with the authorization rule.</p>
     */
    @NameInMap("Databases")
    public java.util.List<ModifyRuleRequestDatabases> databases;

    /**
     * <p>The new end time of the validity period for the authorization rule. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1672502400</p>
     */
    @NameInMap("EffectiveEndTime")
    public Long effectiveEndTime;

    /**
     * <p>The new start time of the validity period for the authorization rule. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1669630029</p>
     */
    @NameInMap("EffectiveStartTime")
    public Long effectiveStartTime;

    /**
     * <p>The new list of asset groups and accounts associated with the authorization rule.</p>
     */
    @NameInMap("HostGroups")
    public java.util.List<ModifyRuleRequestHostGroups> hostGroups;

    /**
     * <p>The new array of host IDs and host account IDs associated with the authorization rule.</p>
     */
    @NameInMap("Hosts")
    public java.util.List<ModifyRuleRequestHosts> hosts;

    /**
     * <p>The ID of the Bastionhost instance to which the authorization rule to be updated belongs. &gt; You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the value of this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-zmb2y9ydw08</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the Bastionhost instance to which the authorization rule to be updated belongs. &gt; For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the authorization rule to be updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The new name of the authorization rule. The name must be 1 to 128 characters in length and cannot start with a special character. It can contain only periods (.), underscores (_), hyphens (-), single quotation marks (\&quot;), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The new list of user group IDs associated with the authorization rule.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The new list of user IDs associated with the authorization rule.</p>
     */
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

    public ModifyRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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
        /**
         * <p>The list of database account IDs.</p>
         */
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        /**
         * <p>The database instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        /**
         * <p>The list of asset account names.</p>
         */
        @NameInMap("HostAccountNames")
        public java.util.List<String> hostAccountNames;

        /**
         * <p>The asset group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The list of host account IDs.</p>
         */
        @NameInMap("HostAccountIds")
        public java.util.List<String> hostAccountIds;

        /**
         * <p>The host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
