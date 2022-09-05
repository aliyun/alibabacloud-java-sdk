// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationTemplatesRequest extends TeaModel {
    @NameInMap("Dimensions")
    public java.util.List<ListQuotaApplicationTemplatesRequestDimensions> dimensions;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

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

    public static class ListQuotaApplicationTemplatesRequestDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

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
