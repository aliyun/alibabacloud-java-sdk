// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeStacksRequest extends TeaModel {
    @NameInMap("RecommendedOnly")
    public Boolean recommendedOnly;

    @NameInMap("CategoryName")
    public String categoryName;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeStacksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStacksRequest self = new DescribeStacksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStacksRequest setRecommendedOnly(Boolean recommendedOnly) {
        this.recommendedOnly = recommendedOnly;
        return this;
    }
    public Boolean getRecommendedOnly() {
        return this.recommendedOnly;
    }

    public DescribeStacksRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public DescribeStacksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStacksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStacksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
