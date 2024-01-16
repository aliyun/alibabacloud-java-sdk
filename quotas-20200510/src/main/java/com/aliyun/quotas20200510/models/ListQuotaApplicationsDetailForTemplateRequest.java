// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsDetailForTemplateRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account that is used to submit the quota increase application.</p>
     */
    @NameInMap("AliyunUid")
    public String aliyunUid;

    /**
     * <p>The ID of the quota application batch.</p>
     */
    @NameInMap("BatchQuotaApplicationId")
    public String batchQuotaApplicationId;

    /**
     * <p>The maximum number of records that can be returned for the query.</p>
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

    /**
     * <p>The approval status of the quota increase application. Valid values:</p>
     * <br>
     * <p>*   Disagree: The application is rejected.</p>
     * <p>*   Agree: The application is approved.</p>
     * <p>*   Process: The application is pending approval.</p>
     * <p>*   Cancel: The application is canceled.</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListQuotaApplicationsDetailForTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationsDetailForTemplateRequest self = new ListQuotaApplicationsDetailForTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationsDetailForTemplateRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public ListQuotaApplicationsDetailForTemplateRequest setBatchQuotaApplicationId(String batchQuotaApplicationId) {
        this.batchQuotaApplicationId = batchQuotaApplicationId;
        return this;
    }
    public String getBatchQuotaApplicationId() {
        return this.batchQuotaApplicationId;
    }

    public ListQuotaApplicationsDetailForTemplateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaApplicationsDetailForTemplateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaApplicationsDetailForTemplateRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListQuotaApplicationsDetailForTemplateRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ListQuotaApplicationsDetailForTemplateRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public ListQuotaApplicationsDetailForTemplateRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
