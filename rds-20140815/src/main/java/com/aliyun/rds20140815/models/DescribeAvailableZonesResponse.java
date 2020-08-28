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

    public static class DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes extends TeaModel {
        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        public static DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes self = new DescribeAvailableZonesResponseAvailableZonesSupportedEnginesSupportedEngineVersionsSupportedCategorysSupportedStorageTypes();
            return TeaModel.build(map, self);
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

    }

}
