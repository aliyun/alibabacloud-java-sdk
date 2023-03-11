// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserDetailResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyUserDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>The details of asset fingerprints for the account.</p>
     */
    @NameInMap("Propertys")
    public java.util.List<DescribePropertyUserDetailResponseBodyPropertys> propertys;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: **10**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
        /**
         * <p>The date on which the account expires.</p>
         */
        @NameInMap("AccountsExpirationDate")
        public String accountsExpirationDate;

        /**
         * <p>The timestamp at which the last asset fingerprint collection is performed. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The details of the user groups to which the account belongs.</p>
         */
        @NameInMap("GroupNames")
        public java.util.List<String> groupNames;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IP addresses of the server.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>Indicates whether the account is an interactive logon account. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("IsCouldLogin")
        public Integer isCouldLogin;

        /**
         * <p>Indicates whether the password expires. Valid values:</p>
         * <br>
         * <p>*   **0**: yes</p>
         * <p>*   **1**: no</p>
         */
        @NameInMap("IsPasswdExpired")
        public Integer isPasswdExpired;

        /**
         * <p>Indicates whether the password is locked. Valid values:</p>
         * <br>
         * <p>*   **0**: yes</p>
         * <p>*   **1**: no</p>
         */
        @NameInMap("IsPasswdLocked")
        public Integer isPasswdLocked;

        /**
         * <p>Indicates whether the account has root permissions. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("IsRoot")
        public String isRoot;

        /**
         * <p>Indicates whether the account is a sudo account. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("IsSudoer")
        public Integer isSudoer;

        /**
         * <p>Indicates whether the account expires. Valid values:</p>
         * <br>
         * <p>*   **0**: yes</p>
         * <p>*   **1**: no</p>
         */
        @NameInMap("IsUserExpired")
        public Integer isUserExpired;

        /**
         * <p>The source IP address of the last logon to the account.</p>
         */
        @NameInMap("LastLoginIp")
        public String lastLoginIp;

        /**
         * <p>The last logon time of the account.</p>
         */
        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        /**
         * <p>The timestamp of the last logon to the account. Unit: milliseconds.</p>
         */
        @NameInMap("LastLoginTimeDt")
        public Long lastLoginTimeDt;

        /**
         * <p>The timestamp of the last logon to the account. Unit: milliseconds.</p>
         */
        @NameInMap("LastLoginTimestamp")
        public Long lastLoginTimestamp;

        /**
         * <p>The date on which the password of the account expires.</p>
         */
        @NameInMap("PasswordExpirationDate")
        public String passwordExpirationDate;

        /**
         * <p>This parameter is deprecated. You can ignore it.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the account.</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>The UUID of the server.</p>
         */
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
