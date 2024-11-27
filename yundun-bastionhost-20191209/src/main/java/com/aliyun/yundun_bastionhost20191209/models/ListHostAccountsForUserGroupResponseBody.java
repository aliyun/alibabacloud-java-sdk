// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForUserGroupResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the queried host accounts.</p>
     */
    @NameInMap("HostAccounts")
    public java.util.List<ListHostAccountsForUserGroupResponseBodyHostAccounts> hostAccounts;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of host accounts that were queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>host１</p>
         */
        @NameInMap("HostAccountName")
        public String hostAccountName;

        /**
         * <p>The ID of the host for which the host accounts were queried.</p>
         * 
         * <strong>example:</strong>
         * <p>１</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>Indicates whether the user group is authorized to manage the host account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAuthorized")
        public Boolean isAuthorized;

        /**
         * <p>The protocol that is used by the host. Valid values:</p>
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
