// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetPolicyAssetScopeResponseBody extends TeaModel {
    /**
     * <p>The assets to which the control policy applies.</p>
     */
    @NameInMap("AssetScope")
    public GetPolicyAssetScopeResponseBodyAssetScope assetScope;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPolicyAssetScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyAssetScopeResponseBody self = new GetPolicyAssetScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyAssetScopeResponseBody setAssetScope(GetPolicyAssetScopeResponseBodyAssetScope assetScope) {
        this.assetScope = assetScope;
        return this;
    }
    public GetPolicyAssetScopeResponseBodyAssetScope getAssetScope() {
        return this.assetScope;
    }

    public GetPolicyAssetScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPolicyAssetScopeResponseBodyAssetScopeDatabases extends TeaModel {
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
         * <p>The IDs of database accounts to which the control policy applies.</p>
         */
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        public static GetPolicyAssetScopeResponseBodyAssetScopeDatabases build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyAssetScopeResponseBodyAssetScopeDatabases self = new GetPolicyAssetScopeResponseBodyAssetScopeDatabases();
            return TeaModel.build(map, self);
        }

        public GetPolicyAssetScopeResponseBodyAssetScopeDatabases setAccountScopeType(String accountScopeType) {
            this.accountScopeType = accountScopeType;
            return this;
        }
        public String getAccountScopeType() {
            return this.accountScopeType;
        }

        public GetPolicyAssetScopeResponseBodyAssetScopeDatabases setDatabaseAccountIds(java.util.List<String> databaseAccountIds) {
            this.databaseAccountIds = databaseAccountIds;
            return this;
        }
        public java.util.List<String> getDatabaseAccountIds() {
            return this.databaseAccountIds;
        }

        public GetPolicyAssetScopeResponseBodyAssetScopeDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

    }

    public static class GetPolicyAssetScopeResponseBodyAssetScopeHostGroups extends TeaModel {
        /**
         * <p>The asset accounts to which the control policy applies.</p>
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
         * <p>4</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        public static GetPolicyAssetScopeResponseBodyAssetScopeHostGroups build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyAssetScopeResponseBodyAssetScopeHostGroups self = new GetPolicyAssetScopeResponseBodyAssetScopeHostGroups();
            return TeaModel.build(map, self);
        }

        public GetPolicyAssetScopeResponseBodyAssetScopeHostGroups setAccountNames(java.util.List<String> accountNames) {
            this.accountNames = accountNames;
            return this;
        }
        public java.util.List<String> getAccountNames() {
            return this.accountNames;
        }

        public GetPolicyAssetScopeResponseBodyAssetScopeHostGroups setAccountScopeType(String accountScopeType) {
            this.accountScopeType = accountScopeType;
            return this;
        }
        public String getAccountScopeType() {
            return this.accountScopeType;
        }

        public GetPolicyAssetScopeResponseBodyAssetScopeHostGroups setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

    }

    public static class GetPolicyAssetScopeResponseBodyAssetScopeHosts extends TeaModel {
        /**
         * <p>The scope of host accounts to which the control policy applies. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: The control policy applies to all accounts of the host.</li>
         * <li><strong>AccountId</strong>: The control policy applies to specified accounts of the host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("AccountScopeType")
        public String accountScopeType;

        /**
         * <p>The host accounts to which the control policy applies.</p>
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

        public static GetPolicyAssetScopeResponseBodyAssetScopeHosts build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyAssetScopeResponseBodyAssetScopeHosts self = new GetPolicyAssetScopeResponseBodyAssetScopeHosts();
            return TeaModel.build(map, self);
        }

        public GetPolicyAssetScopeResponseBodyAssetScopeHosts setAccountScopeType(String accountScopeType) {
            this.accountScopeType = accountScopeType;
            return this;
        }
        public String getAccountScopeType() {
            return this.accountScopeType;
        }

        public GetPolicyAssetScopeResponseBodyAssetScopeHosts setHostAccountIds(java.util.List<String> hostAccountIds) {
            this.hostAccountIds = hostAccountIds;
            return this;
        }
        public java.util.List<String> getHostAccountIds() {
            return this.hostAccountIds;
        }

        public GetPolicyAssetScopeResponseBodyAssetScopeHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

    public static class GetPolicyAssetScopeResponseBodyAssetScope extends TeaModel {
        /**
         * <p>The databases and database accounts to which the control policy applies.</p>
         */
        @NameInMap("Databases")
        public java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeDatabases> databases;

        /**
         * <p>The asset groups and asset accounts to which the control policy applies.</p>
         */
        @NameInMap("HostGroups")
        public java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeHostGroups> hostGroups;

        /**
         * <p>The hosts and host accounts to which the control policy applies.</p>
         */
        @NameInMap("Hosts")
        public java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeHosts> hosts;

        /**
         * <p>The scope of assets to which the control policy applies.</p>
         * <ul>
         * <li><p>If <strong>All</strong> is returned for this parameter, the control policy applies to all assets.</p>
         * </li>
         * <li><p>If no value is returned for this parameter, the control policy applies to the assets specified in the return values of Databases, HostGroups, and Hosts.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        public static GetPolicyAssetScopeResponseBodyAssetScope build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyAssetScopeResponseBodyAssetScope self = new GetPolicyAssetScopeResponseBodyAssetScope();
            return TeaModel.build(map, self);
        }

        public GetPolicyAssetScopeResponseBodyAssetScope setDatabases(java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeDatabases> getDatabases() {
            return this.databases;
        }

        public GetPolicyAssetScopeResponseBodyAssetScope setHostGroups(java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeHostGroups> hostGroups) {
            this.hostGroups = hostGroups;
            return this;
        }
        public java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeHostGroups> getHostGroups() {
            return this.hostGroups;
        }

        public GetPolicyAssetScopeResponseBodyAssetScope setHosts(java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeHosts> getHosts() {
            return this.hosts;
        }

        public GetPolicyAssetScopeResponseBodyAssetScope setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

    }

}
