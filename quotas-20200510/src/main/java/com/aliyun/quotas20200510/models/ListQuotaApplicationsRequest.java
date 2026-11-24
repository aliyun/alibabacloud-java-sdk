// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsRequest extends TeaModel {
    /**
     * <p>The quota dimensions.
     * The properties of the quota item. The combination of dimensions and the quota ID (QuotaActionCode) uniquely identifies a quota item.</p>
     * <blockquote>
     * <p>The dimensions are required for some cloud services. You can call the <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> operation to query the quota dimensions supported by a cloud service. The Requisite response parameter indicates whether a dimension is required.</p>
     * </blockquote>
     */
    @NameInMap("Dimensions")
    public java.util.List<ListQuotaApplicationsRequestDimensions> dimensions;

    /**
     * <p>The search keyword for quota increase applications.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The maximum number of entries to return for the current query.</p>
     * <p>Valid values: 1 to 200. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that specifies the start position of the query. An empty value indicates that the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>csk</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>q_i5uzm3</p>
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
     * <li><p>Withdrawn: Withdrawn.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Agree</p>
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
         * <p>The key of the quota dimension.</p>
         * <blockquote>
         * <p>Dimensions.N.Key and Dimensions.N.Value must be specified at the same time. The value range of N depends on the number of dimensions supported by the corresponding cloud service. You can call the <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> operation to query the quota dimensions supported by the cloud service. The length of the returned array is the value of N.</p>
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
         * <p>Dimensions.N.Key and Dimensions.N.Value must be specified at the same time. The value range of N depends on the number of dimensions supported by the corresponding cloud service. You can call the <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> operation to query the quota dimensions supported by the cloud service. The length of the returned array is the value of N.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
