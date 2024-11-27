// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    /**
     * <p>The remarks of the authorization rule. The remarks can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The information about the database that runs on your server.</p>
     */
    @NameInMap("Databases")
    public java.util.List<CreateRuleRequestDatabases> databases;

    /**
     * <p>The end time of the validity period of the authorization rule. Specify a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1672502400</p>
     */
    @NameInMap("EffectiveEndTime")
    public Long effectiveEndTime;

    /**
     * <p>The start time of the validity period of the authorization rule. Specify a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1669630029</p>
     */
    @NameInMap("EffectiveStartTime")
    public Long effectiveStartTime;

    /**
     * <p>The information about the asset group that you want to authorize to manage.</p>
     */
    @NameInMap("HostGroups")
    public java.util.List<CreateRuleRequestHostGroups> hostGroups;

    /**
     * <p>The host information.</p>
     */
    @NameInMap("Hosts")
    public java.util.List<CreateRuleRequestHosts> hosts;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-5yd2ymfsa0e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host.</p>
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
     * <p>The name of the authorization rule. The name can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>An array that consists of user group IDs.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>An array that consists of user IDs.</p>
     */
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
        /**
         * <p>An array that consists of database account IDs.</p>
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
        /**
         * <p>An array that consists of asset account names.</p>
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
        /**
         * <p>An array that consists of host account IDs.</p>
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
