// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcSecurityGroupResponseBody extends TeaModel {
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
     * <p>61B15017-1A68-5C47-834F-87E2BBC44F2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of security groups.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("SecurityGroupCount")
    public Integer securityGroupCount;

    /**
     * <p>The security groups.</p>
     */
    @NameInMap("SecurityGroupList")
    public java.util.List<GetUserVpcSecurityGroupResponseBodySecurityGroupList> securityGroupList;

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

    public static GetUserVpcSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserVpcSecurityGroupResponseBody self = new GetUserVpcSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserVpcSecurityGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserVpcSecurityGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserVpcSecurityGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserVpcSecurityGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetUserVpcSecurityGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetUserVpcSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserVpcSecurityGroupResponseBody setSecurityGroupCount(Integer securityGroupCount) {
        this.securityGroupCount = securityGroupCount;
        return this;
    }
    public Integer getSecurityGroupCount() {
        return this.securityGroupCount;
    }

    public GetUserVpcSecurityGroupResponseBody setSecurityGroupList(java.util.List<GetUserVpcSecurityGroupResponseBodySecurityGroupList> securityGroupList) {
        this.securityGroupList = securityGroupList;
        return this;
    }
    public java.util.List<GetUserVpcSecurityGroupResponseBodySecurityGroupList> getSecurityGroupList() {
        return this.securityGroupList;
    }

    public GetUserVpcSecurityGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserVpcSecurityGroupResponseBodySecurityGroupList extends TeaModel {
        /**
         * <p>The description of the security group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp16bt3zuugxpfjkasdfvthxth8</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>my-security-group</p>
         */
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6tar2ohlasdhsatjln37h30bv</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetUserVpcSecurityGroupResponseBodySecurityGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetUserVpcSecurityGroupResponseBodySecurityGroupList self = new GetUserVpcSecurityGroupResponseBodySecurityGroupList();
            return TeaModel.build(map, self);
        }

        public GetUserVpcSecurityGroupResponseBodySecurityGroupList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserVpcSecurityGroupResponseBodySecurityGroupList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetUserVpcSecurityGroupResponseBodySecurityGroupList setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public GetUserVpcSecurityGroupResponseBodySecurityGroupList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
