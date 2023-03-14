// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsResponseBody extends TeaModel {
    /**
     * <p>The hosts that were queried.</p>
     */
    @NameInMap("Hosts")
    public java.util.List<ListHostsResponseBodyHosts> hosts;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of hosts that were queried.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public ListHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostsResponseBodyHosts extends TeaModel {
        /**
         * <p>The endpoint type of the host. Valid values:</p>
         * <br>
         * <p>*   **Public**: a public endpoint</p>
         * <p>*   **Private**: an internal endpoint</p>
         */
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        /**
         * <p>The description of the host.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The number of host accounts of the host.</p>
         */
        @NameInMap("HostAccountCount")
        public Integer hostAccountCount;

        /**
         * <p>The ID of the host.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The name of the host.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The internal endpoint of the host. You can set this parameter to a domain name or an IP address.</p>
         */
        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        /**
         * <p>The public endpoint of the host. You can set this parameter to a domain name or an IP address.</p>
         */
        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

        /**
         * <p>The operating system of the host. Valid values:</p>
         * <br>
         * <p>*   **Linux**</p>
         * <p>*   **Windows**</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The source of the host. Valid values:</p>
         * <br>
         * <p>*   **Local**: an on-premises host</p>
         * <p>*   **Ecs**: an Elastic Compute Service (ECS) instance</p>
         * <p>*   **Rds**: a host in a dedicated cluster</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The ID of the ECS instance or dedicated cluster host that was queried.</p>
         * <br>
         * <p>>  No value is returned for this parameter if the **Source** parameter is set to **Local**.</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The status of the host. Valid values:</p>
         * <br>
         * <p>- **Normal**: The host is normal.</p>
         * <br>
         * <p>- **Release**: The host is released.</p>
         */
        @NameInMap("SourceInstanceState")
        public String sourceInstanceState;

        public static ListHostsResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            ListHostsResponseBodyHosts self = new ListHostsResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public ListHostsResponseBodyHosts setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public ListHostsResponseBodyHosts setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListHostsResponseBodyHosts setHostAccountCount(Integer hostAccountCount) {
            this.hostAccountCount = hostAccountCount;
            return this;
        }
        public Integer getHostAccountCount() {
            return this.hostAccountCount;
        }

        public ListHostsResponseBodyHosts setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListHostsResponseBodyHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListHostsResponseBodyHosts setHostPrivateAddress(String hostPrivateAddress) {
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }
        public String getHostPrivateAddress() {
            return this.hostPrivateAddress;
        }

        public ListHostsResponseBodyHosts setHostPublicAddress(String hostPublicAddress) {
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
        }

        public ListHostsResponseBodyHosts setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public ListHostsResponseBodyHosts setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListHostsResponseBodyHosts setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListHostsResponseBodyHosts setSourceInstanceState(String sourceInstanceState) {
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

    }

}
