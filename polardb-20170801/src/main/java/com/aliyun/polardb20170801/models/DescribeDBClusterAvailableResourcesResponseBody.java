// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAvailableResourcesResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    public java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZones> availableZones;

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
        @NameInMap("Category")
        public String category;

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
        @NameInMap("AvailableResources")
        public java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEnginesAvailableResources> availableResources;

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
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SupportedEngines")
        public java.util.List<DescribeDBClusterAvailableResourcesResponseBodyAvailableZonesSupportedEngines> supportedEngines;

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
