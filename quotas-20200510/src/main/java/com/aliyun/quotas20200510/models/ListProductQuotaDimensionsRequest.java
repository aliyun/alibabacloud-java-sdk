// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotaDimensionsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for this query.</p>
     * <p>Valid values: 1 to 200. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that specifies the starting position of the query. If you leave this parameter empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviated name of the cloud service.</p>
     * <blockquote>
     * <p>For more information about how to obtain the abbreviated name of a cloud service, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disk</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota category. Valid values:</p>
     * <ul>
     * <li><p>FlowControl: API rate limits.</p>
     * </li>
     * <li><p>CommonQuota: general quotas. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Privileges (WhiteListLabel) do not have quota dimensions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
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
