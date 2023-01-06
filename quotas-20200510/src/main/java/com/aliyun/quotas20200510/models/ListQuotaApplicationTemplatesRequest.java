// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationTemplatesRequest extends TeaModel {
    // The quota dimensions.
    @NameInMap("Dimensions")
    public java.util.List<ListQuotaApplicationTemplatesRequestDimensions> dimensions;

    // The ID of the quota item.
    @NameInMap("Id")
    public String id;

    // The maximum number of records that can be returned for the query. Valid values: 1 to 100. Default value: 30.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that marks the position from which you want to start the query.
    // 
    // > An empty value indicates that the query starts from the beginning.
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

    // 配额种类。取值：
    // - CommonQuota：通用配额。
    // - WhiteListLabel：权益配额。
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    public static ListQuotaApplicationTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationTemplatesRequest self = new ListQuotaApplicationTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationTemplatesRequest setDimensions(java.util.List<ListQuotaApplicationTemplatesRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<ListQuotaApplicationTemplatesRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public ListQuotaApplicationTemplatesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListQuotaApplicationTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaApplicationTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaApplicationTemplatesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListQuotaApplicationTemplatesRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ListQuotaApplicationTemplatesRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public static class ListQuotaApplicationTemplatesRequestDimensions extends TeaModel {
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

        public static ListQuotaApplicationTemplatesRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationTemplatesRequestDimensions self = new ListQuotaApplicationTemplatesRequestDimensions();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationTemplatesRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListQuotaApplicationTemplatesRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
