// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotasRequest extends TeaModel {
    // The quota dimensions.
    @NameInMap("Dimensions")
    public java.util.List<ListProductQuotasRequestDimensions> dimensions;

    // The code of the dimension group.
    @NameInMap("GroupCode")
    public String groupCode;

    // The keyword that you want to use to search for the quotas.
    @NameInMap("KeyWord")
    public String keyWord;

    // The maximum number of records that can be returned for the query.
    // 
    // Valid values: 1 to 100. Default value: 30.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that marks the position from which you want to start the query. If you leave this parameter empty, the query starts from the beginning.
    @NameInMap("NextToken")
    public String nextToken;

    // The abbreviation of the Alibaba Cloud service name.
    // 
    // > For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
    @NameInMap("ProductCode")
    public String productCode;

    // The ID of the quota.
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    // The type of the quota. Valid values:
    // 
    // *   CommonQuota: general quota
    // *   FlowControl: API rate limit
    // *   WhiteListLabel: whitelist quota
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    // The field based on which you want to sort the returned records. This parameter is available only for quotas that belong to ECS Quotas by Instance Type. Valid values:
    // 
    // *   TIME: The returned records are sorted by the last update time.
    // *   TOTAL: The returned records are sorted by the usage of the total quota.
    // *   RESERVED: The returned records are sorted by the usage of the reserved quota.
    @NameInMap("SortField")
    public String sortField;

    // The order in which you want to sort the returned records. This parameter is available only for quotas that belong to ECS Quotas by Instance Type. Valid values:
    // 
    // *   Ascending: ascending order
    // *   Descending: descending order
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
        // The key of the dimension.
        // 
        // > The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
        @NameInMap("Key")
        public String key;

        // The value of the dimension.
        // 
        // > The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
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
