// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDataNetworkListResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeGlobalDataNetworkListResponseBodyItems items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeGlobalDataNetworkListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDataNetworkListResponseBody self = new DescribeGlobalDataNetworkListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDataNetworkListResponseBody setItems(DescribeGlobalDataNetworkListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeGlobalDataNetworkListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeGlobalDataNetworkListResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGlobalDataNetworkListResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeGlobalDataNetworkListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalDataNetworkListResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gdc-xxx</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>Syncing</p>
         */
        @NameInMap("ChannelStatus")
        public String channelStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FreezeSourceDuringSync")
        public Boolean freezeSourceDuringSync;

        /**
         * <strong>example:</strong>
         * <p>11.45%</p>
         */
        @NameInMap("Progress")
        public String progress;

        public static DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels self = new DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels setChannelStatus(String channelStatus) {
            this.channelStatus = channelStatus;
            return this;
        }
        public String getChannelStatus() {
            return this.channelStatus;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels setFreezeSourceDuringSync(Boolean freezeSourceDuringSync) {
            this.freezeSourceDuringSync = freezeSourceDuringSync;
            return this;
        }
        public Boolean getFreezeSourceDuringSync() {
            return this.freezeSourceDuringSync;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("DestinationFileSystemPath")
        public String destinationFileSystemPath;

        /**
         * <strong>example:</strong>
         * <p>pfs-xxx</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("DestinationRegion")
        public String destinationRegion;

        /**
         * <strong>example:</strong>
         * <p>pfs</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        public static DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations self = new DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations setDestinationFileSystemPath(String destinationFileSystemPath) {
            this.destinationFileSystemPath = destinationFileSystemPath;
            return this;
        }
        public String getDestinationFileSystemPath() {
            return this.destinationFileSystemPath;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations setDestinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public String getDestinationId() {
            return this.destinationId;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations setDestinationRegion(String destinationRegion) {
            this.destinationRegion = destinationRegion;
            return this;
        }
        public String getDestinationRegion() {
            return this.destinationRegion;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

    }

    public static class DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("SourceFileSystemPath")
        public String sourceFileSystemPath;

        /**
         * <strong>example:</strong>
         * <p>oss-xxx</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources self = new DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources setSourceFileSystemPath(String sourceFileSystemPath) {
            this.sourceFileSystemPath = sourceFileSystemPath;
            return this;
        }
        public String getSourceFileSystemPath() {
            return this.sourceFileSystemPath;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopology extends TeaModel {
        @NameInMap("Destinations")
        public java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations> destinations;

        @NameInMap("Sources")
        public java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources> sources;

        public static DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopology build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopology self = new DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopology();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopology setDestinations(java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations> destinations) {
            this.destinations = destinations;
            return this;
        }
        public java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations> getDestinations() {
            return this.destinations;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopology setSources(java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologySources> getSources() {
            return this.sources;
        }

    }

    public static class DescribeGlobalDataNetworkListResponseBodyItemsNetworks extends TeaModel {
        @NameInMap("Channels")
        public java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels> channels;

        /**
         * <strong>example:</strong>
         * <p>2025-03-25T09:37:10Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>mygdn</p>
         */
        @NameInMap("NetworkDescription")
        public String networkDescription;

        /**
         * <p>GDN ID</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-xxx</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("NetworkStatus")
        public String networkStatus;

        @NameInMap("NetworkTopology")
        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopology networkTopology;

        public static DescribeGlobalDataNetworkListResponseBodyItemsNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDataNetworkListResponseBodyItemsNetworks self = new DescribeGlobalDataNetworkListResponseBodyItemsNetworks();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworks setChannels(java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels> getChannels() {
            return this.channels;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworks setNetworkDescription(String networkDescription) {
            this.networkDescription = networkDescription;
            return this;
        }
        public String getNetworkDescription() {
            return this.networkDescription;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworks setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworks setNetworkStatus(String networkStatus) {
            this.networkStatus = networkStatus;
            return this;
        }
        public String getNetworkStatus() {
            return this.networkStatus;
        }

        public DescribeGlobalDataNetworkListResponseBodyItemsNetworks setNetworkTopology(DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopology networkTopology) {
            this.networkTopology = networkTopology;
            return this;
        }
        public DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopology getNetworkTopology() {
            return this.networkTopology;
        }

    }

    public static class DescribeGlobalDataNetworkListResponseBodyItems extends TeaModel {
        @NameInMap("Networks")
        public java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworks> networks;

        public static DescribeGlobalDataNetworkListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDataNetworkListResponseBodyItems self = new DescribeGlobalDataNetworkListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDataNetworkListResponseBodyItems setNetworks(java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworks> networks) {
            this.networks = networks;
            return this;
        }
        public java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworks> getNetworks() {
            return this.networks;
        }

    }

}
