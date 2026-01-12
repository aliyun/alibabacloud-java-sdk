// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeAppInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the RDS Supabase instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeAppInstancesResponseBodyInstances> instances;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32DEFB4A-861F-5D1D-ADD5-918E4FD7AB8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAppInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInstancesResponseBody self = new DescribeAppInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppInstancesResponseBody setInstances(java.util.List<DescribeAppInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeAppInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeAppInstancesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeAppInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAppInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The name of the AI application.</p>
         * 
         * <strong>example:</strong>
         * <p>test-supabase</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application type. Only <strong>supabase</strong> is supported. For more information, see <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The ID of the RDS for PostgreSQL instance with which the RDS Supabase instances are associated.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-2ze49qv594vi****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>rdsai.supabase.basic</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The minor version number of RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20241231</p>
         */
        @NameInMap("InstanceMinorVersion")
        public String instanceMinorVersion;

        /**
         * <p>The ID of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public endpoint of the AI application.</p>
         * 
         * <strong>example:</strong>
         * <p>8.152. XXX.XXX:8000</p>
         */
        @NameInMap("PublicConnectionString")
        public String publicConnectionString;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/2623972.html">Instance state table</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zeaepb8k4ku05ov2****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The internal endpoint of the AI application.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XXX.XXX:8000</p>
         */
        @NameInMap("VpcConnectionString")
        public String vpcConnectionString;

        public static DescribeAppInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppInstancesResponseBodyInstances self = new DescribeAppInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeAppInstancesResponseBodyInstances setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppInstancesResponseBodyInstances setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public DescribeAppInstancesResponseBodyInstances setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeAppInstancesResponseBodyInstances setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeAppInstancesResponseBodyInstances setInstanceMinorVersion(String instanceMinorVersion) {
            this.instanceMinorVersion = instanceMinorVersion;
            return this;
        }
        public String getInstanceMinorVersion() {
            return this.instanceMinorVersion;
        }

        public DescribeAppInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAppInstancesResponseBodyInstances setPublicConnectionString(String publicConnectionString) {
            this.publicConnectionString = publicConnectionString;
            return this;
        }
        public String getPublicConnectionString() {
            return this.publicConnectionString;
        }

        public DescribeAppInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAppInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppInstancesResponseBodyInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeAppInstancesResponseBodyInstances setVpcConnectionString(String vpcConnectionString) {
            this.vpcConnectionString = vpcConnectionString;
            return this;
        }
        public String getVpcConnectionString() {
            return this.vpcConnectionString;
        }

    }

}
