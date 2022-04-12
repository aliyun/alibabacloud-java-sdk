// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Vpcs")
    public java.util.List<GetUserVpcsResponseBodyVpcs> vpcs;

    public static GetUserVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserVpcsResponseBody self = new GetUserVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserVpcsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserVpcsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserVpcsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserVpcsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetUserVpcsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetUserVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserVpcsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserVpcsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetUserVpcsResponseBody setVpcs(java.util.List<GetUserVpcsResponseBodyVpcs> vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public java.util.List<GetUserVpcsResponseBodyVpcs> getVpcs() {
        return this.vpcs;
    }

    public static class GetUserVpcsResponseBodyVpcsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetUserVpcsResponseBodyVpcsTags build(java.util.Map<String, ?> map) throws Exception {
            GetUserVpcsResponseBodyVpcsTags self = new GetUserVpcsResponseBodyVpcsTags();
            return TeaModel.build(map, self);
        }

        public GetUserVpcsResponseBodyVpcsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetUserVpcsResponseBodyVpcsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetUserVpcsResponseBodyVpcs extends TeaModel {
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("NatGatewayIds")
        public java.util.List<String> natGatewayIds;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RouterTableIds")
        public java.util.List<String> routerTableIds;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<GetUserVpcsResponseBodyVpcsTags> tags;

        @NameInMap("UserCidrs")
        public java.util.List<String> userCidrs;

        @NameInMap("VRouterId")
        public String VRouterId;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        public static GetUserVpcsResponseBodyVpcs build(java.util.Map<String, ?> map) throws Exception {
            GetUserVpcsResponseBodyVpcs self = new GetUserVpcsResponseBodyVpcs();
            return TeaModel.build(map, self);
        }

        public GetUserVpcsResponseBodyVpcs setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public GetUserVpcsResponseBodyVpcs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetUserVpcsResponseBodyVpcs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserVpcsResponseBodyVpcs setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public GetUserVpcsResponseBodyVpcs setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetUserVpcsResponseBodyVpcs setNatGatewayIds(java.util.List<String> natGatewayIds) {
            this.natGatewayIds = natGatewayIds;
            return this;
        }
        public java.util.List<String> getNatGatewayIds() {
            return this.natGatewayIds;
        }

        public GetUserVpcsResponseBodyVpcs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetUserVpcsResponseBodyVpcs setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetUserVpcsResponseBodyVpcs setRouterTableIds(java.util.List<String> routerTableIds) {
            this.routerTableIds = routerTableIds;
            return this;
        }
        public java.util.List<String> getRouterTableIds() {
            return this.routerTableIds;
        }

        public GetUserVpcsResponseBodyVpcs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserVpcsResponseBodyVpcs setTags(java.util.List<GetUserVpcsResponseBodyVpcsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetUserVpcsResponseBodyVpcsTags> getTags() {
            return this.tags;
        }

        public GetUserVpcsResponseBodyVpcs setUserCidrs(java.util.List<String> userCidrs) {
            this.userCidrs = userCidrs;
            return this;
        }
        public java.util.List<String> getUserCidrs() {
            return this.userCidrs;
        }

        public GetUserVpcsResponseBodyVpcs setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public GetUserVpcsResponseBodyVpcs setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetUserVpcsResponseBodyVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetUserVpcsResponseBodyVpcs setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
