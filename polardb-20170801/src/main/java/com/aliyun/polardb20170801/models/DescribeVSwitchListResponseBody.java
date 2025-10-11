// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeVSwitchListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>6A2EE5B4-CC9F-46E1-A747-E43BC9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VSwitchs")
    public java.util.List<DescribeVSwitchListResponseBodyVSwitchs> vSwitchs;

    public static DescribeVSwitchListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchListResponseBody self = new DescribeVSwitchListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVSwitchListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVSwitchListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVSwitchListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVSwitchListResponseBody setVSwitchs(java.util.List<DescribeVSwitchListResponseBodyVSwitchs> vSwitchs) {
        this.vSwitchs = vSwitchs;
        return this;
    }
    public java.util.List<DescribeVSwitchListResponseBodyVSwitchs> getVSwitchs() {
        return this.vSwitchs;
    }

    public static class DescribeVSwitchListResponseBodyVSwitchs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

        /**
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <strong>example:</strong>
         * <p>vSwitchDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <strong>example:</strong>
         * <p>177563751276****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <strong>example:</strong>
         * <p>rg-************</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-25bcdxs7pv1****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vSwitch</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1vbkkyt7apvy4j*****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeVSwitchListResponseBodyVSwitchs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchListResponseBodyVSwitchs self = new DescribeVSwitchListResponseBodyVSwitchs();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchListResponseBodyVSwitchs setAvailableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeVSwitchListResponseBodyVSwitchs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
