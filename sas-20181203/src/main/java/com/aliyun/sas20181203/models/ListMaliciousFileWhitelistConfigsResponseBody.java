// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMaliciousFileWhitelistConfigsResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The alert whitelist rules of sensitive files that are detected by using the agentless detection feature.</p>
     */
    @NameInMap("List")
    public java.util.List<ListMaliciousFileWhitelistConfigsResponseBodyList> list;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListMaliciousFileWhitelistConfigsResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The number of the assets on which the rule takes effect.</p>
         * <blockquote>
         * <p> The value of this parameter is returned only if the value of TargetType is SELECTION_KEY.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The name of the alert.</p>
         * <ul>
         * <li>The value is fixed as ALL, which indicates all alert types.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The field that is used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>fileMd5</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The value of the field that is used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>b2cf9747ee49d8d9b105cf16e078cc16</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1691719662000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the rule was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1691719662000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The logical operator of the whitelist rule.</p>
         * <ul>
         * <li>The value is fixed as strEqual, which indicates the equality operator (=).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>strEqual</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The feature to which this operation belongs.</p>
         * <ul>
         * <li>The value is fixed as agentless, which indicates the agentless detection feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentless</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The type of the assets on which the rule takes effect. Valid values:</p>
         * <ul>
         * <li>ALL: all assets</li>
         * <li>SELECTION_KEY: selected assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The assets on which the rule takes effect. Valid values:</p>
         * <ul>
         * <li>ALL: all assets</li>
         * <li>Others: selected assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
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
         * <p>29</p>
         */
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
