// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupedSecurityEventMarkMissListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<QueryGroupedSecurityEventMarkMissListResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("DisposalWay")
        public String disposalWay;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventNameOriginal")
        public String eventNameOriginal;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("EventTypeOriginal")
        public String eventTypeOriginal;

        @NameInMap("Field")
        public String field;

        @NameInMap("FieldValue")
        public String fieldValue;

        @NameInMap("FiledAliasName")
        public String filedAliasName;

        @NameInMap("Operate")
        public String operate;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
