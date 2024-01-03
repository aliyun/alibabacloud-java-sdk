// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeGlobalDistributeCacheResponseBody extends TeaModel {
    /**
     * <p>Details of the distributed instance.</p>
     */
    @NameInMap("GlobalDistributeCaches")
    public java.util.List<DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches> globalDistributeCaches;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeGlobalDistributeCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDistributeCacheResponseBody self = new DescribeGlobalDistributeCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDistributeCacheResponseBody setGlobalDistributeCaches(java.util.List<DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches> globalDistributeCaches) {
        this.globalDistributeCaches = globalDistributeCaches;
        return this;
    }
    public java.util.List<DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches> getGlobalDistributeCaches() {
        return this.globalDistributeCaches;
    }

    public DescribeGlobalDistributeCacheResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGlobalDistributeCacheResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGlobalDistributeCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalDistributeCacheResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances extends TeaModel {
        /**
         * <p>The ID of the distributed instance.</p>
         */
        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        /**
         * <p>The instance type of the child instance. For more information, see the following topics:</p>
         * <br>
         * <p>*   [Standard DRAM-based instances](~~145228~~)</p>
         * <p>*   [Cluster DRAM-based instances](~~150458~~)</p>
         * <p>*   [Read/write splitting DRAM-based instances](~~150459~~)</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the child instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The state of the child instance. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The instance is normal.</p>
         * <p>*   **Creating**: The instance is being created.</p>
         * <p>*   **Changing**: The configurations of the instance are being changed.</p>
         * <p>*   **Inactive**: The instance is disabled.</p>
         * <p>*   **Flushing**: The instance is being released.</p>
         * <p>*   **Released**: The instance is released.</p>
         * <p>*   **Transforming**: The billing method of the instance is changing.</p>
         * <p>*   **Unavailable**: The instance is suspended.</p>
         * <p>*   **Error**: The instance failed to be created.</p>
         * <p>*   **Migrating**: The instance is being migrated.</p>
         * <p>*   **BackupRecovering**: The instance is being restored from a backup.</p>
         * <p>*   **MinorVersionUpgrading**: The minor version of the instance is being updated.</p>
         * <p>*   **NetworkModifying**: The network type of the instance is being changed.</p>
         * <p>*   **SSLModifying**: The SSL certificate of the instance is being changed.</p>
         * <p>*   **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains available during the upgrade.</p>
         * <br>
         * <p>>  For more information about instance states, see [Instance states and impacts](~~200740~~).</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances self = new DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances setGlobalInstanceId(String globalInstanceId) {
            this.globalInstanceId = globalInstanceId;
            return this;
        }
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches extends TeaModel {
        /**
         * <p>The ID of the distributed instance.</p>
         */
        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        /**
         * <p>The state of the distributed instance. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The instance is normal.</p>
         * <p>*   **Changing**: The configurations of the instance are being changed.</p>
         * <p>*   **Creating**: The instance is being created.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Details of the child instances.</p>
         */
        @NameInMap("SubInstances")
        public java.util.List<DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances> subInstances;

        public static DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches self = new DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches setGlobalInstanceId(String globalInstanceId) {
            this.globalInstanceId = globalInstanceId;
            return this;
        }
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches setSubInstances(java.util.List<DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances> subInstances) {
            this.subInstances = subInstances;
            return this;
        }
        public java.util.List<DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances> getSubInstances() {
            return this.subInstances;
        }

    }

}
