// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsForTemplateRequest extends TeaModel {
    /**
     * <p>The UTC time when the quota application ends.</p>
     */
    @NameInMap("ApplyEndTime")
    public String applyEndTime;

    /**
     * <p>The UTC time when the quota application starts.</p>
     */
    @NameInMap("ApplyStartTime")
    public String applyStartTime;

    /**
     * <p>The ID of the quota application batch.</p>
     */
    @NameInMap("BatchQuotaApplicationId")
    public String batchQuotaApplicationId;

    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 30.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which you want to start the query.</p>
     * <br>
     * <p>>  An empty value indicates that the query starts from the beginning.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <br>
     * <p>>  For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota type. Valid values:</p>
     * <br>
     * <p>*   CommonQuota: general quota</p>
     * <p>*   FlowControl: API rate limit</p>
     * <p>*   WhiteListLabel: privilege</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    public static ListQuotaApplicationsForTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationsForTemplateRequest self = new ListQuotaApplicationsForTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationsForTemplateRequest setApplyEndTime(String applyEndTime) {
        this.applyEndTime = applyEndTime;
        return this;
    }
    public String getApplyEndTime() {
        return this.applyEndTime;
    }

    public ListQuotaApplicationsForTemplateRequest setApplyStartTime(String applyStartTime) {
        this.applyStartTime = applyStartTime;
        return this;
    }
    public String getApplyStartTime() {
        return this.applyStartTime;
    }

    public ListQuotaApplicationsForTemplateRequest setBatchQuotaApplicationId(String batchQuotaApplicationId) {
        this.batchQuotaApplicationId = batchQuotaApplicationId;
        return this;
    }
    public String getBatchQuotaApplicationId() {
        return this.batchQuotaApplicationId;
    }

    public ListQuotaApplicationsForTemplateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaApplicationsForTemplateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaApplicationsForTemplateRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListQuotaApplicationsForTemplateRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ListQuotaApplicationsForTemplateRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

}
