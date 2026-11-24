// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsDetailForTemplateRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account that submitted the quota increase application.</p>
     * 
     * <strong>example:</strong>
     * <p>135048337611****</p>
     */
    @NameInMap("AliyunUid")
    public String aliyunUid;

    /**
     * <p>The ID of the batch quota application.</p>
     * 
     * <strong>example:</strong>
     * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
     */
    @NameInMap("BatchQuotaApplicationId")
    public String batchQuotaApplicationId;

    /**
     * <p>The maximum number of entries to return for the current query.</p>
     * <p>Valid values: 1 to 100. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the starting position of the query.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the query starts from the beginning.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the cloud service name.</p>
     * <blockquote>
     * <p>For more information about how to obtain the abbreviation of a cloud service name, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c5.large</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota type. Valid values:</p>
     * <ul>
     * <li>CommonQuota: General quota.</li>
     * <li>FlowControl: API rate limit.</li>
     * <li>WhiteListLabel: Privilege.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <p>The approval status of the quota increase application. Valid values:</p>
     * <ul>
     * <li><p>Disagree: Rejected.</p>
     * </li>
     * <li><p>Agree: Approved.</p>
     * </li>
     * <li><p>Process: Under review.</p>
     * </li>
     * <li><p>Cancel: Closed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Agree</p>
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
