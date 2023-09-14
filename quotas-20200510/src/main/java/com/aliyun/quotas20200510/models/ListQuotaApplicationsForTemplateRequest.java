// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsForTemplateRequest extends TeaModel {
    @NameInMap("ApplyEndTime")
    public String applyEndTime;

    @NameInMap("ApplyStartTime")
    public String applyStartTime;

    @NameInMap("BatchQuotaApplicationId")
    public String batchQuotaApplicationId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

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
