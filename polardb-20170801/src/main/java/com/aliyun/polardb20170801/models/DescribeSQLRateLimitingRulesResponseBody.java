// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLRateLimitingRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeSQLRateLimitingRulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>nextToken</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh0vHYf39hc0J5qELgsazkBk</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>22C0ACF0-DD29-4B67-9190-B7A48C******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLRateLimitingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLRateLimitingRulesResponseBody self = new DescribeSQLRateLimitingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLRateLimitingRulesResponseBody setData(DescribeSQLRateLimitingRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSQLRateLimitingRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeSQLRateLimitingRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSQLRateLimitingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSQLRateLimitingRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSQLRateLimitingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSQLRateLimitingRulesResponseBodyData extends TeaModel {
        @NameInMap("RuleList")
        public java.util.List<String> ruleList;

        public static DescribeSQLRateLimitingRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLRateLimitingRulesResponseBodyData self = new DescribeSQLRateLimitingRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSQLRateLimitingRulesResponseBodyData setRuleList(java.util.List<String> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<String> getRuleList() {
            return this.ruleList;
        }

    }

}
