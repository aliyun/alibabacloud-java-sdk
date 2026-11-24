// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventOperationsResponseBody extends TeaModel {
    /**
     * <p>The list of event status change records, sorted in descending order by operation time.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAiEngineEventOperationsResponseBodyItems> items;

    /**
     * <p>The number of entries to return on each page during paging in a paged query. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. If a next page exists, this field returns a value.</p>
     * <blockquote>
     * <p>If this parameter returns a value, it indicates that a next page exists. You can use the returned <strong>NextToken</strong> as a request parameter to obtain the data on the next page until no value is returned, which indicates that all data is obtained.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1****-1219-019A-8B44-*****9C2C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of operation records for the event.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAiEngineEventOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventOperationsResponseBody self = new DescribeAiEngineEventOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventOperationsResponseBody setItems(java.util.List<DescribeAiEngineEventOperationsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAiEngineEventOperationsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAiEngineEventOperationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAiEngineEventOperationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAiEngineEventOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAiEngineEventOperationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAiEngineEventOperationsResponseBodyItems extends TeaModel {
        /**
         * <p>The event processing status before the modification. Valid values:</p>
         * <ul>
         * <li><strong>unhandled</strong>: Unprocessed.</li>
         * <li><strong>handling</strong>: Processing.</li>
         * <li><strong>handled</strong>: Processed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>handling</p>
         */
        @NameInMap("FromStatus")
        public String fromStatus;

        /**
         * <p>The event operation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792973400000</p>
         */
        @NameInMap("OperatedAt")
        public Long operatedAt;

        /**
         * <p>The ID of the operation record.</p>
         * 
         * <strong>example:</strong>
         * <p>op109102</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>The event processing status after the modification. Valid values:</p>
         * <ul>
         * <li><strong>unhandled</strong>: Unprocessed.</li>
         * <li><strong>handling</strong>: Processing.</li>
         * <li><strong>handled</strong>: Processed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>handled</p>
         */
        @NameInMap("ToStatus")
        public String toStatus;

        public static DescribeAiEngineEventOperationsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEventOperationsResponseBodyItems self = new DescribeAiEngineEventOperationsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEventOperationsResponseBodyItems setFromStatus(String fromStatus) {
            this.fromStatus = fromStatus;
            return this;
        }
        public String getFromStatus() {
            return this.fromStatus;
        }

        public DescribeAiEngineEventOperationsResponseBodyItems setOperatedAt(Long operatedAt) {
            this.operatedAt = operatedAt;
            return this;
        }
        public Long getOperatedAt() {
            return this.operatedAt;
        }

        public DescribeAiEngineEventOperationsResponseBodyItems setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public DescribeAiEngineEventOperationsResponseBodyItems setToStatus(String toStatus) {
            this.toStatus = toStatus;
            return this;
        }
        public String getToStatus() {
            return this.toStatus;
        }

    }

}
