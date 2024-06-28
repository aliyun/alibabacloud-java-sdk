// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHaVipsResponseBody extends TeaModel {
    /**
     * <p>The details about the HAVIP.</p>
     */
    @NameInMap("HaVips")
    public DescribeHaVipsResponseBodyHaVips haVips;

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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33E480C5-B46F-4CA5-B6FD-D77C746E86AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHaVipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHaVipsResponseBody self = new DescribeHaVipsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHaVipsResponseBody setHaVips(DescribeHaVipsResponseBodyHaVips haVips) {
        this.haVips = haVips;
        return this;
    }
    public DescribeHaVipsResponseBodyHaVips getHaVips() {
        return this.haVips;
    }

    public DescribeHaVipsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHaVipsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHaVipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHaVipsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses extends TeaModel {
        @NameInMap("associatedEipAddresse")
        public java.util.List<String> associatedEipAddresse;

        public static DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses self = new DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses setAssociatedEipAddresse(java.util.List<String> associatedEipAddresse) {
            this.associatedEipAddresse = associatedEipAddresse;
            return this;
        }
        public java.util.List<String> getAssociatedEipAddresse() {
            return this.associatedEipAddresse;
        }

    }

    public static class DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances extends TeaModel {
        @NameInMap("associatedInstance")
        public java.util.List<String> associatedInstance;

        public static DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances self = new DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances setAssociatedInstance(java.util.List<String> associatedInstance) {
            this.associatedInstance = associatedInstance;
            return this;
        }
        public java.util.List<String> getAssociatedInstance() {
            return this.associatedInstance;
        }

    }

    public static class DescribeHaVipsResponseBodyHaVipsHaVipTagsTag extends TeaModel {
        /**
         * <p>The key of tag N added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeHaVipsResponseBodyHaVipsHaVipTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVipsHaVipTagsTag self = new DescribeHaVipsResponseBodyHaVipsHaVipTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVipsHaVipTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVipTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHaVipsResponseBodyHaVipsHaVipTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeHaVipsResponseBodyHaVipsHaVipTagsTag> tag;

        public static DescribeHaVipsResponseBodyHaVipsHaVipTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVipsHaVipTags self = new DescribeHaVipsResponseBodyHaVipsHaVipTags();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVipsHaVipTags setTag(java.util.List<DescribeHaVipsResponseBodyHaVipsHaVipTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeHaVipsResponseBodyHaVipsHaVipTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeHaVipsResponseBodyHaVipsHaVip extends TeaModel {
        /**
         * <p>The list of EIPs associated with the HAVIP.</p>
         */
        @NameInMap("AssociatedEipAddresses")
        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses associatedEipAddresses;

        /**
         * <p>The type of the instance with which the HAVIP is associated. Valid values:</p>
         * <ul>
         * <li><strong>EcsInstance</strong>: Elastic Compute Service (ECS) instance</li>
         * <li><strong>NetworkInterface</strong>: elastic network interface (ENI)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EcsInstance</p>
         */
        @NameInMap("AssociatedInstanceType")
        public String associatedInstanceType;

        /**
         * <p>The information about the instance associated with the HAVIP.</p>
         */
        @NameInMap("AssociatedInstances")
        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances associatedInstances;

        /**
         * <p>The parameter is invalid. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the HAVIP was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-03T14:25:26Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>My HaVip</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>havip-bp149uyvut73dpld****</p>
         */
        @NameInMap("HaVipId")
        public String haVipId;

        /**
         * <p>The private IP address of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.24.5</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The ID of the active instance that is associated with the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp145q7glnuzdvz****</p>
         */
        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        /**
         * <p>The name of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the region to which the HAVIP belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the HAVIP belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the HAVIP. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The server group is being created.</li>
         * <li><strong>Available</strong>: The FULLNAT entry is available.</li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public DescribeHaVipsResponseBodyHaVipsHaVipTags tags;

        /**
         * <p>The ID of the vSwitch to which the HAVIP belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1pkt1fba8e824ez****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC to which the HAVIP belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1kcm36tevkpms97****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeHaVipsResponseBodyHaVipsHaVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVipsHaVip self = new DescribeHaVipsResponseBodyHaVipsHaVip();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setAssociatedEipAddresses(DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses associatedEipAddresses) {
            this.associatedEipAddresses = associatedEipAddresses;
            return this;
        }
        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses getAssociatedEipAddresses() {
            return this.associatedEipAddresses;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setAssociatedInstanceType(String associatedInstanceType) {
            this.associatedInstanceType = associatedInstanceType;
            return this;
        }
        public String getAssociatedInstanceType() {
            return this.associatedInstanceType;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setAssociatedInstances(DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances associatedInstances) {
            this.associatedInstances = associatedInstances;
            return this;
        }
        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances getAssociatedInstances() {
            return this.associatedInstances;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setHaVipId(String haVipId) {
            this.haVipId = haVipId;
            return this;
        }
        public String getHaVipId() {
            return this.haVipId;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setTags(DescribeHaVipsResponseBodyHaVipsHaVipTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeHaVipsResponseBodyHaVipsHaVipTags getTags() {
            return this.tags;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeHaVipsResponseBodyHaVips extends TeaModel {
        @NameInMap("HaVip")
        public java.util.List<DescribeHaVipsResponseBodyHaVipsHaVip> haVip;

        public static DescribeHaVipsResponseBodyHaVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVips self = new DescribeHaVipsResponseBodyHaVips();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVips setHaVip(java.util.List<DescribeHaVipsResponseBodyHaVipsHaVip> haVip) {
            this.haVip = haVip;
            return this;
        }
        public java.util.List<DescribeHaVipsResponseBodyHaVipsHaVip> getHaVip() {
            return this.haVip;
        }

    }

}
