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
     * 
     * <strong>example:</strong>
     * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
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
         * 
         * <strong>example:</strong>
         * <p>eip-2zeerraiwb7ujxscd****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The type of the resource that is associated with the EIP. Valid values:</p>
         * <ul>
         * <li><code>EcsInstance</code>: an ECS instance in a VPC</li>
         * <li><code>SlbInstance</code>: a Server Load Balancer (SLB) instance in a VPC</li>
         * <li><code>Nat</code>: a NAT gateway</li>
         * <li><code>HaVip</code>: a high-availability virtual IP address (HAVIP)</li>
         * <li><code>NetworkInterface</code>: a secondary elastic network interface (ENI)</li>
         * </ul>
         * <p>Default value: <code>EcsInstance</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>SlbInstance</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The IP address of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>120.xx.xx.112</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The status of the EIP. Valid values:</p>
         * <ul>
         * <li><code>Associating</code>: The EIP is being associated with a resource.</li>
         * <li><code>Unassociating</code>: The EIP is being disassociated from a resource.</li>
         * <li><code>InUse</code>: The EIP is associated with a resource.</li>
         * <li><code>Available</code>: The EIP is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InUse</p>
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
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
