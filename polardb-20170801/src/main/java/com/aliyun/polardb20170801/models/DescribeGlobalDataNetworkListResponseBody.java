// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDataNetworkListResponseBody extends TeaModel {
    /**
     * <p>The details of the Global Data Networks (GDNs).</p>
     */
    @NameInMap("Items")
    public DescribeGlobalDataNetworkListResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
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
         * <p>The ID of the synchronization channel.</p>
         * 
         * <strong>example:</strong>
         * <p>gdc-xxx</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The status of the synchronization channel. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The channel is being created.</p>
         * </li>
         * <li><p><strong>Running</strong>: The channel is running.</p>
         * </li>
         * <li><p><strong>Syncing</strong>: The channel is synchronizing data.</p>
         * </li>
         * <li><p><strong>SyncFinished</strong>: Data synchronization is complete.</p>
         * </li>
         * <li><p><strong>SyncFailed</strong>: Data synchronization failed.</p>
         * </li>
         * <li><p><strong>SyncPartialFailed</strong>: Data synchronization partially failed.</p>
         * </li>
         * <li><p><strong>Stopped</strong>: The channel is stopped.</p>
         * </li>
         * <li><p><strong>Maintaining</strong>: The channel is under maintenance.</p>
         * </li>
         * <li><p><strong>Restarting</strong>: The channel is restarting.</p>
         * </li>
         * <li><p><strong>Locking</strong>: The channel is being locked.</p>
         * </li>
         * <li><p><strong>Locked</strong>: The channel is locked.</p>
         * </li>
         * <li><p><strong>Unlocking</strong>: The channel is being unlocked.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The channel is being deleted.</p>
         * </li>
         * <li><p><strong>Deleted</strong>: The channel is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Syncing</p>
         */
        @NameInMap("ChannelStatus")
        public String channelStatus;

        /**
         * <p>Indicates whether the source path is frozen during data transmission.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FreezeSourceDuringSync")
        public Boolean freezeSourceDuringSync;

        /**
         * <p>The synchronization progress.</p>
         * <blockquote>
         * <p>The value is a percentage that is accurate to two decimal places.</p>
         * </blockquote>
         * 
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
         * <p>The destination path.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("DestinationFileSystemPath")
        public String destinationFileSystemPath;

        /**
         * <p>Destination PolarDB instance</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <p>The region of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("DestinationRegion")
        public String destinationRegion;

        /**
         * <p>The type of the destination. Valid values:</p>
         * <ul>
         * <li><p><strong>pfs</strong>: Polarlakebase High-performance Edition.</p>
         * </li>
         * <li><p><strong>pcs</strong>: Polarlakebase Cold Storage Edition.</p>
         * </li>
         * </ul>
         * 
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
         * <p>The source path.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("SourceFileSystemPath")
        public String sourceFileSystemPath;

        /**
         * <p>The ID of the source Polarlakebase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pcs-xxx</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The region of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <p>The type of the source. Valid values:</p>
         * <ul>
         * <li><p><strong>pfs</strong>: Polarlakebase High-performance Edition.</p>
         * </li>
         * <li><p><strong>pcs</strong>: Polarlakebase Cold Storage Edition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pcs</p>
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
        /**
         * <p>The synchronization destinations.</p>
         */
        @NameInMap("Destinations")
        public java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksNetworkTopologyDestinations> destinations;

        /**
         * <p>The synchronization sources.</p>
         */
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
        /**
         * <p>The synchronization channels.</p>
         */
        @NameInMap("Channels")
        public java.util.List<DescribeGlobalDataNetworkListResponseBodyItemsNetworksChannels> channels;

        /**
         * <p>The time when the GDN was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-25T09:37:10Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the GDN.</p>
         * 
         * <strong>example:</strong>
         * <p>mygdn</p>
         */
        @NameInMap("NetworkDescription")
        public String networkDescription;

        /**
         * <p>The ID of the GDN.</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-xxx</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The status of the GDN. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The GDN is being created.</p>
         * </li>
         * <li><p><strong>Running</strong>: The GDN is running.</p>
         * </li>
         * <li><p><strong>Syncing</strong>: The GDN is synchronizing data.</p>
         * </li>
         * <li><p><strong>SyncFinished</strong>: Data synchronization is complete.</p>
         * </li>
         * <li><p><strong>SyncFailed</strong>: Data synchronization failed.</p>
         * </li>
         * <li><p><strong>SyncPartialFailed</strong>: Data synchronization partially failed.</p>
         * </li>
         * <li><p><strong>Stopped</strong>: The GDN is stopped.</p>
         * </li>
         * <li><p><strong>Maintaining</strong>: The GDN is under maintenance.</p>
         * </li>
         * <li><p><strong>Restarting</strong>: The GDN is restarting.</p>
         * </li>
         * <li><p><strong>Locking</strong>: The GDN is being locked.</p>
         * </li>
         * <li><p><strong>Locked</strong>: The GDN is locked.</p>
         * </li>
         * <li><p><strong>Unlocking</strong>: The GDN is being unlocked.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The GDN is being deleted.</p>
         * </li>
         * <li><p><strong>Deleted</strong>: The GDN is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("NetworkStatus")
        public String networkStatus;

        /**
         * <p>The network topology of the GDN.</p>
         */
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
        /**
         * <p>The list of GDN networks.</p>
         */
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
