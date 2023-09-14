// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsRequest extends TeaModel {
    /**
     * <p>The quota dimensions.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<ListQuotaApplicationsRequestDimensions> dimensions;

    /**
     * <p>The keyword that you want to use to search for the application.</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The maximum number of records that can be returned for the query.</p>
     * <br>
     * <p>Valid values: 1 to 200. Default value: 30.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which you want to start the query. If you leave this parameter empty, the query starts from the beginning.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <br>
     * <p>> For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the quota.</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The type of the quota. Valid values:</p>
     * <br>
     * <p>*   CommonQuota: general quota</p>
     * <p>*   FlowControl: API rate limit</p>
     * <p>*   WhiteListLabel: whitelist quota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <p>The status of the application. Valid values:</p>
     * <br>
     * <p>*   Disagree: rejects the application.</p>
     * <p>*   Agree: approves the application.</p>
     * <p>*   Process: reviews the application.</p>
     * <p>*   Cancel: cancels the application.</p>
     */
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
        /**
         * <p>The key of the dimension.</p>
         * <br>
         * <p>> The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the dimension.</p>
         * <br>
         * <p>> The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         */
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
