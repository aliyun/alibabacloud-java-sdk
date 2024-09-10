// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FindContainerNetworkConnectResponseBody extends TeaModel {
    /**
     * <p>The information about the network connections.</p>
     */
    @NameInMap("Connects")
    public java.util.List<FindContainerNetworkConnectResponseBodyConnects> connects;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public FindContainerNetworkConnectResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8686CE6E-9BFA-5436-A9D9-77B984AEE7F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FindContainerNetworkConnectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindContainerNetworkConnectResponseBody self = new FindContainerNetworkConnectResponseBody();
        return TeaModel.build(map, self);
    }

    public FindContainerNetworkConnectResponseBody setConnects(java.util.List<FindContainerNetworkConnectResponseBodyConnects> connects) {
        this.connects = connects;
        return this;
    }
    public java.util.List<FindContainerNetworkConnectResponseBodyConnects> getConnects() {
        return this.connects;
    }

    public FindContainerNetworkConnectResponseBody setPageInfo(FindContainerNetworkConnectResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public FindContainerNetworkConnectResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public FindContainerNetworkConnectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FindContainerNetworkConnectResponseBodyConnectsDstContainer extends TeaModel {
        /**
         * <p>The ID of the destination container.</p>
         * 
         * <strong>example:</strong>
         * <p>48a6dxxx9d5a5866</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        public static FindContainerNetworkConnectResponseBodyConnectsDstContainer build(java.util.Map<String, ?> map) throws Exception {
            FindContainerNetworkConnectResponseBodyConnectsDstContainer self = new FindContainerNetworkConnectResponseBodyConnectsDstContainer();
            return TeaModel.build(map, self);
        }

        public FindContainerNetworkConnectResponseBodyConnectsDstContainer setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

    }

    public static class FindContainerNetworkConnectResponseBodyConnectsSrcContainer extends TeaModel {
        /**
         * <p>The ID of the source container.</p>
         * 
         * <strong>example:</strong>
         * <p>48a6xxx5709d5a5866</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        public static FindContainerNetworkConnectResponseBodyConnectsSrcContainer build(java.util.Map<String, ?> map) throws Exception {
            FindContainerNetworkConnectResponseBodyConnectsSrcContainer self = new FindContainerNetworkConnectResponseBodyConnectsSrcContainer();
            return TeaModel.build(map, self);
        }

        public FindContainerNetworkConnectResponseBodyConnectsSrcContainer setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

    }

    public static class FindContainerNetworkConnectResponseBodyConnects extends TeaModel {
        /**
         * <p>The information about the destination container.</p>
         * <blockquote>
         * <p>This parameter is not supported.</p>
         * </blockquote>
         */
        @NameInMap("DstContainer")
        public FindContainerNetworkConnectResponseBodyConnectsDstContainer dstContainer;

        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.62.176</p>
         */
        @NameInMap("DstIp")
        public String dstIp;

        /**
         * <p>The destination port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("DstPort")
        public String dstPort;

        /**
         * <p>The timestamp when the connection was first established.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-11 20:54:32</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <p>The ID of the network connection.</p>
         * 
         * <strong>example:</strong>
         * <p>1458</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The timestamp when the connection was last established.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-24 10:26:00</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>The information about the source container.</p>
         * <blockquote>
         * <p>This parameter is not supported.</p>
         * </blockquote>
         */
        @NameInMap("SrcContainer")
        public FindContainerNetworkConnectResponseBodyConnectsSrcContainer srcContainer;

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>35.233.62.116</p>
         */
        @NameInMap("SrcIp")
        public String srcIp;

        /**
         * <p>The source port.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("SrcPort")
        public String srcPort;

        public static FindContainerNetworkConnectResponseBodyConnects build(java.util.Map<String, ?> map) throws Exception {
            FindContainerNetworkConnectResponseBodyConnects self = new FindContainerNetworkConnectResponseBodyConnects();
            return TeaModel.build(map, self);
        }

        public FindContainerNetworkConnectResponseBodyConnects setDstContainer(FindContainerNetworkConnectResponseBodyConnectsDstContainer dstContainer) {
            this.dstContainer = dstContainer;
            return this;
        }
        public FindContainerNetworkConnectResponseBodyConnectsDstContainer getDstContainer() {
            return this.dstContainer;
        }

        public FindContainerNetworkConnectResponseBodyConnects setDstIp(String dstIp) {
            this.dstIp = dstIp;
            return this;
        }
        public String getDstIp() {
            return this.dstIp;
        }

        public FindContainerNetworkConnectResponseBodyConnects setDstPort(String dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public String getDstPort() {
            return this.dstPort;
        }

        public FindContainerNetworkConnectResponseBodyConnects setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public FindContainerNetworkConnectResponseBodyConnects setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindContainerNetworkConnectResponseBodyConnects setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public FindContainerNetworkConnectResponseBodyConnects setSrcContainer(FindContainerNetworkConnectResponseBodyConnectsSrcContainer srcContainer) {
            this.srcContainer = srcContainer;
            return this;
        }
        public FindContainerNetworkConnectResponseBodyConnectsSrcContainer getSrcContainer() {
            return this.srcContainer;
        }

        public FindContainerNetworkConnectResponseBodyConnects setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

        public FindContainerNetworkConnectResponseBodyConnects setSrcPort(String srcPort) {
            this.srcPort = srcPort;
            return this;
        }
        public String getSrcPort() {
            return this.srcPort;
        }

    }

    public static class FindContainerNetworkConnectResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Long currentPage;

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static FindContainerNetworkConnectResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            FindContainerNetworkConnectResponseBodyPageInfo self = new FindContainerNetworkConnectResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public FindContainerNetworkConnectResponseBodyPageInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public FindContainerNetworkConnectResponseBodyPageInfo setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public FindContainerNetworkConnectResponseBodyPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public FindContainerNetworkConnectResponseBodyPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
