// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForUserResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the queried host accounts.</p>
     */
    @NameInMap("HostAccounts")
    public java.util.List<ListHostAccountsForUserResponseBodyHostAccounts> hostAccounts;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of host accounts that were queried.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHostAccountsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsForUserResponseBody self = new ListHostAccountsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsForUserResponseBody setHostAccounts(java.util.List<ListHostAccountsForUserResponseBodyHostAccounts> hostAccounts) {
        this.hostAccounts = hostAccounts;
        return this;
    }
    public java.util.List<ListHostAccountsForUserResponseBodyHostAccounts> getHostAccounts() {
        return this.hostAccounts;
    }

    public ListHostAccountsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostAccountsForUserResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostAccountsForUserResponseBodyHostAccounts extends TeaModel {
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
         * <p>Indicates whether the user is authorized to manage the host account. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("IsAuthorized")
        public Boolean isAuthorized;

        /**
         * <p>The protocol that is used by the host. Valid values:</p>
         * <br>
         * <p>*   **SSH**</p>
         * <p>*   **RDP**</p>
         */
        @NameInMap("ProtocolName")
        public String protocolName;

        public static ListHostAccountsForUserResponseBodyHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListHostAccountsForUserResponseBodyHostAccounts self = new ListHostAccountsForUserResponseBodyHostAccounts();
            return TeaModel.build(map, self);
        }

        public ListHostAccountsForUserResponseBodyHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public ListHostAccountsForUserResponseBodyHostAccounts setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public ListHostAccountsForUserResponseBodyHostAccounts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
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

    }

}
