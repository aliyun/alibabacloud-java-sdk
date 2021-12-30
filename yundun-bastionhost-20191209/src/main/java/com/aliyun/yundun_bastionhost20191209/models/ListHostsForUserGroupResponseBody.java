// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsForUserGroupResponseBody extends TeaModel {
    @NameInMap("Hosts")
    public java.util.List<ListHostsForUserGroupResponseBodyHosts> hosts;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

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
