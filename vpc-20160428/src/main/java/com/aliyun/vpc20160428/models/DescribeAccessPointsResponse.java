// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("AccessPointSet")
    @Validation(required = true)
    public DescribeAccessPointsResponseAccessPointSet accessPointSet;

    public static DescribeAccessPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointsResponse self = new DescribeAccessPointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessPointsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessPointsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessPointsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessPointsResponse setAccessPointSet(DescribeAccessPointsResponseAccessPointSet accessPointSet) {
        this.accessPointSet = accessPointSet;
        return this;
    }
    public DescribeAccessPointsResponseAccessPointSet getAccessPointSet() {
        return this.accessPointSet;
    }

    public static class DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel extends TeaModel {
        @NameInMap("FeatureKey")
        @Validation(required = true)
        public String featureKey;

        @NameInMap("FeatureValue")
        @Validation(required = true)
        public String featureValue;

        public static DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel self = new DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel setFeatureKey(String featureKey) {
            this.featureKey = featureKey;
            return this;
        }
        public String getFeatureKey() {
            return this.featureKey;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel setFeatureValue(String featureValue) {
            this.featureValue = featureValue;
            return this;
        }
        public String getFeatureValue() {
            return this.featureValue;
        }

    }

    public static class DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModels extends TeaModel {
        @NameInMap("AccessPointFeatureModel")
        @Validation(required = true)
        public java.util.List<DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel> accessPointFeatureModel;

        public static DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModels self = new DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModels();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModels setAccessPointFeatureModel(java.util.List<DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel> accessPointFeatureModel) {
            this.accessPointFeatureModel = accessPointFeatureModel;
            return this;
        }
        public java.util.List<DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel> getAccessPointFeatureModel() {
            return this.accessPointFeatureModel;
        }

    }

    public static class DescribeAccessPointsResponseAccessPointSetAccessPointType extends TeaModel {
        @NameInMap("AccessPointId")
        @Validation(required = true)
        public String accessPointId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("AttachedRegionNo")
        @Validation(required = true)
        public String attachedRegionNo;

        @NameInMap("Location")
        @Validation(required = true)
        public String location;

        @NameInMap("HostOperator")
        @Validation(required = true)
        public String hostOperator;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("AccessPointFeatureModels")
        @Validation(required = true)
        public DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModels accessPointFeatureModels;

        public static DescribeAccessPointsResponseAccessPointSetAccessPointType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseAccessPointSetAccessPointType self = new DescribeAccessPointsResponseAccessPointSetAccessPointType();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setAttachedRegionNo(String attachedRegionNo) {
            this.attachedRegionNo = attachedRegionNo;
            return this;
        }
        public String getAttachedRegionNo() {
            return this.attachedRegionNo;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setHostOperator(String hostOperator) {
            this.hostOperator = hostOperator;
            return this;
        }
        public String getHostOperator() {
            return this.hostOperator;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setAccessPointFeatureModels(DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModels accessPointFeatureModels) {
            this.accessPointFeatureModels = accessPointFeatureModels;
            return this;
        }
        public DescribeAccessPointsResponseAccessPointSetAccessPointTypeAccessPointFeatureModels getAccessPointFeatureModels() {
            return this.accessPointFeatureModels;
        }

    }

    public static class DescribeAccessPointsResponseAccessPointSet extends TeaModel {
        @NameInMap("AccessPointType")
        @Validation(required = true)
        public java.util.List<DescribeAccessPointsResponseAccessPointSetAccessPointType> accessPointType;

        public static DescribeAccessPointsResponseAccessPointSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseAccessPointSet self = new DescribeAccessPointsResponseAccessPointSet();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseAccessPointSet setAccessPointType(java.util.List<DescribeAccessPointsResponseAccessPointSetAccessPointType> accessPointType) {
            this.accessPointType = accessPointType;
            return this;
        }
        public java.util.List<DescribeAccessPointsResponseAccessPointSetAccessPointType> getAccessPointType() {
            return this.accessPointType;
        }

    }

}
