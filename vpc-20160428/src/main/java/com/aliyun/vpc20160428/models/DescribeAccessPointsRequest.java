// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Name")
    public String name;

    @NameInMap("HostOperator")
    public String hostOperator;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Filter")
    public java.util.List<DescribeAccessPointsRequestFilter> filter;

    public static DescribeAccessPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointsRequest self = new DescribeAccessPointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAccessPointsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAccessPointsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAccessPointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAccessPointsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeAccessPointsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAccessPointsRequest setHostOperator(String hostOperator) {
        this.hostOperator = hostOperator;
        return this;
    }
    public String getHostOperator() {
        return this.hostOperator;
    }

    public DescribeAccessPointsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessPointsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessPointsRequest setFilter(java.util.List<DescribeAccessPointsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeAccessPointsRequestFilter> getFilter() {
        return this.filter;
    }

    public static class DescribeAccessPointsRequestFilter extends TeaModel {
        public static DescribeAccessPointsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsRequestFilter self = new DescribeAccessPointsRequestFilter();
            return TeaModel.build(map, self);
        }

    }

}
