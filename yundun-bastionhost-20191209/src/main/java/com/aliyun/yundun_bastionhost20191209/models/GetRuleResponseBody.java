// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rule")
    public GetRuleResponseBodyRule rule;

    public static GetRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleResponseBody self = new GetRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleResponseBody setRule(GetRuleResponseBodyRule rule) {
        this.rule = rule;
        return this;
    }
    public GetRuleResponseBodyRule getRule() {
        return this.rule;
    }

    public static class GetRuleResponseBodyRuleDatabasesDatabaseAccounts extends TeaModel {
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        public static GetRuleResponseBodyRuleDatabasesDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyRuleDatabasesDatabaseAccounts self = new GetRuleResponseBodyRuleDatabasesDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyRuleDatabasesDatabaseAccounts setDatabaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

    }

    public static class GetRuleResponseBodyRuleDatabases extends TeaModel {
        @NameInMap("DatabaseAccounts")
        public java.util.List<GetRuleResponseBodyRuleDatabasesDatabaseAccounts> databaseAccounts;

        @NameInMap("DatabaseId")
        public String databaseId;

        public static GetRuleResponseBodyRuleDatabases build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyRuleDatabases self = new GetRuleResponseBodyRuleDatabases();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyRuleDatabases setDatabaseAccounts(java.util.List<GetRuleResponseBodyRuleDatabasesDatabaseAccounts> databaseAccounts) {
            this.databaseAccounts = databaseAccounts;
            return this;
        }
        public java.util.List<GetRuleResponseBodyRuleDatabasesDatabaseAccounts> getDatabaseAccounts() {
            return this.databaseAccounts;
        }

        public GetRuleResponseBodyRuleDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

    }

    public static class GetRuleResponseBodyRuleHostGroups extends TeaModel {
        @NameInMap("HostAccountNames")
        public java.util.List<String> hostAccountNames;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        public static GetRuleResponseBodyRuleHostGroups build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyRuleHostGroups self = new GetRuleResponseBodyRuleHostGroups();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyRuleHostGroups setHostAccountNames(java.util.List<String> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }
        public java.util.List<String> getHostAccountNames() {
            return this.hostAccountNames;
        }

        public GetRuleResponseBodyRuleHostGroups setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

    }

    public static class GetRuleResponseBodyRuleHostsHostAccounts extends TeaModel {
        @NameInMap("HostAccountId")
        public String hostAccountId;

        public static GetRuleResponseBodyRuleHostsHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyRuleHostsHostAccounts self = new GetRuleResponseBodyRuleHostsHostAccounts();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyRuleHostsHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

    }

    public static class GetRuleResponseBodyRuleHosts extends TeaModel {
        @NameInMap("HostAccounts")
        public java.util.List<GetRuleResponseBodyRuleHostsHostAccounts> hostAccounts;

        @NameInMap("HostId")
        public String hostId;

        public static GetRuleResponseBodyRuleHosts build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyRuleHosts self = new GetRuleResponseBodyRuleHosts();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyRuleHosts setHostAccounts(java.util.List<GetRuleResponseBodyRuleHostsHostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }
        public java.util.List<GetRuleResponseBodyRuleHostsHostAccounts> getHostAccounts() {
            return this.hostAccounts;
        }

        public GetRuleResponseBodyRuleHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

    public static class GetRuleResponseBodyRuleUserGroups extends TeaModel {
        @NameInMap("UserGroupId")
        public String userGroupId;

        public static GetRuleResponseBodyRuleUserGroups build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyRuleUserGroups self = new GetRuleResponseBodyRuleUserGroups();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyRuleUserGroups setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

    public static class GetRuleResponseBodyRuleUsers extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        public static GetRuleResponseBodyRuleUsers build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyRuleUsers self = new GetRuleResponseBodyRuleUsers();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyRuleUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetRuleResponseBodyRule extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Databases")
        public java.util.List<GetRuleResponseBodyRuleDatabases> databases;

        @NameInMap("EffectiveEndTime")
        public String effectiveEndTime;

        @NameInMap("EffectiveStartTime")
        public String effectiveStartTime;

        @NameInMap("HostGroups")
        public java.util.List<GetRuleResponseBodyRuleHostGroups> hostGroups;

        @NameInMap("Hosts")
        public java.util.List<GetRuleResponseBodyRuleHosts> hosts;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("UserGroups")
        public java.util.List<GetRuleResponseBodyRuleUserGroups> userGroups;

        @NameInMap("Users")
        public java.util.List<GetRuleResponseBodyRuleUsers> users;

        public static GetRuleResponseBodyRule build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyRule self = new GetRuleResponseBodyRule();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyRule setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetRuleResponseBodyRule setDatabases(java.util.List<GetRuleResponseBodyRuleDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<GetRuleResponseBodyRuleDatabases> getDatabases() {
            return this.databases;
        }

        public GetRuleResponseBodyRule setEffectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public String getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public GetRuleResponseBodyRule setEffectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public String getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public GetRuleResponseBodyRule setHostGroups(java.util.List<GetRuleResponseBodyRuleHostGroups> hostGroups) {
            this.hostGroups = hostGroups;
            return this;
        }
        public java.util.List<GetRuleResponseBodyRuleHostGroups> getHostGroups() {
            return this.hostGroups;
        }

        public GetRuleResponseBodyRule setHosts(java.util.List<GetRuleResponseBodyRuleHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<GetRuleResponseBodyRuleHosts> getHosts() {
            return this.hosts;
        }

        public GetRuleResponseBodyRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetRuleResponseBodyRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetRuleResponseBodyRule setUserGroups(java.util.List<GetRuleResponseBodyRuleUserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }
        public java.util.List<GetRuleResponseBodyRuleUserGroups> getUserGroups() {
            return this.userGroups;
        }

        public GetRuleResponseBodyRule setUsers(java.util.List<GetRuleResponseBodyRuleUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<GetRuleResponseBodyRuleUsers> getUsers() {
            return this.users;
        }

    }

}
