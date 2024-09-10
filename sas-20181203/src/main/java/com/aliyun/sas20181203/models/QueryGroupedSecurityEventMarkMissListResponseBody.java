// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupedSecurityEventMarkMissListResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code <strong>200</strong> indicates that the request is successful. Other status codes indicate that the request fails. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>An array that consists of the whitelist rules.</p>
     */
    @NameInMap("List")
    public java.util.List<QueryGroupedSecurityEventMarkMissListResponseBodyList> list;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>There was an error with your request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public QueryGroupedSecurityEventMarkMissListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>965F9282-D403-4FA2-B1B9-10F62DC719BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>31412647</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The handling method. Valid values:</p>
         * <ul>
         * <li><strong>auto_add_white</strong>: Automatically Added to Whitelist</li>
         * <li><strong>defense_not_notification</strong>: Defense Without Notification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto_add_white</p>
         */
        @NameInMap("DisposalWay")
        public String disposalWay;

        /**
         * <p>The name of the alert event. The value indicates a subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>Login with unusual location</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The name of the alert event. The value indicates a type.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_location</p>
         */
        @NameInMap("EventNameOriginal")
        public String eventNameOriginal;

        /**
         * <p>The subtype of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Unusual Logon</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The type of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Unusual logon</p>
         */
        @NameInMap("EventTypeOriginal")
        public String eventTypeOriginal;

        /**
         * <p>The field that is used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The value of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>The alias of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>Logon Time</p>
         */
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        /**
         * <p>The operator. Valid values:</p>
         * <ul>
         * <li><strong>contains</strong>: contains</li>
         * <li><strong>notContains</strong>: does not contain</li>
         * <li><strong>strEqual</strong>: equals</li>
         * <li><strong>strNotEqual</strong>: does not equal</li>
         * <li><strong>regex</strong>: regular expression</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("Operate")
        public String operate;

        /**
         * <p>The UUIDs of assets. Multiple UUIDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>6985b88c-eb19-4d27-98ad-e4a42312****,5721d503-9b04-4243-89ca-1fb8ca5e****,db2678c3-10e3-4a20-92f1-265f6****</p>
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
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
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
