// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationHostAccountsResponseBody extends TeaModel {
    /**
     * <p>The host accounts returned.</p>
     */
    @NameInMap("HostAccounts")
    public java.util.List<ListOperationHostAccountsResponseBodyHostAccounts> hostAccounts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of host accounts returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>Indicates whether SFTP channels are enabled for the account.</p>
         */
        @NameInMap("EnableSFTPChannel")
        public Boolean enableSFTPChannel;

        /**
         * <p>Indicates whether SSH channels are enabled for the account.</p>
         */
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
        /**
         * <p>Indicates whether a password is configured for the host account.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        /**
         * <p>The host account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostAccountId")
        public String hostAccountId;

        /**
         * <p>The host account name.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("HostAccountName")
        public String hostAccountName;

        /**
         * <p>The host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>１</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The ID of the shared key that is associated with the host.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        /**
         * <p>The fingerprint of the private key for the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>fe:ca:37:42:30:00:9d:95:e6:73:e5:b0:32:0a:<strong>:</strong></p>
         */
        @NameInMap("PrivateKeyFingerprint")
        public String privateKeyFingerprint;

        /**
         * <p>The protocol that is used by the host account.</p>
         * <ul>
         * <li><strong>SSH</strong></li>
         * <li><strong>RDP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
        @NameInMap("ProtocolName")
        public String protocolName;

        /**
         * <p>Indicates whether the Secure File Transfer Protocol (SFTP) channels or the SSH channels are enabled for the host account that uses the SSH protocol.</p>
         */
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
