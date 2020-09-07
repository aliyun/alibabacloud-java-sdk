// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByExpireTimeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("proxyId")
    public String proxyId;

    @NameInMap("ExpirePeriod")
    public Integer expirePeriod;

    @NameInMap("Expired")
    public Boolean expired;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Tags")
    public String tags;

    public static DescribeDBInstancesByExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByExpireTimeRequest self = new DescribeDBInstancesByExpireTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesByExpireTimeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesByExpireTimeRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public DescribeDBInstancesByExpireTimeRequest setExpirePeriod(Integer expirePeriod) {
        this.expirePeriod = expirePeriod;
        return this;
    }
    public Integer getExpirePeriod() {
        return this.expirePeriod;
    }

    public DescribeDBInstancesByExpireTimeRequest setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public DescribeDBInstancesByExpireTimeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesByExpireTimeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesByExpireTimeRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
