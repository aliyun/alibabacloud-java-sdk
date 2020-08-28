// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesOverviewResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Regions")
    @Validation(required = true)
    public DescribeDBInstancesOverviewResponseRegions regions;

    public static DescribeDBInstancesOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesOverviewResponse self = new DescribeDBInstancesOverviewResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("CreatedTime")
        @Validation(required = true)
        public String createdTime;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("LockMode")
        @Validation(required = true)
        public String lockMode;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public String DBInstanceStatus;

        public static DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel self = new DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModels extends TeaModel {
        @NameInMap("InstanceModel")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel> instanceModel;

        public static DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModels self = new DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModels();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModel extends TeaModel {
        @NameInMap("InstanceDateType")
        @Validation(required = true)
        public String instanceDateType;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("InstanceModels")
        @Validation(required = true)
        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModels instanceModels;

        public static DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModel self = new DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModel();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModels extends TeaModel {
        @NameInMap("TypeModel")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModel> typeModel;

        public static DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModels self = new DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModels();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesOverviewResponseRegionsRegionModel extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("EngineCount")
        @Validation(required = true)
        public String engineCount;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TypeModels")
        @Validation(required = true)
        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModels typeModels;

        public static DescribeDBInstancesOverviewResponseRegionsRegionModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesOverviewResponseRegionsRegionModel self = new DescribeDBInstancesOverviewResponseRegionsRegionModel();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesOverviewResponseRegions extends TeaModel {
        @NameInMap("RegionModel")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesOverviewResponseRegionsRegionModel> regionModel;

        public static DescribeDBInstancesOverviewResponseRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesOverviewResponseRegions self = new DescribeDBInstancesOverviewResponseRegions();
            return TeaModel.build(map, self);
        }

    }

}
