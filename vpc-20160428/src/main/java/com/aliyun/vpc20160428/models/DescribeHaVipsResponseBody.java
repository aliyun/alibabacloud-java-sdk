// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHaVipsResponseBody extends TeaModel {
    @NameInMap("HaVips")
    public DescribeHaVipsResponseBodyHaVips haVips;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AssociatedEipAddresses")
        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses associatedEipAddresses;

        @NameInMap("AssociatedInstanceType")
        public String associatedInstanceType;

        @NameInMap("AssociatedInstances")
        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances associatedInstances;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("HaVipId")
        public String haVipId;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeHaVipsResponseBodyHaVipsHaVipTags tags;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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
