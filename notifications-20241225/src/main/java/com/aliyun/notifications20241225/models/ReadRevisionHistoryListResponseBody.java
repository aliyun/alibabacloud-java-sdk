// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadRevisionHistoryListResponseBody extends TeaModel {
    /**
     * <p>The error code returned by the system. For more information, see error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The execution result.</p>
     */
    @NameInMap("Data")
    public ReadRevisionHistoryListResponseBodyData data;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>2xx</p>
     */
    @NameInMap("HttpCode")
    public Integer httpCode;

    /**
     * <p>The message returned when the call failed.</p>
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
     * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadRevisionHistoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadRevisionHistoryListResponseBody self = new ReadRevisionHistoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadRevisionHistoryListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadRevisionHistoryListResponseBody setData(ReadRevisionHistoryListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadRevisionHistoryListResponseBodyData getData() {
        return this.data;
    }

    public ReadRevisionHistoryListResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ReadRevisionHistoryListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadRevisionHistoryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadRevisionHistoryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadRevisionHistoryListResponseBodyDataRowsPageSpec extends TeaModel {
        /**
         * <p>The maximum number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page of data.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAT0x7j2M1Og+SpZ8n4WEjfo=</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ReadRevisionHistoryListResponseBodyDataRowsPageSpec build(java.util.Map<String, ?> map) throws Exception {
            ReadRevisionHistoryListResponseBodyDataRowsPageSpec self = new ReadRevisionHistoryListResponseBodyDataRowsPageSpec();
            return TeaModel.build(map, self);
        }

        public ReadRevisionHistoryListResponseBodyDataRowsPageSpec setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ReadRevisionHistoryListResponseBodyDataRowsPageSpec setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

    public static class ReadRevisionHistoryListResponseBodyDataRows extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1305851476425884</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The event type code.</p>
         * 
         * <strong>example:</strong>
         * <p>prod_edu_content</p>
         */
        @NameInMap("CategoryCode")
        public String categoryCode;

        /**
         * <p>The channel group.</p>
         * 
         * <strong>example:</strong>
         * <p>base</p>
         */
        @NameInMap("ChannelGroupCode")
        public String channelGroupCode;

        /**
         * <p>The modified value.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;channelType&quot;: &quot;sms&quot;,
         *         &quot;checkedState&quot;: &quot;YES&quot;
         *     },
         *     {
         *         &quot;channelType&quot;: &quot;pmsg&quot;,
         *         &quot;checkedState&quot;: &quot;NO&quot;
         *     },
         *     {
         *         &quot;channelType&quot;: &quot;email&quot;,
         *         &quot;checkedState&quot;: &quot;NO&quot;
         *     }
         * ]</p>
         */
        @NameInMap("NewValue")
        public String newValue;

        /**
         * <p>The revision item code. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>receive_channel</p>
         */
        @NameInMap("OperationItemCode")
        public String operationItemCode;

        /**
         * <p>The revision item name.</p>
         * 
         * <strong>example:</strong>
         * <p>Reception channel</p>
         */
        @NameInMap("OperationItemName")
        public String operationItemName;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1743583672981</p>
         */
        @NameInMap("OperationTimestamp")
        public Long operationTimestamp;

        /**
         * <p>The IP address of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("OperatorIp")
        public String operatorIp;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>1662077279821892</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The UID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>1062132414049864</p>
         */
        @NameInMap("OperatorUid")
        public Long operatorUid;

        /**
         * <p>The original value.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;channelType&quot;: &quot;sms&quot;,
         *         &quot;checkedState&quot;: &quot;NO&quot;
         *     },
         *     {
         *         &quot;channelType&quot;: &quot;pmsg&quot;,
         *         &quot;checkedState&quot;: &quot;NO&quot;
         *     },
         *     {
         *         &quot;channelType&quot;: &quot;email&quot;,
         *         &quot;checkedState&quot;: &quot;NO&quot;
         *     }
         * ]</p>
         */
        @NameInMap("OriginalValue")
        public String originalValue;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageSpec")
        public ReadRevisionHistoryListResponseBodyDataRowsPageSpec pageSpec;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        public static ReadRevisionHistoryListResponseBodyDataRows build(java.util.Map<String, ?> map) throws Exception {
            ReadRevisionHistoryListResponseBodyDataRows self = new ReadRevisionHistoryListResponseBodyDataRows();
            return TeaModel.build(map, self);
        }

        public ReadRevisionHistoryListResponseBodyDataRows setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setCategoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public String getCategoryCode() {
            return this.categoryCode;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setChannelGroupCode(String channelGroupCode) {
            this.channelGroupCode = channelGroupCode;
            return this;
        }
        public String getChannelGroupCode() {
            return this.channelGroupCode;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setOperationItemCode(String operationItemCode) {
            this.operationItemCode = operationItemCode;
            return this;
        }
        public String getOperationItemCode() {
            return this.operationItemCode;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setOperationItemName(String operationItemName) {
            this.operationItemName = operationItemName;
            return this;
        }
        public String getOperationItemName() {
            return this.operationItemName;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setOperationTimestamp(Long operationTimestamp) {
            this.operationTimestamp = operationTimestamp;
            return this;
        }
        public Long getOperationTimestamp() {
            return this.operationTimestamp;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setOperatorIp(String operatorIp) {
            this.operatorIp = operatorIp;
            return this;
        }
        public String getOperatorIp() {
            return this.operatorIp;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setOperatorUid(Long operatorUid) {
            this.operatorUid = operatorUid;
            return this;
        }
        public Long getOperatorUid() {
            return this.operatorUid;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setOriginalValue(String originalValue) {
            this.originalValue = originalValue;
            return this;
        }
        public String getOriginalValue() {
            return this.originalValue;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setPageSpec(ReadRevisionHistoryListResponseBodyDataRowsPageSpec pageSpec) {
            this.pageSpec = pageSpec;
            return this;
        }
        public ReadRevisionHistoryListResponseBodyDataRowsPageSpec getPageSpec() {
            return this.pageSpec;
        }

        public ReadRevisionHistoryListResponseBodyDataRows setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

    }

    public static class ReadRevisionHistoryListResponseBodyData extends TeaModel {
        /**
         * <p>The maximum number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page of data.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAT0x7j2M1Og+SpZ8n4WEjfo=</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>A single row of returned data.</p>
         */
        @NameInMap("Rows")
        public java.util.List<ReadRevisionHistoryListResponseBodyDataRows> rows;

        /**
         * <p>The total number of messages in the category.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ReadRevisionHistoryListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadRevisionHistoryListResponseBodyData self = new ReadRevisionHistoryListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadRevisionHistoryListResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ReadRevisionHistoryListResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ReadRevisionHistoryListResponseBodyData setRows(java.util.List<ReadRevisionHistoryListResponseBodyDataRows> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<ReadRevisionHistoryListResponseBodyDataRows> getRows() {
            return this.rows;
        }

        public ReadRevisionHistoryListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
