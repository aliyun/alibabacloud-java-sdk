// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyAssetScopeRequest extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<SetPolicyAssetScopeRequestDatabases> databases;

    @NameInMap("HostGroups")
    public java.util.List<SetPolicyAssetScopeRequestHostGroups> hostGroups;

    @NameInMap("Hosts")
    public java.util.List<SetPolicyAssetScopeRequestHosts> hosts;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("AccountScopeType")
        public String accountScopeType;

        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

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
        @NameInMap("AccountNames")
        public java.util.List<String> accountNames;

        @NameInMap("AccountScopeType")
        public String accountScopeType;

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
        @NameInMap("AccountScopeType")
        public String accountScopeType;

        @NameInMap("HostAccountIds")
        public java.util.List<String> hostAccountIds;

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
