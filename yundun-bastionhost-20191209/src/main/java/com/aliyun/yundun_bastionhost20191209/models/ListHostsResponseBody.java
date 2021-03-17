// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsResponseBody extends TeaModel {
    @NameInMap("Hosts")
    public java.util.List<ListHostsResponseBodyHosts> hosts;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    public static ListHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostsResponseBody self = new ListHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostsResponseBody setHosts(java.util.List<ListHostsResponseBodyHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<ListHostsResponseBodyHosts> getHosts() {
        return this.hosts;
    }

    public ListHostsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHostsResponseBodyHosts extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("HostAccountCount")
        public Integer hostAccountCount;

        @NameInMap("Source")
        public String source;

        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("SourceInstanceState")
        public String sourceInstanceState;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        public static ListHostsResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            ListHostsResponseBodyHosts self = new ListHostsResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public ListHostsResponseBodyHosts setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListHostsResponseBodyHosts setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public ListHostsResponseBodyHosts setHostPublicAddress(String hostPublicAddress) {
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
        }

        public ListHostsResponseBodyHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListHostsResponseBodyHosts setHostAccountCount(Integer hostAccountCount) {
            this.hostAccountCount = hostAccountCount;
            return this;
        }
        public Integer getHostAccountCount() {
            return this.hostAccountCount;
        }

        public ListHostsResponseBodyHosts setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListHostsResponseBodyHosts setHostPrivateAddress(String hostPrivateAddress) {
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }
        public String getHostPrivateAddress() {
            return this.hostPrivateAddress;
        }

        public ListHostsResponseBodyHosts setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public ListHostsResponseBodyHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListHostsResponseBodyHosts setSourceInstanceState(String sourceInstanceState) {
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

        public ListHostsResponseBodyHosts setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

    }

}
