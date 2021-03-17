// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsForUserResponseBody extends TeaModel {
    @NameInMap("Hosts")
    public java.util.List<ListHostsForUserResponseBodyHosts> hosts;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

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

    public ListHostsForUserResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHostsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHostsForUserResponseBodyHosts extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("HostId")
        public String hostId;

        public static ListHostsForUserResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            ListHostsForUserResponseBodyHosts self = new ListHostsForUserResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public ListHostsForUserResponseBodyHosts setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListHostsForUserResponseBodyHosts setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public ListHostsForUserResponseBodyHosts setHostPublicAddress(String hostPublicAddress) {
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
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

        public ListHostsForUserResponseBodyHosts setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public ListHostsForUserResponseBodyHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
