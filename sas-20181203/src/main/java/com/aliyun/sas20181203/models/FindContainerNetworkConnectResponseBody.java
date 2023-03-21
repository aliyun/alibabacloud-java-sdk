// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FindContainerNetworkConnectResponseBody extends TeaModel {
    @NameInMap("Connects")
    public java.util.List<FindContainerNetworkConnectResponseBodyConnects> connects;

    @NameInMap("PageInfo")
    public FindContainerNetworkConnectResponseBodyPageInfo pageInfo;

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
        @NameInMap("DstContainer")
        public FindContainerNetworkConnectResponseBodyConnectsDstContainer dstContainer;

        @NameInMap("DstIp")
        public String dstIp;

        @NameInMap("DstPort")
        public String dstPort;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("SrcContainer")
        public FindContainerNetworkConnectResponseBodyConnectsSrcContainer srcContainer;

        @NameInMap("SrcIp")
        public String srcIp;

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
        @NameInMap("Count")
        public Long count;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

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
