// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForHostShareKeyResponseBody extends TeaModel {
    @NameInMap("HostAccounts")
    public java.util.List<ListHostAccountsForHostShareKeyResponseBodyHostAccounts> hostAccounts;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListHostAccountsForHostShareKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsForHostShareKeyResponseBody self = new ListHostAccountsForHostShareKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsForHostShareKeyResponseBody setHostAccounts(java.util.List<ListHostAccountsForHostShareKeyResponseBodyHostAccounts> hostAccounts) {
        this.hostAccounts = hostAccounts;
        return this;
    }
    public java.util.List<ListHostAccountsForHostShareKeyResponseBodyHostAccounts> getHostAccounts() {
        return this.hostAccounts;
    }

    public ListHostAccountsForHostShareKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostAccountsForHostShareKeyResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostAccountsForHostShareKeyResponseBodyHostAccounts extends TeaModel {
        @NameInMap("HostAccountName")
        public String hostAccountName;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("HostsAccountId")
        public String hostsAccountId;

        @NameInMap("ProtocolName")
        public String protocolName;

        public static ListHostAccountsForHostShareKeyResponseBodyHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListHostAccountsForHostShareKeyResponseBodyHostAccounts self = new ListHostAccountsForHostShareKeyResponseBodyHostAccounts();
            return TeaModel.build(map, self);
        }

        public ListHostAccountsForHostShareKeyResponseBodyHostAccounts setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public ListHostAccountsForHostShareKeyResponseBodyHostAccounts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListHostAccountsForHostShareKeyResponseBodyHostAccounts setHostsAccountId(String hostsAccountId) {
            this.hostsAccountId = hostsAccountId;
            return this;
        }
        public String getHostsAccountId() {
            return this.hostsAccountId;
        }

        public ListHostAccountsForHostShareKeyResponseBodyHostAccounts setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

    }

}
