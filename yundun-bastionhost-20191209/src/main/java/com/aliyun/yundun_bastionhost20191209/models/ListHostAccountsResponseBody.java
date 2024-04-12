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
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of host accounts that are queried.</p>
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
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: A password is configured for the host account.</p>
         * <p>*   false: No passwords are configured for the host account.</p>
         */
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        /**
         * <p>The ID of the host account.</p>
         */
        @NameInMap("HostAccountId")
        public String hostAccountId;

        /**
         * <p>The name of the host account.</p>
         */
        @NameInMap("HostAccountName")
        public String hostAccountName;

        /**
         * <p>The ID of the host.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The ID of the shared key.</p>
         */
        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        /**
         * <p>The name of the shared key.</p>
         */
        @NameInMap("HostShareKeyName")
        public String hostShareKeyName;

        /**
         * <p>The fingerprint of the private key for the host account.</p>
         */
        @NameInMap("PrivateKeyFingerprint")
        public String privateKeyFingerprint;

        /**
         * <p>The protocol that is used by the host.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   SSH</p>
         * <p>*   RDP</p>
         */
        @NameInMap("ProtocolName")
        public String protocolName;

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

        public ListHostAccountsResponseBodyHostAccounts setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

    }

}
