// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsForTemplateRequest extends TeaModel {
    /**
     * <p>The UTC time when the quota application ends.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-22T16:00:00Z</p>
     */
    @NameInMap("ApplyEndTime")
    public String applyEndTime;

    /**
     * <p>The UTC time when the quota application starts.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-22T16:00:00Z</p>
     */
    @NameInMap("ApplyStartTime")
    public String applyStartTime;

    /**
     * <p>The ID of the quota application batch.</p>
     * 
     * <strong>example:</strong>
     * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
     */
    @NameInMap("BatchQuotaApplicationId")
    public String batchQuotaApplicationId;

    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <p>Valid values: 1 to 100. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which you want to start the query.</p>
     * <blockquote>
     * <p> An empty value indicates that the query starts from the beginning.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p> To query the abbreviation of an Alibaba Cloud service name, call the <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a> operation and check the value of <code>ProductCode</code> in the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs-spec</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.2xlarge</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota type. Valid values:</p>
     * <ul>
     * <li>CommonQuota: general quota</li>
     * <li>FlowControl: API rate limit</li>
     * <li>WhiteListLabel: privilege</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
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
