// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2CA11923-2A3D-5E5A-8314-E699D2DD15DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstancesFeatureDBInfo extends TeaModel {
        /**
         * <p>The status of the FeatureDB instance.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyInstancesFeatureDBInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesFeatureDBInfo self = new ListInstancesResponseBodyInstancesFeatureDBInfo();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesFeatureDBInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesResponseBodyInstancesFeatureDBInstanceInfo extends TeaModel {
        /**
         * <p>The status of the FeatureDB instance.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyInstancesFeatureDBInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesFeatureDBInstanceInfo self = new ListInstancesResponseBodyInstancesFeatureDBInstanceInfo();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesFeatureDBInstanceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>Information about the FeatureDB instance.</p>
         */
        @NameInMap("FeatureDBInfo")
        public ListInstancesResponseBodyInstancesFeatureDBInfo featureDBInfo;

        /**
         * <p>Information about the FeatureDB instance.</p>
         */
        @NameInMap("FeatureDBInstanceInfo")
        @Deprecated
        public ListInstancesResponseBodyInstancesFeatureDBInstanceInfo featureDBInstanceInfo;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-04T11:26:09.036+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-04T11:26:09.036+08:00</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>featureStore-cn-7mz2xfu****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region where the instance is located.</p>
         * <ul>
         * <li><p>cn-hangzhou</p>
         * </li>
         * <li><p>cn-beijing</p>
         * </li>
         * <li><p>cn-shanghai</p>
         * </li>
         * <li><p>cn-shenzhen</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the instance.</p>
         * <ul>
         * <li><p>Initializing</p>
         * </li>
         * <li><p>Running</p>
         * </li>
         * <li><p>Stopped</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Initializing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The instance type. Currently, only Basic is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setFeatureDBInfo(ListInstancesResponseBodyInstancesFeatureDBInfo featureDBInfo) {
            this.featureDBInfo = featureDBInfo;
            return this;
        }
        public ListInstancesResponseBodyInstancesFeatureDBInfo getFeatureDBInfo() {
            return this.featureDBInfo;
        }

        @Deprecated
        public ListInstancesResponseBodyInstances setFeatureDBInstanceInfo(ListInstancesResponseBodyInstancesFeatureDBInstanceInfo featureDBInstanceInfo) {
            this.featureDBInstanceInfo = featureDBInstanceInfo;
            return this;
        }
        public ListInstancesResponseBodyInstancesFeatureDBInstanceInfo getFeatureDBInstanceInfo() {
            return this.featureDBInstanceInfo;
        }

        public ListInstancesResponseBodyInstances setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstancesResponseBodyInstances setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
