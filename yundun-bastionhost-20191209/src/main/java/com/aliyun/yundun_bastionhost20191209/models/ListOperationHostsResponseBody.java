// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationHostsResponseBody extends TeaModel {
    @NameInMap("Hosts")
    public java.util.List<ListOperationHostsResponseBodyHosts> hosts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOperationHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHostsResponseBody self = new ListOperationHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationHostsResponseBody setHosts(java.util.List<ListOperationHostsResponseBodyHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<ListOperationHostsResponseBodyHosts> getHosts() {
        return this.hosts;
    }

    public ListOperationHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationHostsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOperationHostsResponseBodyHosts extends TeaModel {
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

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        @NameInMap("SourceInstanceState")
        public String sourceInstanceState;

        public static ListOperationHostsResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            ListOperationHostsResponseBodyHosts self = new ListOperationHostsResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public ListOperationHostsResponseBodyHosts setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public ListOperationHostsResponseBodyHosts setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListOperationHostsResponseBodyHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListOperationHostsResponseBodyHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListOperationHostsResponseBodyHosts setHostPrivateAddress(String hostPrivateAddress) {
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }
        public String getHostPrivateAddress() {
            return this.hostPrivateAddress;
        }

        public ListOperationHostsResponseBodyHosts setHostPublicAddress(String hostPublicAddress) {
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
        }

        public ListOperationHostsResponseBodyHosts setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public ListOperationHostsResponseBodyHosts setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListOperationHostsResponseBodyHosts setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListOperationHostsResponseBodyHosts setSourceInstanceState(String sourceInstanceState) {
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

    }

}
