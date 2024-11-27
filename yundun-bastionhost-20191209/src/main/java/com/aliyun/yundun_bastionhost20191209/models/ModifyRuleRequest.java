// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyRuleRequest extends TeaModel {
    /**
     * <p>The new remarks of the authorization rule. It can be up to 500 characters in length.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The databases and database accounts that a user associated with the modified rule can manage.</p>
     */
    @NameInMap("Databases")
    public java.util.List<ModifyRuleRequestDatabases> databases;

    /**
     * <p>The end time of the new validity period of the authorization rule. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1672502400</p>
     */
    @NameInMap("EffectiveEndTime")
    public Long effectiveEndTime;

    /**
     * <p>The start time of the new validity period of the authorization rule. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1669630029</p>
     */
    @NameInMap("EffectiveStartTime")
    public Long effectiveStartTime;

    /**
     * <p>The asset groups and asset accounts that a user associated with the modified rule can manage.</p>
     */
    @NameInMap("HostGroups")
    public java.util.List<ModifyRuleRequestHostGroups> hostGroups;

    /**
     * <p>An array that consists of the host IDs and host account IDs with which the modified authorization rule is associated.</p>
     */
    @NameInMap("Hosts")
    public java.util.List<ModifyRuleRequestHosts> hosts;

    /**
     * <p>The ID of the bastion host whose authorization rule you want to modify.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-zmb2y9ydw08</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host to which the authorization rule to modify belongs.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the authorization rule to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The new name of the authorization rule. The name must be 1 to 128 characters in length and can contain periods (.), underscores (_), hyphens (-), single quotation marks (\&quot;), and spaces. It cannot start with a special character.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The IDs of the user groups with which the modified authorization rule is associated.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The IDs of the users with whom the modified authorization rule is associated.</p>
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
         * <p>The database account IDs.</p>
         */
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;DatabaseId&quot;: &quot;1&quot;
         *     }
         * ]</p>
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
         * <p>The names of the asset accounts.</p>
         */
        @NameInMap("HostAccountNames")
        public java.util.List<String> hostAccountNames;

        /**
         * <p>The asset group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;HostGroupId&quot;:&quot;1&quot;}]</p>
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
         * <p>The host account IDs.</p>
         */
        @NameInMap("HostAccountIds")
        public java.util.List<String> hostAccountIds;

        /**
         * <p>The host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;HostId&quot;:&quot;1&quot;}]</p>
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
