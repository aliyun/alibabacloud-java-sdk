// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsForUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the user.</p>
     * <br>
     * <p>>  You can call the [ListUsers](~~204522~~) operation to query the ID of the user ID.</p>
     */
    @NameInMap("Hosts")
    public java.util.List<ListHostsForUserResponseBodyHosts> hosts;

    /**
     * <p>The hosts returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The public endpoint of the host. The value is a domain name or an IP address.</p>
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
         * <p>All Bastionhost API requests must include common request parameters. For more information about common request parameters, see [Common parameters](~~148139~~).</p>
         * <br>
         * <p>For more information about sample requests, see the "Examples" section of this topic.</p>
         */
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Comment")
        public String comment;

        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>ListHostsForUser</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>WB662865</p>
         */
        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        /**
         * <p>Queries the hosts that a specified user is authorized or not authorized to manage.</p>
         */
        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

        /**
         * <p>ListHostsForUser</p>
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
