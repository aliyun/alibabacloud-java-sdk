// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForUserGroupResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostAccounts")
    public java.util.List<ListHostAccountsForUserGroupResponseBodyHostAccounts> hostAccounts;

    public static ListHostAccountsForUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsForUserGroupResponseBody self = new ListHostAccountsForUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsForUserGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHostAccountsForUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostAccountsForUserGroupResponseBody setHostAccounts(java.util.List<ListHostAccountsForUserGroupResponseBodyHostAccounts> hostAccounts) {
        this.hostAccounts = hostAccounts;
        return this;
    }
    public java.util.List<ListHostAccountsForUserGroupResponseBodyHostAccounts> getHostAccounts() {
        return this.hostAccounts;
    }

    public static class ListHostAccountsForUserGroupResponseBodyHostAccounts extends TeaModel {
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

        public static ListHostAccountsForUserGroupResponseBodyHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListHostAccountsForUserGroupResponseBodyHostAccounts self = new ListHostAccountsForUserGroupResponseBodyHostAccounts();
            return TeaModel.build(map, self);
        }

        public ListHostAccountsForUserGroupResponseBodyHostAccounts setIsAuthorized(Boolean isAuthorized) {
            this.isAuthorized = isAuthorized;
            return this;
        }
        public Boolean getIsAuthorized() {
            return this.isAuthorized;
        }

        public ListHostAccountsForUserGroupResponseBodyHostAccounts setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

        public ListHostAccountsForUserGroupResponseBodyHostAccounts setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public ListHostAccountsForUserGroupResponseBodyHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public ListHostAccountsForUserGroupResponseBodyHostAccounts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
