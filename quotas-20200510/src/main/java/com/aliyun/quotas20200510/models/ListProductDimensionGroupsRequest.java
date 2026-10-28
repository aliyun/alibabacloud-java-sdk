// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductDimensionGroupsRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return for the query.
     * Valid values: 1 to 200. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which to start the query. If you leave this parameter empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p>For information about how to obtain the abbreviation of an Alibaba Cloud service name, see the \<code>ProductCode\\</code> parameter in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>entconsole</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static ListProductDimensionGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductDimensionGroupsRequest self = new ListProductDimensionGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductDimensionGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductDimensionGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductDimensionGroupsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
