// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the Simple Database Service instances. The value can be a JSON array that consists of up to 100 Simple Database Service instance IDs. Separate multiple instance IDs with commas (,).</p>
     */
    @NameInMap("DatabaseInstanceIds")
    public String databaseInstanceIds;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the Simple Database Service instances.</p>
     */
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
