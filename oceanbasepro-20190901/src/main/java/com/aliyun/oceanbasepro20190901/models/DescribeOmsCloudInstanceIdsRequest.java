// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsCloudInstanceIdsRequest extends TeaModel {
    @NameInMap("CloudInstanceRegionId")
    public String cloudInstanceRegionId;

    @NameInMap("CloudInstanceType")
    public String cloudInstanceType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    public static DescribeOmsCloudInstanceIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsCloudInstanceIdsRequest self = new DescribeOmsCloudInstanceIdsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOmsCloudInstanceIdsRequest setCloudInstanceRegionId(String cloudInstanceRegionId) {
        this.cloudInstanceRegionId = cloudInstanceRegionId;
        return this;
    }
    public String getCloudInstanceRegionId() {
        return this.cloudInstanceRegionId;
    }

    public DescribeOmsCloudInstanceIdsRequest setCloudInstanceType(String cloudInstanceType) {
        this.cloudInstanceType = cloudInstanceType;
        return this;
    }
    public String getCloudInstanceType() {
        return this.cloudInstanceType;
    }

    public DescribeOmsCloudInstanceIdsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOmsCloudInstanceIdsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOmsCloudInstanceIdsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
