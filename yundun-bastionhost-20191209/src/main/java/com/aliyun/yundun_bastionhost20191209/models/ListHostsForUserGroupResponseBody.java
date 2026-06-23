// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsForUserGroupResponseBody extends TeaModel {
    /**
     * <p>A list of hosts.</p>
     */
    @NameInMap("Hosts")
    public java.util.List<ListHostsForUserGroupResponseBodyHosts> hosts;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of hosts.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHostsForUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostsForUserGroupResponseBody self = new ListHostsForUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostsForUserGroupResponseBody setHosts(java.util.List<ListHostsForUserGroupResponseBodyHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<ListHostsForUserGroupResponseBodyHosts> getHosts() {
        return this.hosts;
    }

    public ListHostsForUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostsForUserGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostsForUserGroupResponseBodyHosts extends TeaModel {
        /**
         * <p>The address type of the host. Valid values:</p>
         * <ul>
         * <li><p><strong>Public</strong>: a public IP address</p>
         * </li>
         * <li><p><strong>Private</strong>: a private IP address</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        /**
         * <p>The remarks of the host.</p>
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
         * <p>host1</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The private IP address of the host. This can be a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        /**
         * <p>The public IP address of the host. This can be a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.158.XX.XX</p>
         */
        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

        /**
         * <p>The OS type of the host. Valid values:</p>
         * <ul>
         * <li><p><strong>Linux</strong></p>
         * </li>
         * <li><p><strong>Windows</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        public static ListHostsForUserGroupResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            ListHostsForUserGroupResponseBodyHosts self = new ListHostsForUserGroupResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public ListHostsForUserGroupResponseBodyHosts setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public ListHostsForUserGroupResponseBodyHosts setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListHostsForUserGroupResponseBodyHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListHostsForUserGroupResponseBodyHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListHostsForUserGroupResponseBodyHosts setHostPrivateAddress(String hostPrivateAddress) {
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }
        public String getHostPrivateAddress() {
            return this.hostPrivateAddress;
        }

        public ListHostsForUserGroupResponseBodyHosts setHostPublicAddress(String hostPublicAddress) {
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
        }

        public ListHostsForUserGroupResponseBodyHosts setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

    }

}
