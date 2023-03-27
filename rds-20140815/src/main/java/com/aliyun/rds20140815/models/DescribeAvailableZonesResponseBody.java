// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableZonesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of available zones and resources available in the zones.</p>
     */
    @NameInMap("AvailableZones")
    public java.util.List<DescribeAvailableZonesResponseBodyAvailableZones> availableZones;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableZonesResponseBody self = new DescribeAvailableZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableZonesResponseBody setAvailableZones(java.util.List<DescribeAvailableZonesResponseBodyAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<DescribeAvailableZonesResponseBodyAvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    public DescribeAvailableZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes extends TeaModel {
        /**
         * <p>The storage type of the instance.</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes self = new DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys extends TeaModel {
        /**
         * <p>The RDS edition of the instance.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>An array that consists of the storage types available in the zone.</p>
         */
        @NameInMap("SupportedStorageTypes")
        public java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes> supportedStorageTypes;

        public static DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys self = new DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys setSupportedStorageTypes(java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes> supportedStorageTypes) {
            this.supportedStorageTypes = supportedStorageTypes;
            return this;
        }
        public java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes> getSupportedStorageTypes() {
            return this.supportedStorageTypes;
        }

    }

    public static class DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersions extends TeaModel {
        /**
         * <p>An array that consists of the RDS editions available in the zone.</p>
         */
        @NameInMap("SupportedCategorys")
        public java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys> supportedCategorys;

        /**
         * <p>The database engine version of the instance.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersions self = new DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersions();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersions setSupportedCategorys(java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys> supportedCategorys) {
            this.supportedCategorys = supportedCategorys;
            return this;
        }
        public java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys> getSupportedCategorys() {
            return this.supportedCategorys;
        }

        public DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAvailableZonesResponseBodyAvailableZonesSupportedEngines extends TeaModel {
        /**
         * <p>The database engine of the instance.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>An array that consists of the database engine versions available in the zone.</p>
         */
        @NameInMap("SupportedEngineVersions")
        public java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersions> supportedEngineVersions;

        public static DescribeAvailableZonesResponseBodyAvailableZonesSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseBodyAvailableZonesSupportedEngines self = new DescribeAvailableZonesResponseBodyAvailableZonesSupportedEngines();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseBodyAvailableZonesSupportedEngines setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeAvailableZonesResponseBodyAvailableZonesSupportedEngines setSupportedEngineVersions(java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersions> supportedEngineVersions) {
            this.supportedEngineVersions = supportedEngineVersions;
            return this;
        }
        public java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEnginesSupportedEngineVersions> getSupportedEngineVersions() {
            return this.supportedEngineVersions;
        }

    }

    public static class DescribeAvailableZonesResponseBodyAvailableZones extends TeaModel {
        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>An array that consists of the database engines available in the zone.</p>
         */
        @NameInMap("SupportedEngines")
        public java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEngines> supportedEngines;

        /**
         * <p>The zone ID of the instance.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAvailableZonesResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseBodyAvailableZones self = new DescribeAvailableZonesResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseBodyAvailableZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAvailableZonesResponseBodyAvailableZones setSupportedEngines(java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEngines> supportedEngines) {
            this.supportedEngines = supportedEngines;
            return this;
        }
        public java.util.List<DescribeAvailableZonesResponseBodyAvailableZonesSupportedEngines> getSupportedEngines() {
            return this.supportedEngines;
        }

        public DescribeAvailableZonesResponseBodyAvailableZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
