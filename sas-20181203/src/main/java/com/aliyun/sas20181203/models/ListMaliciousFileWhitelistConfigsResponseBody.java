// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMaliciousFileWhitelistConfigsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("List")
    public java.util.List<ListMaliciousFileWhitelistConfigsResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public ListMaliciousFileWhitelistConfigsResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMaliciousFileWhitelistConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMaliciousFileWhitelistConfigsResponseBody self = new ListMaliciousFileWhitelistConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMaliciousFileWhitelistConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMaliciousFileWhitelistConfigsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMaliciousFileWhitelistConfigsResponseBody setList(java.util.List<ListMaliciousFileWhitelistConfigsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListMaliciousFileWhitelistConfigsResponseBodyList> getList() {
        return this.list;
    }

    public ListMaliciousFileWhitelistConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMaliciousFileWhitelistConfigsResponseBody setPageInfo(ListMaliciousFileWhitelistConfigsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListMaliciousFileWhitelistConfigsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListMaliciousFileWhitelistConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMaliciousFileWhitelistConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMaliciousFileWhitelistConfigsResponseBodyList extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("Field")
        public String field;

        @NameInMap("FieldValue")
        public String fieldValue;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Source")
        public String source;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TargetValue")
        public String targetValue;

        public static ListMaliciousFileWhitelistConfigsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListMaliciousFileWhitelistConfigsResponseBodyList self = new ListMaliciousFileWhitelistConfigsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyList setTargetValue(String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public String getTargetValue() {
            return this.targetValue;
        }

    }

    public static class ListMaliciousFileWhitelistConfigsResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMaliciousFileWhitelistConfigsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMaliciousFileWhitelistConfigsResponseBodyPageInfo self = new ListMaliciousFileWhitelistConfigsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMaliciousFileWhitelistConfigsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
