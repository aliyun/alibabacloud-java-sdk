// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsResponseBody extends TeaModel {
    /**
     * <p>The information about the access point.</p>
     */
    @NameInMap("AccessPointSet")
    public DescribeAccessPointsResponseBodyAccessPointSet accessPointSet;

    /**
     * <p>The number of the returned page. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAccessPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointsResponseBody self = new DescribeAccessPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointsResponseBody setAccessPointSet(DescribeAccessPointsResponseBodyAccessPointSet accessPointSet) {
        this.accessPointSet = accessPointSet;
        return this;
    }
    public DescribeAccessPointsResponseBodyAccessPointSet getAccessPointSet() {
        return this.accessPointSet;
    }

    public DescribeAccessPointsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessPointsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel extends TeaModel {
        /**
         * <p>The feature of the access point.</p>
         */
        @NameInMap("FeatureKey")
        public String featureKey;

        /**
         * <p>The feature value of the access point.</p>
         */
        @NameInMap("FeatureValue")
        public String featureValue;

        public static DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel self = new DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel setFeatureKey(String featureKey) {
            this.featureKey = featureKey;
            return this;
        }
        public String getFeatureKey() {
            return this.featureKey;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel setFeatureValue(String featureValue) {
            this.featureValue = featureValue;
            return this;
        }
        public String getFeatureValue() {
            return this.featureValue;
        }

    }

    public static class DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels extends TeaModel {
        @NameInMap("AccessPointFeatureModel")
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel> accessPointFeatureModel;

        public static DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels self = new DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels setAccessPointFeatureModel(java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel> accessPointFeatureModel) {
            this.accessPointFeatureModel = accessPointFeatureModel;
            return this;
        }
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel> getAccessPointFeatureModel() {
            return this.accessPointFeatureModel;
        }

    }

    public static class DescribeAccessPointsResponseBodyAccessPointSetAccessPointType extends TeaModel {
        /**
         * <p>The feature model of the access point.</p>
         */
        @NameInMap("AccessPointFeatureModels")
        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels accessPointFeatureModels;

        /**
         * <p>The ID of the access point.</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The region ID of the access point.</p>
         */
        @NameInMap("AttachedRegionNo")
        public String attachedRegionNo;

        /**
         * <p>The description of the access point.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The colocation provider of the access point.</p>
         */
        @NameInMap("HostOperator")
        public String hostOperator;

        /**
         * <p>The location of the access point.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the access point.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the access point. Valid values:</p>
         * <br>
         * <p>*   **Recommended**: The access point is ready for use.</p>
         * <p>*   **hot**: A large number of Express Connect circuits are connected to the access point.</p>
         * <p>*   **full**: The number of Express Connect circuits connected to the access point has reached the upper limit.</p>
         * <p>*   **disabled**: The access point is unavailable.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The network type of the Express Connect circuit. Default value: **VPC**.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAccessPointsResponseBodyAccessPointSetAccessPointType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointSetAccessPointType self = new DescribeAccessPointsResponseBodyAccessPointSetAccessPointType();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setAccessPointFeatureModels(DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels accessPointFeatureModels) {
            this.accessPointFeatureModels = accessPointFeatureModels;
            return this;
        }
        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels getAccessPointFeatureModels() {
            return this.accessPointFeatureModels;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setAttachedRegionNo(String attachedRegionNo) {
            this.attachedRegionNo = attachedRegionNo;
            return this;
        }
        public String getAttachedRegionNo() {
            return this.attachedRegionNo;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setHostOperator(String hostOperator) {
            this.hostOperator = hostOperator;
            return this;
        }
        public String getHostOperator() {
            return this.hostOperator;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAccessPointsResponseBodyAccessPointSet extends TeaModel {
        @NameInMap("AccessPointType")
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointType> accessPointType;

        public static DescribeAccessPointsResponseBodyAccessPointSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointSet self = new DescribeAccessPointsResponseBodyAccessPointSet();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointSet setAccessPointType(java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointType> accessPointType) {
            this.accessPointType = accessPointType;
            return this;
        }
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointType> getAccessPointType() {
            return this.accessPointType;
        }

    }

}
