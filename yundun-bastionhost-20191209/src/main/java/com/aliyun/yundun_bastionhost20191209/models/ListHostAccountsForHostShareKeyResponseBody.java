// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForHostShareKeyResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the host accounts that are associated with the shared key.</p>
     */
    @NameInMap("HostAccounts")
    public java.util.List<ListHostAccountsForHostShareKeyResponseBodyHostAccounts> hostAccounts;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the host accounts that are associated with the shared key.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        /**
         * <p>The name of the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>root1234</p>
         */
        @NameInMap("HostAccountName")
        public String hostAccountName;

        /**
         * <p>The ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>1113</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The ID of the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>1235</p>
         */
        @NameInMap("HostsAccountId")
        public String hostsAccountId;

        /**
         * <p>The O\&amp;M protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
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
