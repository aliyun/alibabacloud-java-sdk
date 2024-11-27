// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationHostsResponseBody extends TeaModel {
    /**
     * <p>The hosts returned.</p>
     */
    @NameInMap("Hosts")
    public java.util.List<ListOperationHostsResponseBodyHosts> hosts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F6C075F-FC86-476E-943B-097BD4E12948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of hosts returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        /**
         * <p>The address type of the host. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong></li>
         * <li><strong>Private</strong></li>
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
         * <p>The host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The host name.</p>
         * 
         * <strong>example:</strong>
         * <p>host1</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The private IP address of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        /**
         * <p>The public IP address of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>10.158.XX.XX</p>
         */
        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

        /**
         * <p>The host OS.</p>
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

        /**
         * <p>The host type. Valid values:</p>
         * <ul>
         * <li><strong>Local</strong>: on-premises host.</li>
         * <li><strong>Ecs</strong>: Elastic Compute Service (ECS) instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The ECS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp19ienyt0yax748****</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The host status. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>Release</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
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
