// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeVnetsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("VnetId")
    public java.util.List<String> vnetId;

    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    public static DescribeVnetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVnetsRequest self = new DescribeVnetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVnetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVnetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVnetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVnetsRequest setVnetId(java.util.List<String> vnetId) {
        this.vnetId = vnetId;
        return this;
    }
    public java.util.List<String> getVnetId() {
        return this.vnetId;
    }

    public DescribeVnetsRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

}
