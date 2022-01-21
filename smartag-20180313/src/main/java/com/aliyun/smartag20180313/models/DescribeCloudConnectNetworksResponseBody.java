// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeCloudConnectNetworksResponseBody extends TeaModel {
    @NameInMap("CloudConnectNetworks")
    public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworks cloudConnectNetworks;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork extends TeaModel {
        @NameInMap("AssociatedCenId")
        public String associatedCenId;

        @NameInMap("AssociatedCenOwnerId")
        public String associatedCenOwnerId;

        @NameInMap("AssociatedCloudBoxCount")
        public String associatedCloudBoxCount;

        @NameInMap("AvailableCloudBoxCount")
        public String availableCloudBoxCount;

        @NameInMap("CcnId")
        public String ccnId;

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

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SnatCidrBlock")
        public String snatCidrBlock;

        @NameInMap("Tags")
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags tags;

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

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setAssociatedCloudBoxCount(String associatedCloudBoxCount) {
            this.associatedCloudBoxCount = associatedCloudBoxCount;
            return this;
        }
        public String getAssociatedCloudBoxCount() {
            return this.associatedCloudBoxCount;
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

        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetwork setTags(DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCloudConnectNetworksResponseBodyCloudConnectNetworksCloudConnectNetworkTags getTags() {
            return this.tags;
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
