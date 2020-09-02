// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpGroupsRequest extends TeaModel {
    @NameInMap("RouterId")
    public String routerId;

    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeBgpGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpGroupsRequest self = new DescribeBgpGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBgpGroupsRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public DescribeBgpGroupsRequest setBgpGroupId(String bgpGroupId) {
        this.bgpGroupId = bgpGroupId;
        return this;
    }
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    public DescribeBgpGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBgpGroupsRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeBgpGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBgpGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
