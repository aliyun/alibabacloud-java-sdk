// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationTemplatesRequest extends TeaModel {
    /**
     * <p>The quota dimensions.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<ListQuotaApplicationTemplatesRequestDimensions> dimensions;

    /**
     * <p>The ID of the quota item.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The maximum number of records that can be returned for the query. Valid values: 1 to 100. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which you want to start the query.</p>
     * <blockquote>
     * <p>If you leave this parameter empty, the query starts from the beginning.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p> To query the abbreviation of an Alibaba Cloud service name, call the <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a> operation and check the value of <code>ProductCode</code> in the response.</p>
     * </blockquote>
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
     * <p>The type of the quota. Valid values:</p>
     * <ul>
     * <li>CommonQuota: general quota</li>
     * <li>WhiteListLabel: privilege</li>
     * <li>FlowControl: API rate limit</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
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
        /**
         * <p>The key of the dimension.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         * </li>
         * <li><p>You must specify both Key and Value for each quota dimension.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the dimension.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         * </li>
         * <li><p>You must specify both Key and Value for each quota dimension.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
