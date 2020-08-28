// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AvailableZones")
    @Validation(required = true)
    public DescribeAvailableResourceResponseAvailableZones availableZones;

    public static DescribeAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponse self = new DescribeAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResourcesAvailableResourceDBInstanceStorageRange extends TeaModel {
        @NameInMap("Max")
        @Validation(required = true)
        public Integer max;

        @NameInMap("Min")
        @Validation(required = true)
        public Integer min;

        @NameInMap("Step")
        @Validation(required = true)
        public Integer step;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResourcesAvailableResourceDBInstanceStorageRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResourcesAvailableResourceDBInstanceStorageRange self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResourcesAvailableResourceDBInstanceStorageRange();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResourcesAvailableResource extends TeaModel {
        @NameInMap("DBInstanceClass")
        @Validation(required = true)
        public String DBInstanceClass;

        @NameInMap("StorageRange")
        @Validation(required = true)
        public String storageRange;

        @NameInMap("DBInstanceStorageRange")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResourcesAvailableResourceDBInstanceStorageRange DBInstanceStorageRange;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResourcesAvailableResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResourcesAvailableResource self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResourcesAvailableResource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResourcesAvailableResource> availableResource;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResources self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResources();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageType extends TeaModel {
        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("AvailableResources")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageTypeAvailableResources availableResources;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageType self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypes extends TeaModel {
        @NameInMap("SupportedStorageType")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypesSupportedStorageType> supportedStorageType;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypes self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategory extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("SupportedStorageTypes")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategorySupportedStorageTypes supportedStorageTypes;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategory build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategory self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategory();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorys extends TeaModel {
        @NameInMap("SupportedCategory")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorysSupportedCategory> supportedCategory;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorys self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorys();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion extends TeaModel {
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("SupportedCategorys")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategorys supportedCategorys;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions extends TeaModel {
        @NameInMap("SupportedEngineVersion")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion> supportedEngineVersion;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngine extends TeaModel {
        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("SupportedEngineVersions")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions supportedEngineVersions;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngine build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngine self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngine();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEngines extends TeaModel {
        @NameInMap("SupportedEngine")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEnginesSupportedEngine> supportedEngine;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEngines self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEngines();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZone extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("NetworkTypes")
        @Validation(required = true)
        public String networkTypes;

        @NameInMap("SupportedEngines")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneSupportedEngines supportedEngines;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZone self = new DescribeAvailableResourceResponseAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZone> availableZone;

        public static DescribeAvailableResourceResponseAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZones self = new DescribeAvailableResourceResponseAvailableZones();
            return TeaModel.build(map, self);
        }

    }

}
