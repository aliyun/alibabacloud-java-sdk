// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstancesRequest extends TeaModel {
    @NameInMap("DatabaseInstanceIds")
    public String databaseInstanceIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDatabaseInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseInstancesRequest self = new DescribeDatabaseInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseInstancesRequest setDatabaseInstanceIds(String databaseInstanceIds) {
        this.databaseInstanceIds = databaseInstanceIds;
        return this;
    }
    public String getDatabaseInstanceIds() {
        return this.databaseInstanceIds;
    }

    public DescribeDatabaseInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatabaseInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatabaseInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
