// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotasRequest extends TeaModel {
    /**
     * <p>The quota dimensions.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<ListProductQuotasRequestDimensions> dimensions;

    /**
     * <p>The code of the dimension group.</p>
     * 
     * <strong>example:</strong>
     * <p>entconsole_w1j3ms****</p>
     */
    @NameInMap("GroupCode")
    public String groupCode;

    /**
     * <p>The search keyword for the quota.</p>
     * <blockquote>
     * <p>This parameter applies only to Elastic Computing Service server instance type quotas (ecs-spec). The search scope includes <code>QuotaName</code> and <code>QuotaActionCode</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>security</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The maximum number of entries to return in a single request.</p>
     * <p>Valid values: 1 to 100. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results.</p>
     * <ul>
     * <li>Leave this parameter empty for the first request or when no more results are available.</li>
     * <li>If more results are available, set this parameter to the NextToken value returned when you invoke the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the cloud service.</p>
     * <blockquote>
     * <p>For more information about how to obtain the abbreviation of a cloud service, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>q_security-groups</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota category.</p>
     * <p>Default value: CommonQuota.</p>
     * 
     * <strong>example:</strong>
     * <p>FlowControl</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <p>The sorting method supported by the quota.</p>
     * <blockquote>
     * <p>This parameter applies only to Elastic Computing Service server instance type quotas (ecs-spec). If no Settings are specified, it is left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TIME</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The sorting method supported by the quota.</p>
     * <blockquote>
     * <p>This parameter applies only to Elastic Computing Service server instance type quotas (ecs-spec). If no Settings are specified, it is left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Ascending</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListProductQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductQuotasRequest self = new ListProductQuotasRequest();
        return TeaModel.build(map, self);
    }

    public ListProductQuotasRequest setDimensions(java.util.List<ListProductQuotasRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<ListProductQuotasRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public ListProductQuotasRequest setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }
    public String getGroupCode() {
        return this.groupCode;
    }

    public ListProductQuotasRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListProductQuotasRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductQuotasRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductQuotasRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListProductQuotasRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ListProductQuotasRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public ListProductQuotasRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListProductQuotasRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static class ListProductQuotasRequestDimensions extends TeaModel {
        /**
         * <p>The key of the quota dimension.</p>
         * <blockquote>
         * <p>The value range of N depends on the number of dimensions supported by the corresponding cloud service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the quota dimension.</p>
         * <blockquote>
         * <p>The value range of N depends on the number of dimensions supported by the corresponding cloud service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListProductQuotasRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            ListProductQuotasRequestDimensions self = new ListProductQuotasRequestDimensions();
            return TeaModel.build(map, self);
        }

        public ListProductQuotasRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProductQuotasRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
