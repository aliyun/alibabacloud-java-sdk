// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerFieldStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistical information about containers.</p>
     */
    @NameInMap("ContainerGroupedFields")
    public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields containerGroupedFields;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerFieldStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerFieldStatisticsResponseBody self = new DescribeContainerFieldStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerFieldStatisticsResponseBody setContainerGroupedFields(DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields containerGroupedFields) {
        this.containerGroupedFields = containerGroupedFields;
        return this;
    }
    public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields getContainerGroupedFields() {
        return this.containerGroupedFields;
    }

    public DescribeContainerFieldStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields extends TeaModel {
        /**
         * <p>The number of applications.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AppCount")
        public Integer appCount;

        /**
         * <p>The number of clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClusterCount")
        public Integer clusterCount;

        /**
         * <p>The number of containers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ContainerCount")
        public Integer containerCount;

        /**
         * <p>The number of images.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ImageCount")
        public Integer imageCount;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The number of namespaces.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NamespaceCount")
        public Integer namespaceCount;

        /**
         * <p>The number of pods.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PodCount")
        public Integer podCount;

        /**
         * <p>The number of the applications on which risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskAppCount")
        public Integer riskAppCount;

        /**
         * <p>The number of the clusters on which risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskClusterCount")
        public Integer riskClusterCount;

        /**
         * <p>The number of the containers on which risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskContainerCount")
        public Integer riskContainerCount;

        /**
         * <p>The number of the images on which risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskImageCount")
        public Integer riskImageCount;

        /**
         * <p>The number of the instances on which risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskInstanceCount")
        public Integer riskInstanceCount;

        /**
         * <p>The number of the pods on which risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskPodCount")
        public Integer riskPodCount;

        public static DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields self = new DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields();
            return TeaModel.build(map, self);
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setAppCount(Integer appCount) {
            this.appCount = appCount;
            return this;
        }
        public Integer getAppCount() {
            return this.appCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setClusterCount(Integer clusterCount) {
            this.clusterCount = clusterCount;
            return this;
        }
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setContainerCount(Integer containerCount) {
            this.containerCount = containerCount;
            return this;
        }
        public Integer getContainerCount() {
            return this.containerCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setNamespaceCount(Integer namespaceCount) {
            this.namespaceCount = namespaceCount;
            return this;
        }
        public Integer getNamespaceCount() {
            return this.namespaceCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setRiskAppCount(Integer riskAppCount) {
            this.riskAppCount = riskAppCount;
            return this;
        }
        public Integer getRiskAppCount() {
            return this.riskAppCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setRiskClusterCount(Integer riskClusterCount) {
            this.riskClusterCount = riskClusterCount;
            return this;
        }
        public Integer getRiskClusterCount() {
            return this.riskClusterCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setRiskContainerCount(Integer riskContainerCount) {
            this.riskContainerCount = riskContainerCount;
            return this;
        }
        public Integer getRiskContainerCount() {
            return this.riskContainerCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setRiskImageCount(Integer riskImageCount) {
            this.riskImageCount = riskImageCount;
            return this;
        }
        public Integer getRiskImageCount() {
            return this.riskImageCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setRiskInstanceCount(Integer riskInstanceCount) {
            this.riskInstanceCount = riskInstanceCount;
            return this;
        }
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

        public DescribeContainerFieldStatisticsResponseBodyContainerGroupedFields setRiskPodCount(Integer riskPodCount) {
            this.riskPodCount = riskPodCount;
            return this;
        }
        public Integer getRiskPodCount() {
            return this.riskPodCount;
        }

    }

}
