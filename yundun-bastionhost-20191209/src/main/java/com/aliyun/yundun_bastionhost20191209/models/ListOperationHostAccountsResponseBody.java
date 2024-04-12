// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationHostAccountsResponseBody extends TeaModel {
    @NameInMap("HostAccounts")
    public java.util.List<ListOperationHostAccountsResponseBodyHostAccounts> hostAccounts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOperationHostAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHostAccountsResponseBody self = new ListOperationHostAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationHostAccountsResponseBody setHostAccounts(java.util.List<ListOperationHostAccountsResponseBodyHostAccounts> hostAccounts) {
        this.hostAccounts = hostAccounts;
        return this;
    }
    public java.util.List<ListOperationHostAccountsResponseBodyHostAccounts> getHostAccounts() {
        return this.hostAccounts;
    }

    public ListOperationHostAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationHostAccountsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOperationHostAccountsResponseBodyHostAccountsSSHConfig extends TeaModel {
        @NameInMap("EnableSFTPChannel")
        public Boolean enableSFTPChannel;

        @NameInMap("EnableSSHChannel")
        public Boolean enableSSHChannel;

        public static ListOperationHostAccountsResponseBodyHostAccountsSSHConfig build(java.util.Map<String, ?> map) throws Exception {
            ListOperationHostAccountsResponseBodyHostAccountsSSHConfig self = new ListOperationHostAccountsResponseBodyHostAccountsSSHConfig();
            return TeaModel.build(map, self);
        }

        public ListOperationHostAccountsResponseBodyHostAccountsSSHConfig setEnableSFTPChannel(Boolean enableSFTPChannel) {
            this.enableSFTPChannel = enableSFTPChannel;
            return this;
        }
        public Boolean getEnableSFTPChannel() {
            return this.enableSFTPChannel;
        }

        public ListOperationHostAccountsResponseBodyHostAccountsSSHConfig setEnableSSHChannel(Boolean enableSSHChannel) {
            this.enableSSHChannel = enableSSHChannel;
            return this;
        }
        public Boolean getEnableSSHChannel() {
            return this.enableSSHChannel;
        }

    }

    public static class ListOperationHostAccountsResponseBodyHostAccounts extends TeaModel {
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        @NameInMap("HostAccountId")
        public String hostAccountId;

        @NameInMap("HostAccountName")
        public String hostAccountName;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        @NameInMap("PrivateKeyFingerprint")
        public String privateKeyFingerprint;

        @NameInMap("ProtocolName")
        public String protocolName;

        @NameInMap("SSHConfig")
        public ListOperationHostAccountsResponseBodyHostAccountsSSHConfig SSHConfig;

        public static ListOperationHostAccountsResponseBodyHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListOperationHostAccountsResponseBodyHostAccounts self = new ListOperationHostAccountsResponseBodyHostAccounts();
            return TeaModel.build(map, self);
        }

        public ListOperationHostAccountsResponseBodyHostAccounts setHasPassword(Boolean hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        public ListOperationHostAccountsResponseBodyHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public ListOperationHostAccountsResponseBodyHostAccounts setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public ListOperationHostAccountsResponseBodyHostAccounts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListOperationHostAccountsResponseBodyHostAccounts setHostShareKeyId(String hostShareKeyId) {
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }
        public String getHostShareKeyId() {
            return this.hostShareKeyId;
        }

        public ListOperationHostAccountsResponseBodyHostAccounts setPrivateKeyFingerprint(String privateKeyFingerprint) {
            this.privateKeyFingerprint = privateKeyFingerprint;
            return this;
        }
        public String getPrivateKeyFingerprint() {
            return this.privateKeyFingerprint;
        }

        public ListOperationHostAccountsResponseBodyHostAccounts setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

        public ListOperationHostAccountsResponseBodyHostAccounts setSSHConfig(ListOperationHostAccountsResponseBodyHostAccountsSSHConfig SSHConfig) {
            this.SSHConfig = SSHConfig;
            return this;
        }
        public ListOperationHostAccountsResponseBodyHostAccountsSSHConfig getSSHConfig() {
            return this.SSHConfig;
        }

    }

}
