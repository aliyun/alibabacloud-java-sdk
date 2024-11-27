// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyAssetScopeRequest extends TeaModel {
    /**
     * <p>The databases to which the control policy applies.</p>
     * <blockquote>
     * <p> This parameter is required if ScopeType is set to Database. You can specify up to 500 databases.</p>
     * </blockquote>
     */
    @NameInMap("Databases")
    public java.util.List<SetPolicyAssetScopeRequestDatabases> databases;

    /**
     * <p>The asset groups to which the control policy applies.</p>
     * <blockquote>
     * <p>This parameter is required if ScopeType is set to HostGroup. You can specify up to 100 asset groups.</p>
     * </blockquote>
     */
    @NameInMap("HostGroups")
    public java.util.List<SetPolicyAssetScopeRequestHostGroups> hostGroups;

    /**
     * <p>The hosts to which the control policy applies.</p>
     * <blockquote>
     * <p>This parameter is required if ScopeType is set to Host. You can specify up to 500 hosts.</p>
     * </blockquote>
     */
    @NameInMap("Hosts")
    public java.util.List<SetPolicyAssetScopeRequestHosts> hosts;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the control policy that you want to modify.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query the control policy ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

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
     * <p>The scope of assets to which the control policy applies. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: The control policy applies to all assets.</li>
     * <li><strong>Host</strong>: The control policy applies to specified hosts.</li>
     * <li><strong>Database</strong>: The control policy applies to specified databases.</li>
     * <li><strong>HostGroup</strong>: The control policy applies to specified asset groups.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    public static SetPolicyAssetScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyAssetScopeRequest self = new SetPolicyAssetScopeRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyAssetScopeRequest setDatabases(java.util.List<SetPolicyAssetScopeRequestDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<SetPolicyAssetScopeRequestDatabases> getDatabases() {
        return this.databases;
    }

    public SetPolicyAssetScopeRequest setHostGroups(java.util.List<SetPolicyAssetScopeRequestHostGroups> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public java.util.List<SetPolicyAssetScopeRequestHostGroups> getHostGroups() {
        return this.hostGroups;
    }

    public SetPolicyAssetScopeRequest setHosts(java.util.List<SetPolicyAssetScopeRequestHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<SetPolicyAssetScopeRequestHosts> getHosts() {
        return this.hosts;
    }

    public SetPolicyAssetScopeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyAssetScopeRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyAssetScopeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetPolicyAssetScopeRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public static class SetPolicyAssetScopeRequestDatabases extends TeaModel {
        /**
         * <p>The scope of database accounts to which the control policy applies. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: The control policy applies to all database accounts of the database.</li>
         * <li><strong>AccountId</strong>: The control policy applies to specified database accounts of the database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AccountId</p>
         */
        @NameInMap("AccountScopeType")
        public String accountScopeType;

        /**
         * <p>The database accounts to which the control policy applies.</p>
         * <blockquote>
         * <p> This parameter is required if AccountScopeType is set to AccountId.</p>
         * </blockquote>
         */
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        public static SetPolicyAssetScopeRequestDatabases build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyAssetScopeRequestDatabases self = new SetPolicyAssetScopeRequestDatabases();
            return TeaModel.build(map, self);
        }

        public SetPolicyAssetScopeRequestDatabases setAccountScopeType(String accountScopeType) {
            this.accountScopeType = accountScopeType;
            return this;
        }
        public String getAccountScopeType() {
            return this.accountScopeType;
        }

        public SetPolicyAssetScopeRequestDatabases setDatabaseAccountIds(java.util.List<String> databaseAccountIds) {
            this.databaseAccountIds = databaseAccountIds;
            return this;
        }
        public java.util.List<String> getDatabaseAccountIds() {
            return this.databaseAccountIds;
        }

        public SetPolicyAssetScopeRequestDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

    }

    public static class SetPolicyAssetScopeRequestHostGroups extends TeaModel {
        /**
         * <p>The asset accounts to which the control policy applies.</p>
         * <blockquote>
         * <p>This parameter is required if AccountScopeType is set to AccountName.</p>
         * </blockquote>
         */
        @NameInMap("AccountNames")
        public java.util.List<String> accountNames;

        /**
         * <p>The scope of asset accounts to which the control policy applies. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: The control policy applies to all accounts in the asset group.</li>
         * <li><strong>AccountName</strong>: The control policy applies to specified accounts in the asset group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("AccountScopeType")
        public String accountScopeType;

        /**
         * <p>The asset group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        public static SetPolicyAssetScopeRequestHostGroups build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyAssetScopeRequestHostGroups self = new SetPolicyAssetScopeRequestHostGroups();
            return TeaModel.build(map, self);
        }

        public SetPolicyAssetScopeRequestHostGroups setAccountNames(java.util.List<String> accountNames) {
            this.accountNames = accountNames;
            return this;
        }
        public java.util.List<String> getAccountNames() {
            return this.accountNames;
        }

        public SetPolicyAssetScopeRequestHostGroups setAccountScopeType(String accountScopeType) {
            this.accountScopeType = accountScopeType;
            return this;
        }
        public String getAccountScopeType() {
            return this.accountScopeType;
        }

        public SetPolicyAssetScopeRequestHostGroups setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

    }

    public static class SetPolicyAssetScopeRequestHosts extends TeaModel {
        /**
         * <p>The scope of host accounts to which the control policy applies. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: The control policy applies to all accounts of the host.</li>
         * <li><strong>AccountId</strong>: The control policy applies specified accounts of the host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("AccountScopeType")
        public String accountScopeType;

        /**
         * <p>The host accounts to which the control policy applies.</p>
         * <blockquote>
         * <p>This parameter is required if AccountScopeType is set to AccountId.</p>
         * </blockquote>
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

        public static SetPolicyAssetScopeRequestHosts build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyAssetScopeRequestHosts self = new SetPolicyAssetScopeRequestHosts();
            return TeaModel.build(map, self);
        }

        public SetPolicyAssetScopeRequestHosts setAccountScopeType(String accountScopeType) {
            this.accountScopeType = accountScopeType;
            return this;
        }
        public String getAccountScopeType() {
            return this.accountScopeType;
        }

        public SetPolicyAssetScopeRequestHosts setHostAccountIds(java.util.List<String> hostAccountIds) {
            this.hostAccountIds = hostAccountIds;
            return this;
        }
        public java.util.List<String> getHostAccountIds() {
            return this.hostAccountIds;
        }

        public SetPolicyAssetScopeRequestHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
