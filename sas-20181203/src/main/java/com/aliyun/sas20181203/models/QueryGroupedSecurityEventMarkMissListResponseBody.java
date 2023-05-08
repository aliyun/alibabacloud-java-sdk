// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupedSecurityEventMarkMissListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The subtype of the alert event.</p>
     */
    @NameInMap("List")
    public java.util.List<QueryGroupedSecurityEventMarkMissListResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The handling method. Valid values:</p>
         * <br>
         * <p>*   **1**: Automatically Added to Whitelist</p>
         * <p>*   **2**: Defense Without Notification</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The alias of the field.</p>
         */
        @NameInMap("DisposalWay")
        public String disposalWay;

        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The handling method. Valid values:</p>
         * <br>
         * <p>*   **auto_add_white**: Automatically Added to Whitelist</p>
         * <p>*   **defense_not_notification**: Defense Without Notification</p>
         */
        @NameInMap("EventNameOriginal")
        public String eventNameOriginal;

        /**
         * <p>The condition that is used to query alert events by asset. You can specify a value of the following types:</p>
         * <br>
         * <p>*   The IP address of the asset.</p>
         * <p>*   The public IP address of the asset.</p>
         * <p>*   The private IP address of the asset.</p>
         * <p>*   The name of the asset.</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
         * <br>
         * <p>*   **zh**: Chinese</p>
         * <p>*   **en**: English</p>
         */
        @NameInMap("EventTypeOriginal")
        public String eventTypeOriginal;

        /**
         * <p>Unusual logon</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The name of the alert event. The value indicates a subtype.</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>The number of the page to return. Default value: **1**.</p>
         */
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        /**
         * <p>The number of entries returned per page. Default value: **20**.</p>
         */
        @NameInMap("Operate")
        public String operate;

        /**
         * <p>The pagination information.</p>
         */
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

        /**
         * <p>Queries whitelist rules.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>QueryGroupedSecurityEventMarkMissList</p>
         */
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
