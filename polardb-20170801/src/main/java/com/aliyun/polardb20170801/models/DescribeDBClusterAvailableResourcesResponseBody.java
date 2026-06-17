// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAvailableResourcesResponseBody extends TeaModel {
    /**
     * <p>The list of available resources.</p>
     */
    @NameInMap("AvailableZones")
    public java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZones> availableZones;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2B19F698-8FFC-4918-B9E2-58D878******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterAvailableResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAvailableResourcesResponseBody self = new DescribeDBClusterAvailableResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAvailableResourcesResponseBody setAvailableZones(java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    public DescribeDBClusterAvailableResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEnginesAvailableResources extends TeaModel {
        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Cluster Edition.</p>
         * </li>
         * <li><p><strong>Basic</strong>: Single Node Edition.</p>
         * </li>
         * <li><p><strong>ArchiveNormal</strong>: X-Engine.</p>
         * </li>
         * <li><p><strong>NormalMultimaster</strong>: Multi-master Cluster (Database/Table) Edition.</p>
         * </li>
         * <li><p><strong>SENormal</strong>: Standard Edition.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>Only PolarDB for MySQL supports Single Node Edition.</p>
         * </li>
         * <li><p>Only PolarDB for MySQL 8.0 supports X-Engine Edition and Multi-master Cluster (Database/Table) Edition.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The specifications of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        public static DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEnginesAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEnginesAvailableResources self = new DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEnginesAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEnginesAvailableResources setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEnginesAvailableResources setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

    }

    public static class DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEngines extends TeaModel {
        /**
         * <p>The available resources.</p>
         */
        @NameInMap("AvailableResources")
        public java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEnginesAvailableResources> availableResources;

        /**
         * <p>The version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql57</p>
         */
        @NameInMap("Engine")
        public String engine;

        public static DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEngines self = new DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEngines();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEngines setAvailableResources(java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEnginesAvailableResources> availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEnginesAvailableResources> getAvailableResources() {
            return this.availableResources;
        }

        public DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEngines setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

    }

    public static class DescribeDBClusterAvailableResourcesResponseBodyAvailableZones extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of available engines.</p>
         */
        @NameInMap("SupportedEngines")
        public java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEngines> supportedEngines;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBClusterAvailableResourcesResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAvailableResourcesResponseBodyAvailableZones self = new DescribeDBClusterAvailableResourcesResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAvailableResourcesResponseBodyAvailableZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClusterAvailableResourcesResponseBodyAvailableZones setSupportedEngines(java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEngines> supportedEngines) {
            this.supportedEngines = supportedEngines;
            return this;
        }
        public java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEngines> getSupportedEngines() {
            return this.supportedEngines;
        }

        public DescribeDBClusterAvailableResourcesResponseBodyAvailableZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
