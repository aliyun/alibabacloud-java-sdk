// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForUserGroupResponseBody extends TeaModel {
    /**
     * <p>The host accounts returned.</p>
     */
    @NameInMap("HostAccounts")
    public java.util.List<ListHostAccountsForUserGroupResponseBodyHostAccounts> hostAccounts;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of host accounts returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHostAccountsForUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsForUserGroupResponseBody self = new ListHostAccountsForUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsForUserGroupResponseBody setHostAccounts(java.util.List<ListHostAccountsForUserGroupResponseBodyHostAccounts> hostAccounts) {
        this.hostAccounts = hostAccounts;
        return this;
    }
    public java.util.List<ListHostAccountsForUserGroupResponseBodyHostAccounts> getHostAccounts() {
        return this.hostAccounts;
    }

    public ListHostAccountsForUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostAccountsForUserGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostAccountsForUserGroupResponseBodyHostAccounts extends TeaModel {
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
         * <p>The ID of the host for which the host accounts were queried.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>Indicates whether the user group is authorized to manage the host account. Valid values:</p>
         * <br>
         * <p>*   **true**: The user group is authorized to manage the host account.</p>
         * <p>*   **false**: The user group is not authorized to manage the host account.</p>
         */
        @NameInMap("IsAuthorized")
        public Boolean isAuthorized;

        /**
         * <p>The protocol that is used by the host account. Valid values:</p>
         * <br>
         * <p>*   **SSH**</p>
         * <p>*   **RDP**</p>
         */
        @NameInMap("ProtocolName")
        public String protocolName;

        public static ListHostAccountsForUserGroupResponseBodyHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListHostAccountsForUserGroupResponseBodyHostAccounts self = new ListHostAccountsForUserGroupResponseBodyHostAccounts();
            return TeaModel.build(map, self);
        }

        public ListHostAccountsForUserGroupResponseBodyHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public ListHostAccountsForUserGroupResponseBodyHostAccounts setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public ListHostAccountsForUserGroupResponseBodyHostAccounts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
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

    }

}
