// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostAccounts")
    public java.util.List<ListHostAccountsResponseBodyHostAccounts> hostAccounts;

    public static ListHostAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsResponseBody self = new ListHostAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHostAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostAccountsResponseBody setHostAccounts(java.util.List<ListHostAccountsResponseBodyHostAccounts> hostAccounts) {
        this.hostAccounts = hostAccounts;
        return this;
    }
    public java.util.List<ListHostAccountsResponseBodyHostAccounts> getHostAccounts() {
        return this.hostAccounts;
    }

    public static class ListHostAccountsResponseBodyHostAccounts extends TeaModel {
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        @NameInMap("PrivateKeyFingerprint")
        public String privateKeyFingerprint;

        @NameInMap("ProtocolName")
        public String protocolName;

        @NameInMap("HostAccountName")
        public String hostAccountName;

        @NameInMap("HostAccountId")
        public String hostAccountId;

        @NameInMap("HostId")
        public String hostId;

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

        public ListHostAccountsResponseBodyHostAccounts setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public ListHostAccountsResponseBodyHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public ListHostAccountsResponseBodyHostAccounts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
