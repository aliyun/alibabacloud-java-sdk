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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F3F44BE3-5419-4B61-9BAC-E66E295A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>gr-bp14rkqrhac****</p>
         */
        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        /**
         * <p>The instance type of the child instance. For more information, see the following topics:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/145228.html">Standard DRAM-based instances</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/150458.html">Cluster DRAM-based instances</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/150459.html">Read/write splitting DRAM-based instances</a></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>redis.amber.logic.sharding.2g.2db.0rodb.6proxy.multithread</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the child instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The state of the child instance. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The instance is normal.</li>
         * <li><strong>Creating</strong>: The instance is being created.</li>
         * <li><strong>Changing</strong>: The configurations of the instance are being changed.</li>
         * <li><strong>Inactive</strong>: The instance is disabled.</li>
         * <li><strong>Flushing</strong>: The instance is being released.</li>
         * <li><strong>Released</strong>: The instance is released.</li>
         * <li><strong>Transforming</strong>: The billing method of the instance is changing.</li>
         * <li><strong>Unavailable</strong>: The instance is suspended.</li>
         * <li><strong>Error</strong>: The instance failed to be created.</li>
         * <li><strong>Migrating</strong>: The instance is being migrated.</li>
         * <li><strong>BackupRecovering</strong>: The instance is being restored from a backup.</li>
         * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being updated.</li>
         * <li><strong>NetworkModifying</strong>: The network type of the instance is being changed.</li>
         * <li><strong>SSLModifying</strong>: The SSL certificate of the instance is being changed.</li>
         * <li><strong>MajorVersionUpgrading</strong>: The major version of the instance is being upgraded. The instance remains available during the upgrade.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about instance states, see <a href="https://help.aliyun.com/document_detail/200740.html">Instance states and impacts</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * 
         * <strong>example:</strong>
         * <p>gr-bp14rkqrhac****</p>
         */
        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        /**
         * <p>The state of the distributed instance. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The instance is normal.</li>
         * <li><strong>Changing</strong>: The configurations of the instance are being changed.</li>
         * <li><strong>Creating</strong>: The instance is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
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
