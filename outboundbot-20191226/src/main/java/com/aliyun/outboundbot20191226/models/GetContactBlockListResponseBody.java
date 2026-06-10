// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetContactBlockListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of blocked contacts.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ContactBlocklistList")
    public GetContactBlockListResponseBodyContactBlocklistList contactBlocklistList;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The unique key of the entry in the do-not-call list.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("ContactBlockListId")
        public String contactBlockListId;

        /**
         * <p>The time when the entry was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1640077685465</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The user who created the entry.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1388888888</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
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
        /**
         * <p>The data array.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("List")
        public java.util.List<GetContactBlockListResponseBodyContactBlocklistListList> list;

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
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
