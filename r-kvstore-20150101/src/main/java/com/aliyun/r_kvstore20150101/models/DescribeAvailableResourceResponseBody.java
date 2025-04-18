// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    /**
     * <p>Details about the zones.</p>
     */
    @NameInMap("AvailableZones")
    public DescribeAvailableResourceResponseBodyAvailableZones availableZones;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>493B7308-D9C2-55F6-B042-0313BD63****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setAvailableZones(DescribeAvailableResourceResponseBodyAvailableZones availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public DescribeAvailableResourceResponseBodyAvailableZones getAvailableZones() {
        return this.availableZones;
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AvailableResource extends TeaModel {
        /**
         * <p>The memory size of the instance. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The code of the instance type. If you want to view the code of an instance type, you can search for the code of the instance type in Help Center.</p>
         * 
         * <strong>example:</strong>
         * <p>redis.amber.logic.sharding.2g.8db.0rodb.24proxy.multithread</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The description of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>16 GB cluster instance with 8 nodes (1,920,000 queries per second and 240,000 connections)</p>
         */
        @NameInMap("InstanceClassRemark")
        public String instanceClassRemark;

        public static AvailableResource build(java.util.Map<String, ?> map) throws Exception {
            AvailableResource self = new AvailableResource();
            return TeaModel.build(map, self);
        }

        public AvailableResource setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public AvailableResource setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public AvailableResource setInstanceClassRemark(String instanceClassRemark) {
            this.instanceClassRemark = instanceClassRemark;
            return this;
        }
        public String getInstanceClassRemark() {
            return this.instanceClassRemark;
        }

    }

    public static class AvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        public java.util.List<AvailableResource> availableResource;

        public static AvailableResources build(java.util.Map<String, ?> map) throws Exception {
            AvailableResources self = new AvailableResources();
            return TeaModel.build(map, self);
        }

        public AvailableResources setAvailableResource(java.util.List<AvailableResource> availableResource) {
            this.availableResource = availableResource;
            return this;
        }
        public java.util.List<AvailableResource> getAvailableResource() {
            return this.availableResource;
        }

    }

    public static class SupportedNodeType extends TeaModel {
        /**
         * <p>The available instance types.</p>
         */
        @NameInMap("AvailableResources")
        public AvailableResources availableResources;

        /**
         * <p>The node type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>single</strong>: standalone</li>
         * <li><strong>double</strong>: master-replica</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>double</p>
         */
        @NameInMap("SupportedNodeType")
        public String supportedNodeType;

        public static SupportedNodeType build(java.util.Map<String, ?> map) throws Exception {
            SupportedNodeType self = new SupportedNodeType();
            return TeaModel.build(map, self);
        }

        public SupportedNodeType setAvailableResources(AvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public AvailableResources getAvailableResources() {
            return this.availableResources;
        }

        public SupportedNodeType setSupportedNodeType(String supportedNodeType) {
            this.supportedNodeType = supportedNodeType;
            return this;
        }
        public String getSupportedNodeType() {
            return this.supportedNodeType;
        }

    }

    public static class SupportedNodeTypes extends TeaModel {
        @NameInMap("SupportedNodeType")
        public java.util.List<SupportedNodeType> supportedNodeType;

        public static SupportedNodeTypes build(java.util.Map<String, ?> map) throws Exception {
            SupportedNodeTypes self = new SupportedNodeTypes();
            return TeaModel.build(map, self);
        }

        public SupportedNodeTypes setSupportedNodeType(java.util.List<SupportedNodeType> supportedNodeType) {
            this.supportedNodeType = supportedNodeType;
            return this;
        }
        public java.util.List<SupportedNodeType> getSupportedNodeType() {
            return this.supportedNodeType;
        }

    }

    public static class SupportedShardNumber extends TeaModel {
        /**
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ShardNumber")
        public String shardNumber;

        /**
         * <p>The supported node types.</p>
         */
        @NameInMap("SupportedNodeTypes")
        public SupportedNodeTypes supportedNodeTypes;

        public static SupportedShardNumber build(java.util.Map<String, ?> map) throws Exception {
            SupportedShardNumber self = new SupportedShardNumber();
            return TeaModel.build(map, self);
        }

        public SupportedShardNumber setShardNumber(String shardNumber) {
            this.shardNumber = shardNumber;
            return this;
        }
        public String getShardNumber() {
            return this.shardNumber;
        }

        public SupportedShardNumber setSupportedNodeTypes(SupportedNodeTypes supportedNodeTypes) {
            this.supportedNodeTypes = supportedNodeTypes;
            return this;
        }
        public SupportedNodeTypes getSupportedNodeTypes() {
            return this.supportedNodeTypes;
        }

    }

    public static class SupportedShardNumbers extends TeaModel {
        @NameInMap("SupportedShardNumber")
        public java.util.List<SupportedShardNumber> supportedShardNumber;

        public static SupportedShardNumbers build(java.util.Map<String, ?> map) throws Exception {
            SupportedShardNumbers self = new SupportedShardNumbers();
            return TeaModel.build(map, self);
        }

        public SupportedShardNumbers setSupportedShardNumber(java.util.List<SupportedShardNumber> supportedShardNumber) {
            this.supportedShardNumber = supportedShardNumber;
            return this;
        }
        public java.util.List<SupportedShardNumber> getSupportedShardNumber() {
            return this.supportedShardNumber;
        }

    }

    public static class SupportedArchitectureType extends TeaModel {
        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <ul>
         * <li><strong>standard</strong>: standard architecture</li>
         * <li><strong>cluster</strong>: cluster architecture</li>
         * <li><strong>rwsplit</strong>: read/write splitting architecture</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The numbers of available shards.</p>
         */
        @NameInMap("SupportedShardNumbers")
        public SupportedShardNumbers supportedShardNumbers;

        public static SupportedArchitectureType build(java.util.Map<String, ?> map) throws Exception {
            SupportedArchitectureType self = new SupportedArchitectureType();
            return TeaModel.build(map, self);
        }

        public SupportedArchitectureType setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public SupportedArchitectureType setSupportedShardNumbers(SupportedShardNumbers supportedShardNumbers) {
            this.supportedShardNumbers = supportedShardNumbers;
            return this;
        }
        public SupportedShardNumbers getSupportedShardNumbers() {
            return this.supportedShardNumbers;
        }

    }

    public static class SupportedArchitectureTypes extends TeaModel {
        @NameInMap("SupportedArchitectureType")
        public java.util.List<SupportedArchitectureType> supportedArchitectureType;

        public static SupportedArchitectureTypes build(java.util.Map<String, ?> map) throws Exception {
            SupportedArchitectureTypes self = new SupportedArchitectureTypes();
            return TeaModel.build(map, self);
        }

        public SupportedArchitectureTypes setSupportedArchitectureType(java.util.List<SupportedArchitectureType> supportedArchitectureType) {
            this.supportedArchitectureType = supportedArchitectureType;
            return this;
        }
        public java.util.List<SupportedArchitectureType> getSupportedArchitectureType() {
            return this.supportedArchitectureType;
        }

    }

    public static class SupportedEngineVersion extends TeaModel {
        /**
         * <p>The available architectures.</p>
         */
        @NameInMap("SupportedArchitectureTypes")
        public SupportedArchitectureTypes supportedArchitectureTypes;

        /**
         * <p>The engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static SupportedEngineVersion build(java.util.Map<String, ?> map) throws Exception {
            SupportedEngineVersion self = new SupportedEngineVersion();
            return TeaModel.build(map, self);
        }

        public SupportedEngineVersion setSupportedArchitectureTypes(SupportedArchitectureTypes supportedArchitectureTypes) {
            this.supportedArchitectureTypes = supportedArchitectureTypes;
            return this;
        }
        public SupportedArchitectureTypes getSupportedArchitectureTypes() {
            return this.supportedArchitectureTypes;
        }

        public SupportedEngineVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesTypeSupportedEngineVersions extends TeaModel {
        @NameInMap("SupportedEngineVersion")
        public java.util.List<SupportedEngineVersion> supportedEngineVersion;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesTypeSupportedEngineVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesTypeSupportedEngineVersions self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesTypeSupportedEngineVersions();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesTypeSupportedEngineVersions setSupportedEngineVersion(java.util.List<SupportedEngineVersion> supportedEngineVersion) {
            this.supportedEngineVersion = supportedEngineVersion;
            return this;
        }
        public java.util.List<SupportedEngineVersion> getSupportedEngineVersion() {
            return this.supportedEngineVersion;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesType extends TeaModel {
        /**
         * <p>The instance series. Valid values:</p>
         * <ul>
         * <li><strong>enhanced_performance_type</strong>: Tair (Enterprise Edition) DRAM-based instance</li>
         * <li><strong>hybrid_storage</strong>: Redis Open-Source Edition hybrid-storage instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enhanced_performance_type</p>
         */
        @NameInMap("SeriesType")
        public String seriesType;

        /**
         * <p>The available engine versions.</p>
         */
        @NameInMap("SupportedEngineVersions")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesTypeSupportedEngineVersions supportedEngineVersions;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesType self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesType();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesType setSeriesType(String seriesType) {
            this.seriesType = seriesType;
            return this;
        }
        public String getSeriesType() {
            return this.seriesType;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesType setSupportedEngineVersions(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesTypeSupportedEngineVersions supportedEngineVersions) {
            this.supportedEngineVersions = supportedEngineVersions;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesTypeSupportedEngineVersions getSupportedEngineVersions() {
            return this.supportedEngineVersions;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypes extends TeaModel {
        @NameInMap("SupportedSeriesType")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesType> supportedSeriesType;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypes self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypes setSupportedSeriesType(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesType> supportedSeriesType) {
            this.supportedSeriesType = supportedSeriesType;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypesSupportedSeriesType> getSupportedSeriesType() {
            return this.supportedSeriesType;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionType extends TeaModel {
        /**
         * <p>The edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Community</strong>: Community Edition</li>
         * <li><strong>Enterprise</strong>: Enhanced Edition (Tair)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enterprise</p>
         */
        @NameInMap("EditionType")
        public String editionType;

        /**
         * <p>The instance series types.</p>
         */
        @NameInMap("SupportedSeriesTypes")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypes supportedSeriesTypes;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionType self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionType();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionType setEditionType(String editionType) {
            this.editionType = editionType;
            return this;
        }
        public String getEditionType() {
            return this.editionType;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionType setSupportedSeriesTypes(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypes supportedSeriesTypes) {
            this.supportedSeriesTypes = supportedSeriesTypes;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionTypeSupportedSeriesTypes getSupportedSeriesTypes() {
            return this.supportedSeriesTypes;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypes extends TeaModel {
        @NameInMap("SupportedEditionType")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionType> supportedEditionType;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypes self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypes setSupportedEditionType(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionType> supportedEditionType) {
            this.supportedEditionType = supportedEditionType;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypesSupportedEditionType> getSupportedEditionType() {
            return this.supportedEditionType;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine extends TeaModel {
        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The instance edition types.</p>
         */
        @NameInMap("SupportedEditionTypes")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypes supportedEditionTypes;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine setSupportedEditionTypes(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypes supportedEditionTypes) {
            this.supportedEditionTypes = supportedEditionTypes;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEditionTypes getSupportedEditionTypes() {
            return this.supportedEditionTypes;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines extends TeaModel {
        @NameInMap("SupportedEngine")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine> supportedEngine;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines setSupportedEngine(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine> supportedEngine) {
            this.supportedEngine = supportedEngine;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine> getSupportedEngine() {
            return this.supportedEngine;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone extends TeaModel {
        /**
         * <p>An internal parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMainSale")
        public Boolean isMainSale;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The supported engines.</p>
         */
        @NameInMap("SupportedEngines")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines supportedEngines;

        /**
         * <p>The ID of the zone in which the instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The name of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou Zone H</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setIsMainSale(Boolean isMainSale) {
            this.isMainSale = isMainSale;
            return this;
        }
        public Boolean getIsMainSale() {
            return this.isMainSale;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setSupportedEngines(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines supportedEngines) {
            this.supportedEngines = supportedEngines;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines getSupportedEngines() {
            return this.supportedEngines;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone> availableZone;

        public static DescribeAvailableResourceResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZones self = new DescribeAvailableResourceResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZones setAvailableZone(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

}
