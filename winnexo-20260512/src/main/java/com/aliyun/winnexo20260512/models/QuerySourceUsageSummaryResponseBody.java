// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySourceUsageSummaryResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of retrieval recalls.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("retrievalCount")
    public Long retrievalCount;

    /**
     * <p>The deduplicated count of sources that have retrieval events.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("retrievedSourceCount")
    public Long retrievedSourceCount;

    /**
     * <p>The number of rows in the source data.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("sourceCount")
    public Long sourceCount;

    /**
     * <p>The number of times the source has been used in agents.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("usageCount")
    public Long usageCount;

    /**
     * <p>The deduplicated count of sources that have usage events.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("usedSourceCount")
    public Long usedSourceCount;

    public static QuerySourceUsageSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySourceUsageSummaryResponseBody self = new QuerySourceUsageSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySourceUsageSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySourceUsageSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySourceUsageSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySourceUsageSummaryResponseBody setRetrievalCount(Long retrievalCount) {
        this.retrievalCount = retrievalCount;
        return this;
    }
    public Long getRetrievalCount() {
        return this.retrievalCount;
    }

    public QuerySourceUsageSummaryResponseBody setRetrievedSourceCount(Long retrievedSourceCount) {
        this.retrievedSourceCount = retrievedSourceCount;
        return this;
    }
    public Long getRetrievedSourceCount() {
        return this.retrievedSourceCount;
    }

    public QuerySourceUsageSummaryResponseBody setSourceCount(Long sourceCount) {
        this.sourceCount = sourceCount;
        return this;
    }
    public Long getSourceCount() {
        return this.sourceCount;
    }

    public QuerySourceUsageSummaryResponseBody setUsageCount(Long usageCount) {
        this.usageCount = usageCount;
        return this;
    }
    public Long getUsageCount() {
        return this.usageCount;
    }

    public QuerySourceUsageSummaryResponseBody setUsedSourceCount(Long usedSourceCount) {
        this.usedSourceCount = usedSourceCount;
        return this;
    }
    public Long getUsedSourceCount() {
        return this.usedSourceCount;
    }

}
