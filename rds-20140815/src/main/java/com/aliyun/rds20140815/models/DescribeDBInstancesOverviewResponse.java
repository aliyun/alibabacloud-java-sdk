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

    public DescribeDBInstancesOverviewResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesOverviewResponse setRegions(DescribeDBInstancesOverviewResponseRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeDBInstancesOverviewResponseRegions getRegions() {
        return this.regions;
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

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
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

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModels setInstanceModel(java.util.List<DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel> instanceModel) {
            this.instanceModel = instanceModel;
            return this;
        }
        public java.util.List<DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel> getInstanceModel() {
            return this.instanceModel;
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

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModel setInstanceDateType(String instanceDateType) {
            this.instanceDateType = instanceDateType;
            return this;
        }
        public String getInstanceDateType() {
            return this.instanceDateType;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModel setInstanceModels(DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModels instanceModels) {
            this.instanceModels = instanceModels;
            return this;
        }
        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModelInstanceModels getInstanceModels() {
            return this.instanceModels;
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

        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModels setTypeModel(java.util.List<DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModel> typeModel) {
            this.typeModel = typeModel;
            return this;
        }
        public java.util.List<DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModelsTypeModel> getTypeModel() {
            return this.typeModel;
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

        public DescribeDBInstancesOverviewResponseRegionsRegionModel setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModel setEngineCount(String engineCount) {
            this.engineCount = engineCount;
            return this;
        }
        public String getEngineCount() {
            return this.engineCount;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModel setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeDBInstancesOverviewResponseRegionsRegionModel setTypeModels(DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModels typeModels) {
            this.typeModels = typeModels;
            return this;
        }
        public DescribeDBInstancesOverviewResponseRegionsRegionModelTypeModels getTypeModels() {
            return this.typeModels;
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

        public DescribeDBInstancesOverviewResponseRegions setRegionModel(java.util.List<DescribeDBInstancesOverviewResponseRegionsRegionModel> regionModel) {
            this.regionModel = regionModel;
            return this;
        }
        public java.util.List<DescribeDBInstancesOverviewResponseRegionsRegionModel> getRegionModel() {
            return this.regionModel;
        }

    }

}
