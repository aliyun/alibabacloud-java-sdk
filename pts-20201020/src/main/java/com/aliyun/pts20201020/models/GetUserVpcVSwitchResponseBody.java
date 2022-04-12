// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcVSwitchResponseBody extends TeaModel {
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

    @NameInMap("VSwitchCount")
    public Integer vSwitchCount;

    @NameInMap("VSwitchList")
    public java.util.List<GetUserVpcVSwitchResponseBodyVSwitchList> vSwitchList;

    public static GetUserVpcVSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserVpcVSwitchResponseBody self = new GetUserVpcVSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserVpcVSwitchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserVpcVSwitchResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserVpcVSwitchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserVpcVSwitchResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetUserVpcVSwitchResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetUserVpcVSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserVpcVSwitchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserVpcVSwitchResponseBody setVSwitchCount(Integer vSwitchCount) {
        this.vSwitchCount = vSwitchCount;
        return this;
    }
    public Integer getVSwitchCount() {
        return this.vSwitchCount;
    }

    public GetUserVpcVSwitchResponseBody setVSwitchList(java.util.List<GetUserVpcVSwitchResponseBodyVSwitchList> vSwitchList) {
        this.vSwitchList = vSwitchList;
        return this;
    }
    public java.util.List<GetUserVpcVSwitchResponseBodyVSwitchList> getVSwitchList() {
        return this.vSwitchList;
    }

    public static class GetUserVpcVSwitchResponseBodyVSwitchListRouteTable extends TeaModel {
        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("RouteTableType")
        public String routeTableType;

        public static GetUserVpcVSwitchResponseBodyVSwitchListRouteTable build(java.util.Map<String, ?> map) throws Exception {
            GetUserVpcVSwitchResponseBodyVSwitchListRouteTable self = new GetUserVpcVSwitchResponseBodyVSwitchListRouteTable();
            return TeaModel.build(map, self);
        }

        public GetUserVpcVSwitchResponseBodyVSwitchListRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchListRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

    }

    public static class GetUserVpcVSwitchResponseBodyVSwitchListTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetUserVpcVSwitchResponseBodyVSwitchListTags build(java.util.Map<String, ?> map) throws Exception {
            GetUserVpcVSwitchResponseBodyVSwitchListTags self = new GetUserVpcVSwitchResponseBodyVSwitchListTags();
            return TeaModel.build(map, self);
        }

        public GetUserVpcVSwitchResponseBodyVSwitchListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetUserVpcVSwitchResponseBodyVSwitchList extends TeaModel {
        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

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

        @NameInMap("MaxAgentCount")
        public Integer maxAgentCount;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RouteTable")
        public java.util.List<GetUserVpcVSwitchResponseBodyVSwitchListRouteTable> routeTable;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<GetUserVpcVSwitchResponseBodyVSwitchListTags> tags;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetUserVpcVSwitchResponseBodyVSwitchList build(java.util.Map<String, ?> map) throws Exception {
            GetUserVpcVSwitchResponseBodyVSwitchList self = new GetUserVpcVSwitchResponseBodyVSwitchList();
            return TeaModel.build(map, self);
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setAvailableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setMaxAgentCount(Integer maxAgentCount) {
            this.maxAgentCount = maxAgentCount;
            return this;
        }
        public Integer getMaxAgentCount() {
            return this.maxAgentCount;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setRouteTable(java.util.List<GetUserVpcVSwitchResponseBodyVSwitchListRouteTable> routeTable) {
            this.routeTable = routeTable;
            return this;
        }
        public java.util.List<GetUserVpcVSwitchResponseBodyVSwitchListRouteTable> getRouteTable() {
            return this.routeTable;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setTags(java.util.List<GetUserVpcVSwitchResponseBodyVSwitchListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetUserVpcVSwitchResponseBodyVSwitchListTags> getTags() {
            return this.tags;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
