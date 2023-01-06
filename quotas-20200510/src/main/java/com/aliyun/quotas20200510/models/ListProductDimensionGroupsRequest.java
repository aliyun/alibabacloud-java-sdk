// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductDimensionGroupsRequest extends TeaModel {
    // The maximum number of records that can be returned for the query.
    // 
    // Valid values: 1 to 200. Default value: 30.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that marks the position from which you want to start the query. If you leave this parameter empty, the query starts from the beginning.
    @NameInMap("NextToken")
    public String nextToken;

    // The service code.
    // 
    // >  For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
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
