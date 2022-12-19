// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupedSecurityEventMarkMissListResponseBody extends TeaModel {
    // The status code returned. The status code **200** indicates that the request is successful. Other status codes indicate that the request fails. You can identify the cause of the failure based on the status code.
    @NameInMap("Code")
    public String code;

    // An array that consists of the whitelist rules.
    @NameInMap("List")
    public java.util.List<QueryGroupedSecurityEventMarkMissListResponseBodyList> list;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The pagination information.
    @NameInMap("PageInfo")
    public QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("Success")
    public Boolean success;

    public static QueryGroupedSecurityEventMarkMissListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupedSecurityEventMarkMissListResponseBody self = new QueryGroupedSecurityEventMarkMissListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGroupedSecurityEventMarkMissListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGroupedSecurityEventMarkMissListResponseBody setList(java.util.List<QueryGroupedSecurityEventMarkMissListResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryGroupedSecurityEventMarkMissListResponseBodyList> getList() {
        return this.list;
    }

    public QueryGroupedSecurityEventMarkMissListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGroupedSecurityEventMarkMissListResponseBody setPageInfo(QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public QueryGroupedSecurityEventMarkMissListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGroupedSecurityEventMarkMissListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryGroupedSecurityEventMarkMissListResponseBodyList extends TeaModel {
        // The ID of the user.
        @NameInMap("AliUid")
        public Long aliUid;

        // The handling method. Valid values:
        // 
        // *   **auto\_add_white**: Automatically Added to Whitelist
        // *   **defense\_not_notification**: Defense Without Notification
        @NameInMap("DisposalWay")
        public String disposalWay;

        // The name of the alert event. The value indicates a subtype.
        @NameInMap("EventName")
        public String eventName;

        // The name of the alert event. The value indicates a type.
        @NameInMap("EventNameOriginal")
        public String eventNameOriginal;

        // The subtype of the alert event.
        @NameInMap("EventType")
        public String eventType;

        // The type of the alert event.
        @NameInMap("EventTypeOriginal")
        public String eventTypeOriginal;

        // The field that is used in the whitelist rule.
        @NameInMap("Field")
        public String field;

        // The value of the field.
        @NameInMap("FieldValue")
        public String fieldValue;

        // The alias of the field.
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        // The operator. Valid values:
        // 
        // *   **contains**: contains
        // *   **notContains**: does not contain
        // *   **strEqual**: equals
        // *   **strNotEqual**: does not equal
        // *   **regex**: regular expression
        @NameInMap("Operate")
        public String operate;

        // The UUIDs of assets. Multiple UUIDs are separated by commas (,).
        @NameInMap("Uuids")
        public String uuids;

        public static QueryGroupedSecurityEventMarkMissListResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryGroupedSecurityEventMarkMissListResponseBodyList self = new QueryGroupedSecurityEventMarkMissListResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setDisposalWay(String disposalWay) {
            this.disposalWay = disposalWay;
            return this;
        }
        public String getDisposalWay() {
            return this.disposalWay;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setEventNameOriginal(String eventNameOriginal) {
            this.eventNameOriginal = eventNameOriginal;
            return this;
        }
        public String getEventNameOriginal() {
            return this.eventNameOriginal;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setEventTypeOriginal(String eventTypeOriginal) {
            this.eventTypeOriginal = eventTypeOriginal;
            return this;
        }
        public String getEventTypeOriginal() {
            return this.eventTypeOriginal;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setFiledAliasName(String filedAliasName) {
            this.filedAliasName = filedAliasName;
            return this;
        }
        public String getFiledAliasName() {
            return this.filedAliasName;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyList setUuids(String uuids) {
            this.uuids = uuids;
            return this;
        }
        public String getUuids() {
            return this.uuids;
        }

    }

    public static class QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo extends TeaModel {
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **20**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo self = new QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
