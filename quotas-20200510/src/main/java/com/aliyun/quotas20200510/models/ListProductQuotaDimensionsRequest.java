// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotaDimensionsRequest extends TeaModel {
    // The maximum number of records that you want to return for the query.
    // 
    // Valid values: 1 to 200. Default value: 30.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that marks the position where you want to start the query. An empty value indicates that the query starts from the beginning.
    @NameInMap("NextToken")
    public String nextToken;

    // The abbreviation of the cloud service name.
    // 
    // >  For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
    @NameInMap("ProductCode")
    public String productCode;

    // The type of the quota. Valid values:
    // 
    // *   FlowControl: API rate limit
    // *   CommonQuota: general quota
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    public static ListProductQuotaDimensionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductQuotaDimensionsRequest self = new ListProductQuotaDimensionsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductQuotaDimensionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductQuotaDimensionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductQuotaDimensionsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListProductQuotaDimensionsRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

}
