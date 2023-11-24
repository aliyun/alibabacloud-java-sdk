// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageEventOperationPageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeImageEventOperationPageResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageEventOperationPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageEventOperationPageResponseBody self = new DescribeImageEventOperationPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageEventOperationPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageEventOperationPageResponseBody setData(DescribeImageEventOperationPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageEventOperationPageResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageEventOperationPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImageEventOperationPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageEventOperationPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageEventOperationPageResponseBodyDataList extends TeaModel {
        /**
         * <p>The rule conditions. The value is in the JSON format. Valid values of keys:</p>
         * <br>
         * <p>*   **condition**: the matching condition.</p>
         * <p>*   **type**: the matching type.</p>
         * <p>*   **value**: the matching value.</p>
         */
        @NameInMap("Conditions")
        public String conditions;

        /**
         * <p>The keyword of the alert item.</p>
         */
        @NameInMap("EventKey")
        public String eventKey;

        /**
         * <p>The name of the alert item.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The alert type.</p>
         * <br>
         * <p>*   Only **sensitiveFile** may be returned.</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The primary key of the alert handling rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The operation code.</p>
         * <br>
         * <p>*   Only **whitelist** may be returned, which means that the alert item is added to the whitelist.</p>
         */
        @NameInMap("OperationCode")
        public String operationCode;

        /**
         * <p>The application scope of the rule. The value is in the JSON format. Valid values of keys:</p>
         * <br>
         * <p>*   **type**</p>
         * <p>*   **value**</p>
         */
        @NameInMap("Scenarios")
        public String scenarios;

        public static DescribeImageEventOperationPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageEventOperationPageResponseBodyDataList self = new DescribeImageEventOperationPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeImageEventOperationPageResponseBodyDataList setConditions(String conditions) {
            this.conditions = conditions;
            return this;
        }
        public String getConditions() {
            return this.conditions;
        }

        public DescribeImageEventOperationPageResponseBodyDataList setEventKey(String eventKey) {
            this.eventKey = eventKey;
            return this;
        }
        public String getEventKey() {
            return this.eventKey;
        }

        public DescribeImageEventOperationPageResponseBodyDataList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeImageEventOperationPageResponseBodyDataList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeImageEventOperationPageResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeImageEventOperationPageResponseBodyDataList setOperationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }
        public String getOperationCode() {
            return this.operationCode;
        }

        public DescribeImageEventOperationPageResponseBodyDataList setScenarios(String scenarios) {
            this.scenarios = scenarios;
            return this;
        }
        public String getScenarios() {
            return this.scenarios;
        }

    }

    public static class DescribeImageEventOperationPageResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageEventOperationPageResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageEventOperationPageResponseBodyDataPageInfo self = new DescribeImageEventOperationPageResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageEventOperationPageResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageEventOperationPageResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageEventOperationPageResponseBodyDataPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeImageEventOperationPageResponseBodyData extends TeaModel {
        /**
         * <p>The alert handling rules.</p>
         */
        @NameInMap("List")
        public java.util.List<DescribeImageEventOperationPageResponseBodyDataList> list;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public DescribeImageEventOperationPageResponseBodyDataPageInfo pageInfo;

        public static DescribeImageEventOperationPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageEventOperationPageResponseBodyData self = new DescribeImageEventOperationPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageEventOperationPageResponseBodyData setList(java.util.List<DescribeImageEventOperationPageResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeImageEventOperationPageResponseBodyDataList> getList() {
            return this.list;
        }

        public DescribeImageEventOperationPageResponseBodyData setPageInfo(DescribeImageEventOperationPageResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeImageEventOperationPageResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
