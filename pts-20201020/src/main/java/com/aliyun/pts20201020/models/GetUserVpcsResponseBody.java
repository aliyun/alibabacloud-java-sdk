// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcsResponseBody extends TeaModel {
    /**
     * <p>The system status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message. If the operation is successful, this parameter is not returned.</p>
     */
    @NameInMap("Message")
    public String message;

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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEE46204-E1CF-5F48-B094-67362DD4B73F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The VPCs.</p>
     */
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

    public static class GetUserVpcsResponseBodyVpcs extends TeaModel {
        /**
         * <p>The IPv4 CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.80.0/20</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The description of the VPC.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3fzmgkehpewjertna</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The IDs of the route tables.</p>
         */
        @NameInMap("RouterTableIds")
        public java.util.List<String> routerTableIds;

        /**
         * <p>The vSwitches.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6gc56wdjpafoiwej6adqb4qn72xtw</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>shanghai-vpc</p>
         */
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

        public GetUserVpcsResponseBodyVpcs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
