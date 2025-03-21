// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsForUserResponseBody extends TeaModel {
    /**
     * <p>The hosts returned.</p>
     */
    @NameInMap("Hosts")
    public java.util.List<ListHostsForUserResponseBodyHosts> hosts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of hosts returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHostsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostsForUserResponseBody self = new ListHostsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostsForUserResponseBody setHosts(java.util.List<ListHostsForUserResponseBodyHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<ListHostsForUserResponseBodyHosts> getHosts() {
        return this.hosts;
    }

    public ListHostsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostsForUserResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostsForUserResponseBodyHosts extends TeaModel {
        /**
         * <p>The endpoint type of the host. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: public endpoint</li>
         * <li><strong>Private</strong>: internal endpoint</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        /**
         * <p>The description of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The name of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>host01</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The internal endpoint of the host. The value is a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        /**
         * <p>The public endpoint of the host. The value is a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.158.XX.XX</p>
         */
        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

        /**
         * <p>The operating system of the host. Valid values:</p>
         * <ul>
         * <li><strong>Linux</strong></li>
         * <li><strong>Windows</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        public static ListHostsForUserResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            ListHostsForUserResponseBodyHosts self = new ListHostsForUserResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public ListHostsForUserResponseBodyHosts setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public ListHostsForUserResponseBodyHosts setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListHostsForUserResponseBodyHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListHostsForUserResponseBodyHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListHostsForUserResponseBodyHosts setHostPrivateAddress(String hostPrivateAddress) {
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }
        public String getHostPrivateAddress() {
            return this.hostPrivateAddress;
        }

        public ListHostsForUserResponseBodyHosts setHostPublicAddress(String hostPublicAddress) {
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
        }

        public ListHostsForUserResponseBodyHosts setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

    }

}
