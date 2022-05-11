// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcSecurityGroupResponseBody extends TeaModel {
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

    @NameInMap("SecurityGroupCount")
    public Integer securityGroupCount;

    @NameInMap("SecurityGroupList")
    public java.util.List<GetUserVpcSecurityGroupResponseBodySecurityGroupList> securityGroupList;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SecurityGroupName")
        public String securityGroupName;

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
