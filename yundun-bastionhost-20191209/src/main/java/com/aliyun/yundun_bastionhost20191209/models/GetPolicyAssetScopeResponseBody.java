// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetPolicyAssetScopeResponseBody extends TeaModel {
    @NameInMap("AssetScope")
    public GetPolicyAssetScopeResponseBodyAssetScope assetScope;

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
        @NameInMap("AccountScopeType")
        public String accountScopeType;

        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

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
        @NameInMap("AccountNames")
        public java.util.List<String> accountNames;

        @NameInMap("AccountScopeType")
        public String accountScopeType;

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
        @NameInMap("AccountScopeType")
        public String accountScopeType;

        @NameInMap("HostAccountIds")
        public java.util.List<String> hostAccountIds;

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
        @NameInMap("Databases")
        public java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeDatabases> databases;

        @NameInMap("HostGroups")
        public java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeHostGroups> hostGroups;

        @NameInMap("Hosts")
        public java.util.List<GetPolicyAssetScopeResponseBodyAssetScopeHosts> hosts;

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
