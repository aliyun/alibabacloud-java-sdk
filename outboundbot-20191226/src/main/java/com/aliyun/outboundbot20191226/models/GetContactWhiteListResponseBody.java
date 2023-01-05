// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetContactWhiteListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContactWhitelistList")
    public GetContactWhiteListResponseBodyContactWhitelistList contactWhitelistList;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetContactWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContactWhiteListResponseBody self = new GetContactWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContactWhiteListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContactWhiteListResponseBody setContactWhitelistList(GetContactWhiteListResponseBodyContactWhitelistList contactWhitelistList) {
        this.contactWhitelistList = contactWhitelistList;
        return this;
    }
    public GetContactWhiteListResponseBodyContactWhitelistList getContactWhitelistList() {
        return this.contactWhitelistList;
    }

    public GetContactWhiteListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContactWhiteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContactWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContactWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContactWhiteListResponseBodyContactWhitelistListList extends TeaModel {
        @NameInMap("ContactWhiteListId")
        public String contactWhiteListId;

        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("Remark")
        public String remark;

        public static GetContactWhiteListResponseBodyContactWhitelistListList build(java.util.Map<String, ?> map) throws Exception {
            GetContactWhiteListResponseBodyContactWhitelistListList self = new GetContactWhiteListResponseBodyContactWhitelistListList();
            return TeaModel.build(map, self);
        }

        public GetContactWhiteListResponseBodyContactWhitelistListList setContactWhiteListId(String contactWhiteListId) {
            this.contactWhiteListId = contactWhiteListId;
            return this;
        }
        public String getContactWhiteListId() {
            return this.contactWhiteListId;
        }

        public GetContactWhiteListResponseBodyContactWhitelistListList setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public GetContactWhiteListResponseBodyContactWhitelistListList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetContactWhiteListResponseBodyContactWhitelistListList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetContactWhiteListResponseBodyContactWhitelistListList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetContactWhiteListResponseBodyContactWhitelistListList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetContactWhiteListResponseBodyContactWhitelistListList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetContactWhiteListResponseBodyContactWhitelistListList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class GetContactWhiteListResponseBodyContactWhitelistList extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetContactWhiteListResponseBodyContactWhitelistListList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetContactWhiteListResponseBodyContactWhitelistList build(java.util.Map<String, ?> map) throws Exception {
            GetContactWhiteListResponseBodyContactWhitelistList self = new GetContactWhiteListResponseBodyContactWhitelistList();
            return TeaModel.build(map, self);
        }

        public GetContactWhiteListResponseBodyContactWhitelistList setList(java.util.List<GetContactWhiteListResponseBodyContactWhitelistListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetContactWhiteListResponseBodyContactWhitelistListList> getList() {
            return this.list;
        }

        public GetContactWhiteListResponseBodyContactWhitelistList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetContactWhiteListResponseBodyContactWhitelistList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetContactWhiteListResponseBodyContactWhitelistList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
