// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the queried host accounts.</p>
     */
    @NameInMap("HostAccounts")
    public java.util.List<ListHostAccountsResponseBodyHostAccounts> hostAccounts;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of host accounts that are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHostAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsResponseBody self = new ListHostAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsResponseBody setHostAccounts(java.util.List<ListHostAccountsResponseBodyHostAccounts> hostAccounts) {
        this.hostAccounts = hostAccounts;
        return this;
    }
    public java.util.List<ListHostAccountsResponseBodyHostAccounts> getHostAccounts() {
        return this.hostAccounts;
    }

    public ListHostAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostAccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostAccountsResponseBodyHostAccounts extends TeaModel {
        /**
         * <p>Indicates whether a password is configured for the host account.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: A password is configured for the host account.</li>
         * <li>false: No passwords are configured for the host account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        /**
         * <p>The ID of the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostAccountId")
        public String hostAccountId;

        /**
         * <p>The name of the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("HostAccountName")
        public String hostAccountName;

        /**
         * <p>The ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The ID of the shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        /**
         * <p>The name of the shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("HostShareKeyName")
        public String hostShareKeyName;

        /**
         * <p>The fingerprint of the private key for the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>fe:ca:37:42:30:00:9d:95:e6:73:e5:b0:32:0a:<strong>:</strong></p>
         */
        @NameInMap("PrivateKeyFingerprint")
        public String privateKeyFingerprint;

        @NameInMap("PrivilegeType")
        public String privilegeType;

        /**
         * <p>The protocol that is used by the host.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SSH</li>
         * <li>RDP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
        @NameInMap("ProtocolName")
        public String protocolName;

        @NameInMap("RotationMode")
        public String rotationMode;

        public static ListHostAccountsResponseBodyHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListHostAccountsResponseBodyHostAccounts self = new ListHostAccountsResponseBodyHostAccounts();
            return TeaModel.build(map, self);
        }

        public ListHostAccountsResponseBodyHostAccounts setHasPassword(Boolean hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        public ListHostAccountsResponseBodyHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public ListHostAccountsResponseBodyHostAccounts setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public ListHostAccountsResponseBodyHostAccounts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListHostAccountsResponseBodyHostAccounts setHostShareKeyId(String hostShareKeyId) {
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }
        public String getHostShareKeyId() {
            return this.hostShareKeyId;
        }

        public ListHostAccountsResponseBodyHostAccounts setHostShareKeyName(String hostShareKeyName) {
            this.hostShareKeyName = hostShareKeyName;
            return this;
        }
        public String getHostShareKeyName() {
            return this.hostShareKeyName;
        }

        public ListHostAccountsResponseBodyHostAccounts setPrivateKeyFingerprint(String privateKeyFingerprint) {
            this.privateKeyFingerprint = privateKeyFingerprint;
            return this;
        }
        public String getPrivateKeyFingerprint() {
            return this.privateKeyFingerprint;
        }

        public ListHostAccountsResponseBodyHostAccounts setPrivilegeType(String privilegeType) {
            this.privilegeType = privilegeType;
            return this;
        }
        public String getPrivilegeType() {
            return this.privilegeType;
        }

        public ListHostAccountsResponseBodyHostAccounts setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

        public ListHostAccountsResponseBodyHostAccounts setRotationMode(String rotationMode) {
            this.rotationMode = rotationMode;
            return this;
        }
        public String getRotationMode() {
            return this.rotationMode;
        }

    }

}
