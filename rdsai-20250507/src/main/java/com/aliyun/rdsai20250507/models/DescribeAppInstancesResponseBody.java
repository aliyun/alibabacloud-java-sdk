// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeAppInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeAppInstancesResponseBodyInstances> instances;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>32DEFB4A-861F-5D1D-ADD5-918E4FD7AB8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>test-supabase</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>pgm-2ze49qv594vi****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <strong>example:</strong>
         * <p>rdsai.supabase.basic</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <strong>example:</strong>
         * <p>20241231</p>
         */
        @NameInMap("InstanceMinorVersion")
        public String instanceMinorVersion;

        /**
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>8.152. XXX.XXX:8000</p>
         */
        @NameInMap("PublicConnectionString")
        public String publicConnectionString;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-2zeaepb8k4ku05ov2****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
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
