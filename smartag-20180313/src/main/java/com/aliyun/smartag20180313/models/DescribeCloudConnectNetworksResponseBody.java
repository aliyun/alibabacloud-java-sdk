// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeCloudConnectNetworksResponseBody extends TeaModel {
    @NameInMap("CloudConnectNetworks")
    public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworks cloudConnectNetworks;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page during paging in a paged query.</p>
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
     * <p>3F2A0B80-D6D1-4764-8D77-38067DBBA345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCloudConnectNetworksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudConnectNetworksResponseBody self = new DescribeCloudConnectNetworksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudConnectNetworksResponseBody setCloudConnectNetworks(DescribeCloudConnectNetworksResponseBodyCloudConnectNetworks cloudConnectNetworks) {
        this.cloudConnectNetworks = cloudConnectNetworks;
        return this;
    }
    public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworks getCloudConnectNetworks() {
        return this.cloudConnectNetworks;
    }

    public DescribeCloudConnectNetworksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudConnectNetworksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudConnectNetworksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudConnectNetworksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTagsTag self = new DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTagsTag> tag;

        public static DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags self = new DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags setTag(java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding extends TeaModel {
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RelayCidrBlock")
        public String relayCidrBlock;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

        public static DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding self = new DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding setRelayCidrBlock(String relayCidrBlock) {
            this.relayCidrBlock = relayCidrBlock;
            return this;
        }
        public String getRelayCidrBlock() {
            return this.relayCidrBlock;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

    }

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingList extends TeaModel {
        @NameInMap("RegionBinding")
        public java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding> regionBinding;

        public static DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingList self = new DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingList();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingList setRegionBinding(java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding> regionBinding) {
            this.regionBinding = regionBinding;
            return this;
        }
        public java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingListRegionBinding> getRegionBinding() {
            return this.regionBinding;
        }

    }

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfig extends TeaModel {
        @NameInMap("CidrAllocationMode")
        public String cidrAllocationMode;

        @NameInMap("RegionBindingList")
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingList regionBindingList;

        @NameInMap("Subnet")
        public String subnet;

        public static DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfig self = new DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfig setCidrAllocationMode(String cidrAllocationMode) {
            this.cidrAllocationMode = cidrAllocationMode;
            return this;
        }
        public String getCidrAllocationMode() {
            return this.cidrAllocationMode;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfig setRegionBindingList(DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingList regionBindingList) {
            this.regionBindingList = regionBindingList;
            return this;
        }
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfigRegionBindingList getRegionBindingList() {
            return this.regionBindingList;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfig setSubnet(String subnet) {
            this.subnet = subnet;
            return this;
        }
        public String getSubnet() {
            return this.subnet;
        }

    }

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RelayCidrBlock")
        public String relayCidrBlock;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcCidrBlock")
        public String vpcCidrBlock;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding self = new DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding setRelayCidrBlock(String relayCidrBlock) {
            this.relayCidrBlock = relayCidrBlock;
            return this;
        }
        public String getRelayCidrBlock() {
            return this.relayCidrBlock;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding setVpcCidrBlock(String vpcCidrBlock) {
            this.vpcCidrBlock = vpcCidrBlock;
            return this;
        }
        public String getVpcCidrBlock() {
            return this.vpcCidrBlock;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingList extends TeaModel {
        @NameInMap("RegionBinding")
        public java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding> regionBinding;

        public static DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingList self = new DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingList();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingList setRegionBinding(java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding> regionBinding) {
            this.regionBinding = regionBinding;
            return this;
        }
        public java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingListRegionBinding> getRegionBinding() {
            return this.regionBinding;
        }

    }

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfig extends TeaModel {
        @NameInMap("CidrAllocationMode")
        public String cidrAllocationMode;

        @NameInMap("RegionBindingList")
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingList regionBindingList;

        @NameInMap("Subnet")
        public String subnet;

        public static DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfig self = new DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfig setCidrAllocationMode(String cidrAllocationMode) {
            this.cidrAllocationMode = cidrAllocationMode;
            return this;
        }
        public String getCidrAllocationMode() {
            return this.cidrAllocationMode;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfig setRegionBindingList(DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingList regionBindingList) {
            this.regionBindingList = regionBindingList;
            return this;
        }
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfigRegionBindingList getRegionBindingList() {
            return this.regionBindingList;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfig setSubnet(String subnet) {
            this.subnet = subnet;
            return this;
        }
        public String getSubnet() {
            return this.subnet;
        }

    }

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork extends TeaModel {
        @NameInMap("AssociatedCenId")
        public String associatedCenId;

        @NameInMap("AssociatedCenOwnerId")
        public String associatedCenOwnerId;

        @NameInMap("AssociatedCenStatus")
        public String associatedCenStatus;

        @NameInMap("AssociatedCloudBoxCount")
        public String associatedCloudBoxCount;

        @NameInMap("AssociatedVpcStatus")
        public String associatedVpcStatus;

        @NameInMap("AvailableCloudBoxCount")
        public String availableCloudBoxCount;

        @NameInMap("CcnId")
        public String ccnId;

        @NameInMap("CenStatusErrorCode")
        public String cenStatusErrorCode;

        @NameInMap("CenStatusErrorMessage")
        public String cenStatusErrorMessage;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InterworkingStatus")
        public String interworkingStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewAgw")
        public Boolean newAgw;

        @NameInMap("ProcessingCenId")
        public String processingCenId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SnatCidrBlock")
        public String snatCidrBlock;

        @NameInMap("Subnet")
        public String subnet;

        @NameInMap("Tags")
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags tags;

        @NameInMap("TrNetworkConfig")
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfig trNetworkConfig;

        @NameInMap("VpcNetworkConfig")
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfig vpcNetworkConfig;

        @NameInMap("VpcStatusErrorCode")
        public String vpcStatusErrorCode;

        @NameInMap("VpcStatusErrorMessage")
        public String vpcStatusErrorMessage;

        public static DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork self = new DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setAssociatedCenId(String associatedCenId) {
            this.associatedCenId = associatedCenId;
            return this;
        }
        public String getAssociatedCenId() {
            return this.associatedCenId;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setAssociatedCenOwnerId(String associatedCenOwnerId) {
            this.associatedCenOwnerId = associatedCenOwnerId;
            return this;
        }
        public String getAssociatedCenOwnerId() {
            return this.associatedCenOwnerId;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setAssociatedCenStatus(String associatedCenStatus) {
            this.associatedCenStatus = associatedCenStatus;
            return this;
        }
        public String getAssociatedCenStatus() {
            return this.associatedCenStatus;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setAssociatedCloudBoxCount(String associatedCloudBoxCount) {
            this.associatedCloudBoxCount = associatedCloudBoxCount;
            return this;
        }
        public String getAssociatedCloudBoxCount() {
            return this.associatedCloudBoxCount;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setAssociatedVpcStatus(String associatedVpcStatus) {
            this.associatedVpcStatus = associatedVpcStatus;
            return this;
        }
        public String getAssociatedVpcStatus() {
            return this.associatedVpcStatus;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setAvailableCloudBoxCount(String availableCloudBoxCount) {
            this.availableCloudBoxCount = availableCloudBoxCount;
            return this;
        }
        public String getAvailableCloudBoxCount() {
            return this.availableCloudBoxCount;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setCcnId(String ccnId) {
            this.ccnId = ccnId;
            return this;
        }
        public String getCcnId() {
            return this.ccnId;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setCenStatusErrorCode(String cenStatusErrorCode) {
            this.cenStatusErrorCode = cenStatusErrorCode;
            return this;
        }
        public String getCenStatusErrorCode() {
            return this.cenStatusErrorCode;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setCenStatusErrorMessage(String cenStatusErrorMessage) {
            this.cenStatusErrorMessage = cenStatusErrorMessage;
            return this;
        }
        public String getCenStatusErrorMessage() {
            return this.cenStatusErrorMessage;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setInterworkingStatus(String interworkingStatus) {
            this.interworkingStatus = interworkingStatus;
            return this;
        }
        public String getInterworkingStatus() {
            return this.interworkingStatus;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setNewAgw(Boolean newAgw) {
            this.newAgw = newAgw;
            return this;
        }
        public Boolean getNewAgw() {
            return this.newAgw;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setProcessingCenId(String processingCenId) {
            this.processingCenId = processingCenId;
            return this;
        }
        public String getProcessingCenId() {
            return this.processingCenId;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setSnatCidrBlock(String snatCidrBlock) {
            this.snatCidrBlock = snatCidrBlock;
            return this;
        }
        public String getSnatCidrBlock() {
            return this.snatCidrBlock;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setSubnet(String subnet) {
            this.subnet = subnet;
            return this;
        }
        public String getSubnet() {
            return this.subnet;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setTags(DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags getTags() {
            return this.tags;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setTrNetworkConfig(DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfig trNetworkConfig) {
            this.trNetworkConfig = trNetworkConfig;
            return this;
        }
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTrNetworkConfig getTrNetworkConfig() {
            return this.trNetworkConfig;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setVpcNetworkConfig(DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfig vpcNetworkConfig) {
            this.vpcNetworkConfig = vpcNetworkConfig;
            return this;
        }
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkVpcNetworkConfig getVpcNetworkConfig() {
            return this.vpcNetworkConfig;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setVpcStatusErrorCode(String vpcStatusErrorCode) {
            this.vpcStatusErrorCode = vpcStatusErrorCode;
            return this;
        }
        public String getVpcStatusErrorCode() {
            return this.vpcStatusErrorCode;
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setVpcStatusErrorMessage(String vpcStatusErrorMessage) {
            this.vpcStatusErrorMessage = vpcStatusErrorMessage;
            return this;
        }
        public String getVpcStatusErrorMessage() {
            return this.vpcStatusErrorMessage;
        }

    }

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworks extends TeaModel {
        @NameInMap("CloudConnectNetwork")
        public java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork> cloudConnectNetwork;

        public static DescribeCloudConnectNetworksResponseBodyCloudConnectNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksResponseBodyCloudConnectNetworks self = new DescribeCloudConnectNetworksResponseBodyCloudConnectNetworks();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworks setCloudConnectNetwork(java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork> cloudConnectNetwork) {
            this.cloudConnectNetwork = cloudConnectNetwork;
            return this;
        }
        public java.util.List<DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork> getCloudConnectNetwork() {
            return this.cloudConnectNetwork;
        }

    }

}
