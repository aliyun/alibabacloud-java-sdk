// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForUserResponseBody extends TeaModel {
    /**
     * <p>The host accounts returned.</p>
     */
    @NameInMap("HostAccounts")
    public java.util.List<ListHostAccountsForUserResponseBodyHostAccounts> hostAccounts;

    /**
     * <p>The ID of the request.</p>
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
         * <p>root</p>
         */
        @NameInMap("HostAccountName")
        public String hostAccountName;

        /**
         * <p>The type of the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Normal&quot;</p>
         */
        @NameInMap("HostAccountType")
        public String hostAccountType;

        /**
         * <p>The ID of the host to which the host account belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>Indicates whether the host account is authorized for the current user. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: authorized</li>
         * <li><strong>false</strong>: unauthorized</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAuthorized")
        public Boolean isAuthorized;

        /**
         * <p>The protocol of the host account. Valid values:</p>
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

        public ListHostAccountsForUserResponseBodyHostAccounts setHostAccountType(String hostAccountType) {
            this.hostAccountType = hostAccountType;
            return this;
        }
        public String getHostAccountType() {
            return this.hostAccountType;
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
