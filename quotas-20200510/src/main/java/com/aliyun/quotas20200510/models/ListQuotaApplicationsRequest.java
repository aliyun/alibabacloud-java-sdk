// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsRequest extends TeaModel {
    @NameInMap("Dimensions")
    public java.util.List<ListQuotaApplicationsRequestDimensions> dimensions;

    // The keyword that you want to use to search for the application.
    @NameInMap("KeyWord")
    public String keyWord;

    // The maximum number of records that you want to return for the query.
    // 
    // Valid values: 1 to 200. Default value: 30.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that marks the position from which you want to start the query. An empty value indicates that the query starts from the beginning.
    @NameInMap("NextToken")
    public String nextToken;

    // The abbreviation of the cloud service name.
    // 
    // >  For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
    @NameInMap("ProductCode")
    public String productCode;

    // The ID of the quota.
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    // The type of the quota. Valid values:
    // 
    // *   FlowControl: API rate limit
    // *   CommonQuota: general quota
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    // The status of the application. Valid values:
    // 
    // *   Disagree: The application is rejected.
    // *   Agree: The application is approved.
    // *   Process: The application is pending approval.
    // *   Cancel: The application is closed.
    @NameInMap("Status")
    public String status;

    public static ListQuotaApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationsRequest self = new ListQuotaApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationsRequest setDimensions(java.util.List<ListQuotaApplicationsRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<ListQuotaApplicationsRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public ListQuotaApplicationsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListQuotaApplicationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaApplicationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaApplicationsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListQuotaApplicationsRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ListQuotaApplicationsRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public ListQuotaApplicationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListQuotaApplicationsRequestDimensions extends TeaModel {
        // The dimension keys.
        // 
        // >  The value range of N varies based on the number of dimensions that are supported by the related cloud service.
        @NameInMap("Key")
        public String key;

        // The dimension values.
        // 
        // >  The value range of N varies based on the number of dimensions that are supported by the related cloud service.
        @NameInMap("Value")
        public String value;

        public static ListQuotaApplicationsRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationsRequestDimensions self = new ListQuotaApplicationsRequestDimensions();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationsRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListQuotaApplicationsRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
