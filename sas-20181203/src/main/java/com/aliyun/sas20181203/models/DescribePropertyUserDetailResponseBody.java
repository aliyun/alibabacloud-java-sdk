// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribePropertyUserDetailResponseBodyPageInfo pageInfo;

    @NameInMap("Propertys")
    public java.util.List<DescribePropertyUserDetailResponseBodyPropertys> propertys;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyUserDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUserDetailResponseBody self = new DescribePropertyUserDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUserDetailResponseBody setPageInfo(DescribePropertyUserDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyUserDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyUserDetailResponseBody setPropertys(java.util.List<DescribePropertyUserDetailResponseBodyPropertys> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<DescribePropertyUserDetailResponseBodyPropertys> getPropertys() {
        return this.propertys;
    }

    public DescribePropertyUserDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyUserDetailResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyUserDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyUserDetailResponseBodyPageInfo self = new DescribePropertyUserDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyUserDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyUserDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyUserDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyUserDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyUserDetailResponseBodyPropertys extends TeaModel {
        @NameInMap("AccountsExpirationDate")
        public String accountsExpirationDate;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("GroupNames")
        public java.util.List<String> groupNames;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("IsCouldLogin")
        public Integer isCouldLogin;

        @NameInMap("IsPasswdExpired")
        public Integer isPasswdExpired;

        @NameInMap("IsPasswdLocked")
        public Integer isPasswdLocked;

        @NameInMap("IsRoot")
        public String isRoot;

        @NameInMap("IsSudoer")
        public Integer isSudoer;

        @NameInMap("IsUserExpired")
        public Integer isUserExpired;

        @NameInMap("LastLoginIp")
        public String lastLoginIp;

        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        @NameInMap("LastLoginTimeDt")
        public Long lastLoginTimeDt;

        @NameInMap("LastLoginTimestamp")
        public Long lastLoginTimestamp;

        @NameInMap("PasswordExpirationDate")
        public String passwordExpirationDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("User")
        public String user;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribePropertyUserDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyUserDetailResponseBodyPropertys self = new DescribePropertyUserDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertyUserDetailResponseBodyPropertys setAccountsExpirationDate(String accountsExpirationDate) {
            this.accountsExpirationDate = accountsExpirationDate;
            return this;
        }
        public String getAccountsExpirationDate() {
            return this.accountsExpirationDate;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setGroupNames(java.util.List<String> groupNames) {
            this.groupNames = groupNames;
            return this;
        }
        public java.util.List<String> getGroupNames() {
            return this.groupNames;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setIsCouldLogin(Integer isCouldLogin) {
            this.isCouldLogin = isCouldLogin;
            return this;
        }
        public Integer getIsCouldLogin() {
            return this.isCouldLogin;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setIsPasswdExpired(Integer isPasswdExpired) {
            this.isPasswdExpired = isPasswdExpired;
            return this;
        }
        public Integer getIsPasswdExpired() {
            return this.isPasswdExpired;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setIsPasswdLocked(Integer isPasswdLocked) {
            this.isPasswdLocked = isPasswdLocked;
            return this;
        }
        public Integer getIsPasswdLocked() {
            return this.isPasswdLocked;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setIsRoot(String isRoot) {
            this.isRoot = isRoot;
            return this;
        }
        public String getIsRoot() {
            return this.isRoot;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setIsSudoer(Integer isSudoer) {
            this.isSudoer = isSudoer;
            return this;
        }
        public Integer getIsSudoer() {
            return this.isSudoer;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setIsUserExpired(Integer isUserExpired) {
            this.isUserExpired = isUserExpired;
            return this;
        }
        public Integer getIsUserExpired() {
            return this.isUserExpired;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setLastLoginIp(String lastLoginIp) {
            this.lastLoginIp = lastLoginIp;
            return this;
        }
        public String getLastLoginIp() {
            return this.lastLoginIp;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setLastLoginTimeDt(Long lastLoginTimeDt) {
            this.lastLoginTimeDt = lastLoginTimeDt;
            return this;
        }
        public Long getLastLoginTimeDt() {
            return this.lastLoginTimeDt;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setLastLoginTimestamp(Long lastLoginTimestamp) {
            this.lastLoginTimestamp = lastLoginTimestamp;
            return this;
        }
        public Long getLastLoginTimestamp() {
            return this.lastLoginTimestamp;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setPasswordExpirationDate(String passwordExpirationDate) {
            this.passwordExpirationDate = passwordExpirationDate;
            return this;
        }
        public String getPasswordExpirationDate() {
            return this.passwordExpirationDate;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribePropertyUserDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
