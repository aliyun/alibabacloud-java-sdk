// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeEipResourcesResponseBody extends TeaModel {
    /**
     * <p>The EIPs.</p>
     */
    @NameInMap("EipList")
    public java.util.List<DescribeEipResourcesResponseBodyEipList> eipList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageResult")
    public DescribeEipResourcesResponseBodyPageResult pageResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEipResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipResourcesResponseBody self = new DescribeEipResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEipResourcesResponseBody setEipList(java.util.List<DescribeEipResourcesResponseBodyEipList> eipList) {
        this.eipList = eipList;
        return this;
    }
    public java.util.List<DescribeEipResourcesResponseBodyEipList> getEipList() {
        return this.eipList;
    }

    public DescribeEipResourcesResponseBody setPageResult(DescribeEipResourcesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public DescribeEipResourcesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public DescribeEipResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEipResourcesResponseBodyEipList extends TeaModel {
        /**
         * <p>The ID of the EIP.</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The type of the resource that is associated with the EIP. Valid values:</p>
         * <br>
         * <p>*   `EcsInstance`: an ECS instance in a VPC</p>
         * <p>*   `SlbInstance`: a Server Load Balancer (SLB) instance in a VPC</p>
         * <p>*   `Nat`: a NAT gateway</p>
         * <p>*   `HaVip`: a high-availability virtual IP address (HAVIP)</p>
         * <p>*   `NetworkInterface`: a secondary elastic network interface (ENI)</p>
         * <br>
         * <p>Default value: `EcsInstance`.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The IP address of the EIP.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The status of the EIP. Valid values:</p>
         * <br>
         * <p>*   `Associating`: The EIP is being associated with a resource.</p>
         * <p>*   `Unassociating`: The EIP is being disassociated from a resource.</p>
         * <p>*   `InUse`: The EIP is associated with a resource.</p>
         * <p>*   `Available`: The EIP is available.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEipResourcesResponseBodyEipList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipResourcesResponseBodyEipList self = new DescribeEipResourcesResponseBodyEipList();
            return TeaModel.build(map, self);
        }

        public DescribeEipResourcesResponseBodyEipList setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeEipResourcesResponseBodyEipList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeEipResourcesResponseBodyEipList setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeEipResourcesResponseBodyEipList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeEipResourcesResponseBodyPageResult extends TeaModel {
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
         * <p>The number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeEipResourcesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipResourcesResponseBodyPageResult self = new DescribeEipResourcesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public DescribeEipResourcesResponseBodyPageResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeEipResourcesResponseBodyPageResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeEipResourcesResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
