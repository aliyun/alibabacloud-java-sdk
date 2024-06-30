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
     * <p>entconsole_w1j3msbo2g</p>
     */
    @NameInMap("GroupCode")
    public String groupCode;

    /**
     * <p>The keyword that you want to use to search for the quotas.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-spec</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The maximum number of records that can be returned for the query.</p>
     * <p>Valid values: 1 to 100. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which you want to start the query. If you leave this parameter empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p> To query the abbreviation of an Alibaba Cloud service name, call the <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a> operation and check the value of the <code>ProductCode</code> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
     * <p>The type of the quota. Valid values:</p>
     * <ul>
     * <li>CommonQuota (default value): general quota</li>
     * <li>FlowControl: API rate limit</li>
     * <li>WhiteListLabel: whitelist quota</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FlowControl</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <p>The field based on which you want to sort the returned records. Valid values:</p>
     * <ul>
     * <li>TIME: The returned records are sorted by the last update time.</li>
     * <li>TOTAL: The returned records are sorted by the usage of the total quota.</li>
     * <li>RESERVED: The returned records are sorted by the usage of the reserved quota.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is available only for quotas that belong to ECS Quotas by Instance Type. You can leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TIME</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The order in which you want to sort the returned records. Valid values:</p>
     * <ul>
     * <li>Ascending: ascending order</li>
     * <li>Descending: descending order</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is available only for quotas that belong to ECS Quotas by Instance Type. You can leave this parameter empty.</p>
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
         * <p>The key of the dimension.</p>
         * <blockquote>
         * <p> The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the dimension.</p>
         * <blockquote>
         * <p> The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
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
