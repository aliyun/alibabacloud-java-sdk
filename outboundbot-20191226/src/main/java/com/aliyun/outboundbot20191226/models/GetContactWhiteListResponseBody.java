// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetContactWhiteListResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The contact list.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ContactWhitelistList")
    public GetContactWhiteListResponseBodyContactWhitelistList contactWhitelistList;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The API response message.</p>
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
        /**
         * <p>The whitelist ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("ContactWhiteListId")
        public String contactWhiteListId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1640174411848</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123</p>
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
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>John Smith</p>
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
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>13959999999</p>
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
        /**
         * <p>The contact list.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("List")
        public java.util.List<GetContactWhiteListResponseBodyContactWhitelistListList> list;

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
