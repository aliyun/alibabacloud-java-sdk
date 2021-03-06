// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForUserResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostAccounts")
    public java.util.List<ListHostAccountsForUserResponseBodyHostAccounts> hostAccounts;

    public static ListHostAccountsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsForUserResponseBody self = new ListHostAccountsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsForUserResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHostAccountsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostAccountsForUserResponseBody setHostAccounts(java.util.List<ListHostAccountsForUserResponseBodyHostAccounts> hostAccounts) {
        this.hostAccounts = hostAccounts;
        return this;
    }
    public java.util.List<ListHostAccountsForUserResponseBodyHostAccounts> getHostAccounts() {
        return this.hostAccounts;
    }

    public static class ListHostAccountsForUserResponseBodyHostAccounts extends TeaModel {
        @NameInMap("IsAuthorized")
        public Boolean isAuthorized;

        @NameInMap("ProtocolName")
        public String protocolName;

        @NameInMap("HostAccountName")
        public String hostAccountName;

        @NameInMap("HostAccountId")
        public String hostAccountId;

        @NameInMap("HostId")
        public String hostId;

        public static ListHostAccountsForUserResponseBodyHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListHostAccountsForUserResponseBodyHostAccounts self = new ListHostAccountsForUserResponseBodyHostAccounts();
            return TeaModel.build(map, self);
        }

        public ListHostAccountsForUserResponseBodyHostAccounts setIsAuthorized(Boolean isAuthorized) {
            this.isAuthorized = isAuthorized;
            return this;
        }
        public Boolean getIsAuthorized() {
            return this.isAuthorized;
        }

        public ListHostAccountsForUserResponseBodyHostAccounts setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

        public ListHostAccountsForUserResponseBodyHostAccounts setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public ListHostAccountsForUserResponseBodyHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public ListHostAccountsForUserResponseBodyHostAccounts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
