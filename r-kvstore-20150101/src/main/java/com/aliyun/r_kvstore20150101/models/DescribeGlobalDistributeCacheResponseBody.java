// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeGlobalDistributeCacheResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("GlobalDistributeCaches")
    public java.util.List<DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches> globalDistributeCaches;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeGlobalDistributeCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDistributeCacheResponseBody self = new DescribeGlobalDistributeCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDistributeCacheResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeGlobalDistributeCacheResponseBody setGlobalDistributeCaches(java.util.List<DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches> globalDistributeCaches) {
        this.globalDistributeCaches = globalDistributeCaches;
        return this;
    }
    public java.util.List<DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches> getGlobalDistributeCaches() {
        return this.globalDistributeCaches;
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

    public DescribeGlobalDistributeCacheResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances extends TeaModel {
        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances self = new DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances setGlobalInstanceId(String globalInstanceId) {
            this.globalInstanceId = globalInstanceId;
            return this;
        }
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
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
        @NameInMap("Status")
        public String status;

        @NameInMap("SubInstances")
        public java.util.List<DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCachesSubInstances> subInstances;

        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        public static DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches self = new DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches();
            return TeaModel.build(map, self);
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

        public DescribeGlobalDistributeCacheResponseBodyGlobalDistributeCaches setGlobalInstanceId(String globalInstanceId) {
            this.globalInstanceId = globalInstanceId;
            return this;
        }
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

    }

}
