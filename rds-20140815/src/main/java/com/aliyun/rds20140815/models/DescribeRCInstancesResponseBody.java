// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstancesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The details of the instance.</p>
     */
    @NameInMap("RCInstances")
    public java.util.List<DescribeRCInstancesResponseBodyRCInstances> RCInstances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9DD55F4-1A5F-48CA-BA57-DFB3CA8C4C34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRCInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstancesResponseBody self = new DescribeRCInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRCInstancesResponseBody setRCInstances(java.util.List<DescribeRCInstancesResponseBodyRCInstances> RCInstances) {
        this.RCInstances = RCInstances;
        return this;
    }
    public java.util.List<DescribeRCInstancesResponseBodyRCInstances> getRCInstances() {
        return this.RCInstances;
    }

    public DescribeRCInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRCInstancesResponseBodyRCInstances extends TeaModel {
        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>testrdscustom</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("CreateMode")
        public String createMode;

        /**
         * <p>The database type.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_custom</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the task was created. The time is displayed in GMT.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 07:56:53.0</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The host IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.30.XXX.XXX</p>
         */
        @NameInMap("HostIp")
        public String hostIp;

        /**
         * <p>The host name.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zeaiz4g9u23f40m****</p>
         */
        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze704f*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Starting</strong></li>
         * <li><strong>Stopping</strong></li>
         * <li><strong>Stopped</strong></li>
         * </ul>
         * <blockquote>
         * <p> If the value returned for the DescribeRCInstances operation is different from the value that is returned for the <strong>DescribeRCInstanceAttribute</strong> operation, the value returned for the <strong>DescribeRCInstanceAttribute</strong> operation shall prevail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6f7l4fg90****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeRCInstancesResponseBodyRCInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstancesResponseBodyRCInstances self = new DescribeRCInstancesResponseBodyRCInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstancesResponseBodyRCInstances setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeRCInstancesResponseBodyRCInstances setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public DescribeRCInstancesResponseBodyRCInstances setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeRCInstancesResponseBodyRCInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRCInstancesResponseBodyRCInstances setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeRCInstancesResponseBodyRCInstances setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public DescribeRCInstancesResponseBodyRCInstances setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeRCInstancesResponseBodyRCInstances setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeRCInstancesResponseBodyRCInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRCInstancesResponseBodyRCInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRCInstancesResponseBodyRCInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCInstancesResponseBodyRCInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
