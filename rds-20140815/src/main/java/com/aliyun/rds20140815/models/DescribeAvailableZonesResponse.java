// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableZonesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AvailableZones")
    @Validation(required = true)
    public java.util.List<DescribeAvailableZonesResponseAvailableZones> availableZones;

    public static DescribeAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableZonesResponse self = new DescribeAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableZonesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableZonesResponse setAvailableZones(java.util.List<DescribeAvailableZonesResponseAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<DescribeAvailableZonesResponseAvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    public static class DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes extends TeaModel {
        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        public static DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes self = new DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("SupportedStorageTypes")
        @Validation(required = true)
        public java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes> supportedStorageTypes;

        public static DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys self = new DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys setSupportedStorageTypes(java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes> supportedStorageTypes) {
            this.supportedStorageTypes = supportedStorageTypes;
            return this;
        }
        public java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes> getSupportedStorageTypes() {
            return this.supportedStorageTypes;
        }

    }

    public static class DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersions extends TeaModel {
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("SupportedCategorys")
        @Validation(required = true)
        public java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys> supportedCategorys;

        public static DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersions self = new DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersions();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersions setSupportedCategorys(java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys> supportedCategorys) {
            this.supportedCategorys = supportedCategorys;
            return this;
        }
        public java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorys> getSupportedCategorys() {
            return this.supportedCategorys;
        }

    }

    public static class DescribeAvailableZonesResponseAvailableZonesSupportedEngines extends TeaModel {
        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("SupportedEngineVersions")
        @Validation(required = true)
        public java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersions> supportedEngineVersions;

        public static DescribeAvailableZonesResponseAvailableZonesSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseAvailableZonesSupportedEngines self = new DescribeAvailableZonesResponseAvailableZonesSupportedEngines();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseAvailableZonesSupportedEngines setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeAvailableZonesResponseAvailableZonesSupportedEngines setSupportedEngineVersions(java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersions> supportedEngineVersions) {
            this.supportedEngineVersions = supportedEngineVersions;
            return this;
        }
        public java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersions> getSupportedEngineVersions() {
            return this.supportedEngineVersions;
        }

    }

    public static class DescribeAvailableZonesResponseAvailableZones extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("NetworkTypes")
        @Validation(required = true)
        public String networkTypes;

        @NameInMap("SupportedEngines")
        @Validation(required = true)
        public java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEngines> supportedEngines;

        public static DescribeAvailableZonesResponseAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseAvailableZones self = new DescribeAvailableZonesResponseAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseAvailableZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAvailableZonesResponseAvailableZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAvailableZonesResponseAvailableZones setNetworkTypes(String networkTypes) {
            this.networkTypes = networkTypes;
            return this;
        }
        public String getNetworkTypes() {
            return this.networkTypes;
        }

        public DescribeAvailableZonesResponseAvailableZones setSupportedEngines(java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEngines> supportedEngines) {
            this.supportedEngines = supportedEngines;
            return this;
        }
        public java.util.List<DescribeAvailableZonesResponseAvailableZonesSupportedEngines> getSupportedEngines() {
            return this.supportedEngines;
        }

    }

}
