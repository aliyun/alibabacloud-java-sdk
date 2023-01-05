// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetContactBlockListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContactBlocklistList")
    public GetContactBlockListResponseBodyContactBlocklistList contactBlocklistList;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetContactBlockListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContactBlockListResponseBody self = new GetContactBlockListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContactBlockListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContactBlockListResponseBody setContactBlocklistList(GetContactBlockListResponseBodyContactBlocklistList contactBlocklistList) {
        this.contactBlocklistList = contactBlocklistList;
        return this;
    }
    public GetContactBlockListResponseBodyContactBlocklistList getContactBlocklistList() {
        return this.contactBlocklistList;
    }

    public GetContactBlockListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContactBlockListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContactBlockListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContactBlockListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContactBlockListResponseBodyContactBlocklistListList extends TeaModel {
        @NameInMap("ContactBlockListId")
        public String contactBlockListId;

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

        public static GetContactBlockListResponseBodyContactBlocklistListList build(java.util.Map<String, ?> map) throws Exception {
            GetContactBlockListResponseBodyContactBlocklistListList self = new GetContactBlockListResponseBodyContactBlocklistListList();
            return TeaModel.build(map, self);
        }

        public GetContactBlockListResponseBodyContactBlocklistListList setContactBlockListId(String contactBlockListId) {
            this.contactBlockListId = contactBlockListId;
            return this;
        }
        public String getContactBlockListId() {
            return this.contactBlockListId;
        }

        public GetContactBlockListResponseBodyContactBlocklistListList setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public GetContactBlockListResponseBodyContactBlocklistListList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetContactBlockListResponseBodyContactBlocklistListList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetContactBlockListResponseBodyContactBlocklistListList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetContactBlockListResponseBodyContactBlocklistListList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetContactBlockListResponseBodyContactBlocklistListList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetContactBlockListResponseBodyContactBlocklistListList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class GetContactBlockListResponseBodyContactBlocklistList extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetContactBlockListResponseBodyContactBlocklistListList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetContactBlockListResponseBodyContactBlocklistList build(java.util.Map<String, ?> map) throws Exception {
            GetContactBlockListResponseBodyContactBlocklistList self = new GetContactBlockListResponseBodyContactBlocklistList();
            return TeaModel.build(map, self);
        }

        public GetContactBlockListResponseBodyContactBlocklistList setList(java.util.List<GetContactBlockListResponseBodyContactBlocklistListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetContactBlockListResponseBodyContactBlocklistListList> getList() {
            return this.list;
        }

        public GetContactBlockListResponseBodyContactBlocklistList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetContactBlockListResponseBodyContactBlocklistList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetContactBlockListResponseBodyContactBlocklistList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
